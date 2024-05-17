SET  SOURCE_PATH=E:\src\github\stock
SET  APACHE_TOMCAT=tomcat10
SET  CURRENT_PATH=%~dp0
SET  CURRENT_FILENAME=%~nx0
SET  LC_ALL=ko_KR.UTF-8

ECHO %CURRENT_PATH% %CURRENT_FILENAME%

DATE /t
TIME /t

PUSHD %CURRENT_PATH%

CD  %SOURCE_PATH%
git stash
git clean -f
git pull ssh://git@ssh.github.com:443/andold/stock.git
git  log --pretty=format:"%%h - %%an, %%ai:%%ar : %%s" -8

DEL /Q %SOURCE_PATH%\src\main\java\kr\andold\stock\antlr\*
java -jar %SOURCE_PATH%\src\main\resources\bin\antlr-4.10.1-complete.jar -encoding UTF8 -package kr.andold.stock.antlr -visitor -o %SOURCE_PATH%\src\main\java\kr\andold\stock\antlr %SOURCE_PATH%\src\main\resources\grammar\Stock.g4
java -jar %SOURCE_PATH%\src\main\resources\bin\antlr-4.10.1-complete.jar -encoding UTF8 -package kr.andold.stock.antlr -visitor -o %SOURCE_PATH%\src\main\java\kr\andold\stock\antlr %SOURCE_PATH%\src\main\resources\grammar\Seibro.g4

ECHO "clean"
CALL gradle clean -Pprofile=home -x test

ECHO "react npm install"
CD %SOURCE_PATH%\src\main\frontend
CALL npm install
CALL npm audit fix

ECHO "build"
CD %SOURCE_PATH%
git clean -f
CALL gradle build -Pprofile=home -x test

NET  stop %APACHE_TOMCAT%

@ECHO pause 4 seconds
TIMEOUT 4

POPD
CD  doc_base
@ECHO delete files
DEL  /F /S /Q * > nul
@ECHO deploy new files
jar  -xf %SOURCE_PATH%\build\libs\stock-0.0.1-SNAPSHOT.war

CD  ..
@ECHO copy this file from new
ECHO %CURRENT_FILENAME%
COPY /Y %SOURCE_PATH%\src\main\resources-home\%CURRENT_FILENAME%


NET  start %APACHE_TOMCAT%
