@SET PROFILE=n100
@SET SOURCE_DIR=C:\src\github\stock
@SET DEPLOY_DIR=C:\deploy\stock
@SET INSTALL_SCRIPT_FILE_NAME=install-stock-%PROFILE%.bat
@SET DEPLOY_SCRIPT_FILE_NAME=deploy.bat
@SET APACHE_TOMCAT=tomcat10
@SET CURRENT_PATH=%~dp0
@SET CURRENT_FILENAME=%~nx0
@SET LC_ALL=ko_KR.UTF-8
@REM
@REM
@REM copy install script file
@REM
COPY /Y %SOURCE_DIR%\src\main\resources-%PROFILE%\%SCRIPT_FILENAME%	%DEPLOY_DIR%
@REM
@REM
@REM antlr generate source
@REM
CD %SOURCE_DIR%
DEL /Q %SOURCE_DIR%\src\main\java\kr\andold\stock\antlr\*
java -jar %SOURCE_DIR%\src\main\resources\bin\antlr-4.10.1-complete.jar -encoding UTF8 -package kr.andold.stock.antlr -visitor -o %SOURCE_DIR%\src\main\java\kr\andold\stock\antlr %SOURCE_DIR%\src\main\resources\grammar\Stock.g4
java -jar %SOURCE_DIR%\src\main\resources\bin\antlr-4.10.1-complete.jar -encoding UTF8 -package kr.andold.stock.antlr -visitor -o %SOURCE_DIR%\src\main\java\kr\andold\stock\antlr %SOURCE_DIR%\src\main\resources\grammar\KrxEtf.g4
java -jar %SOURCE_DIR%\src\main\resources\bin\antlr-4.10.1-complete.jar -encoding UTF8 -package kr.andold.stock.antlr -visitor -o %SOURCE_DIR%\src\main\java\kr\andold\stock\antlr %SOURCE_DIR%\src\main\resources\grammar\Seibro.g4
java -jar %SOURCE_DIR%\src\main\resources\bin\antlr-4.10.1-complete.jar -encoding UTF8 -package kr.andold.stock.antlr -visitor -o %SOURCE_DIR%\src\main\java\kr\andold\stock\antlr %SOURCE_DIR%\src\main\resources\grammar\SeibroEtf.g4
@REM
@REM
@REM clear
@REM
CALL gradle clean -Pprofile=%PROFILE% -x test
@REM
@REM
@REM initialize react frontend
@REM
CD %SOURCE_DIR%\src\main\frontend
CALL npm install
CALL npm audit fix --force
CALL npm install react-scripts@latest --save
@REM
@REM
@REM build
@REM
CD %SOURCE_DIR%
git clean -f
CALL gradle build -Pprofile=%PROFILE% -x test
@REM
@REM
@REM stop tomcat
@REM
NET stop %APACHE_TOMCAT%
TIMEOUT 8
NET stop %APACHE_TOMCAT%
@REM
@REM
@REM deploy
@REM
CD %DEPLOY_DIR%\doc_base
DEL /F /S /Q * > nul
jar -xf %SOURCE_DIR%\build\libs\stock-0.0.2-SNAPSHOT.war
@REM
@REM
@REM tomcat start
@REM
NET start %APACHE_TOMCAT%
