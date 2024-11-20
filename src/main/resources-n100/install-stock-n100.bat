SET PROFILE=n100
SET SOURCE_DIR=C:\src\github\stock
SET	DEPLOY_DIR=C:\deploy\stock
SET	DEPLOY_SCRIPT_FILE_NAME=deploy.bat
SET APACHE_TOMCAT=tomcat10
SET CURRENT_PATH=%~dp0
SET CURRENT_FILENAME=%~nx0
SET LC_ALL=ko_KR.UTF-8
@REM
@REM
@REM
ECHO %CURRENT_PATH% %CURRENT_FILENAME%
@REM
@REM
@REM
DATE /t
TIME /t
@REM
@REM
@REM source checkout
@REM
CD %SOURCE_DIR%
git stash
git clean -f
git pull
git log --pretty=format:"%%h - %%an, %%ai:%%ar : %%s" -8
@REM
@REM
@REM copy deploy script file
@REM
COPY /Y %SOURCE_DIR%\src\main\resources-%PROFILE%\%DEPLOY_SCRIPT_FILE_NAME%	%DEPLOY_DIR%
@REM
@REM
@REM run deploy script file
@REM
CD %DEPLOY_DIR%
CALL %DEPLOY_SCRIPT_FILE_NAME%
