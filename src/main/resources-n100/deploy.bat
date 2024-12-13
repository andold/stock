@SET PROJECT=stock
@SET VERSION=0.0.2-SNAPSHOT
@SET PROFILE=n100
@SET SOURCE_DIR=C:\src\github\%PROJECT%
@SET DEPLOY_DIR=C:\deploy\%PROJECT%
@SET DEPLOY_SCRIPT_FILE_NAME=deploy.bat
@SET INSTALL_SCRIPT_FILE_NAME=install-%PROJECT%-%PROFILE%.bat
@SET WAR_FILE_NAME=%SOURCE_DIR%\build\libs\%PROJECT%-%VERSION%.war
@REM
@SET ANTLR_JAR_FILE_NAME=%SOURCE_DIR%/src/main/resources/bin/antlr-4.10.1-complete.jar
@SET ANTLR_PACKAGE_NAME=kr.andold.stock.antlr
@SET ANTLR_GRAMMAR_DIR=%SOURCE_DIR%/src/main/resources/grammar
@SET ANTLR_TARGET_DIR=%SOURCE_DIR%/src/main/java/kr/andold/stock/antlr
@REM
@SET APACHE_TOMCAT=tomcat10
@SET CURRENT_PATH=%~dp0
@SET CURRENT_FILENAME=%~nx0
@SET LC_ALL=ko_KR.UTF-8
@REM
@REM
@REM copy install script file
@REM
COPY /Y %SOURCE_DIR%\src\main\resources-%PROFILE%\%INSTALL_SCRIPT_FILE_NAME% %DEPLOY_DIR%
@REM
@REM
@REM antlr generate source
@REM
CD %SOURCE_DIR%
DEL /Q %SOURCE_DIR%\src\main\java\kr\andold\stock\antlr\*
java -jar %ANTLR_JAR_FILE_NAME% -encoding UTF8 -package %ANTLR_PACKAGE_NAME% -visitor -o %ANTLR_TARGET_DIR% %ANTLR_GRAMMAR_DIR%\Stock.g4
java -jar %ANTLR_JAR_FILE_NAME% -encoding UTF8 -package %ANTLR_PACKAGE_NAME% -visitor -o %ANTLR_TARGET_DIR% %ANTLR_GRAMMAR_DIR%\KrxEtf.g4
java -jar %ANTLR_JAR_FILE_NAME% -encoding UTF8 -package %ANTLR_PACKAGE_NAME% -visitor -o %ANTLR_TARGET_DIR% %ANTLR_GRAMMAR_DIR%\Seibro.g4
java -jar %ANTLR_JAR_FILE_NAME% -encoding UTF8 -package %ANTLR_PACKAGE_NAME% -visitor -o %ANTLR_TARGET_DIR% %ANTLR_GRAMMAR_DIR%\SeibroEtf.g4
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
jar -xf %WAR_FILE_NAME%
@REM
@REM
@REM tomcat start
@REM
NET start %APACHE_TOMCAT%
