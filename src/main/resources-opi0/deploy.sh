#!/bin/bash
#
#
PROJECT=stock
VERSION=0.0.2-SNAPSHOT
PROFILE=opi0
HOME_DIR=/home/andold
SOURCE_DIR=$HOME_DIR/src/github/stock
DEPLOY_DIR=$HOME_DIR/deploy/stock
INSTALL_SCRIPT_FILE_NAME=install-$PROJECT-$PROFILE.sh
WAR_FILE_NAME=$SOURCE_DIR/build/libs/$PROJECT-$VERSION.war
#
ANTLR_JAR_FILE_NAME=$SOURCE_DIR/src/main/resources/bin/antlr-4.10.1-complete.jar
ANTLR_PACKAGE_NAME=kr.andold.stock.antlr
ANTLR_GRAMMAR_DIR=$SOURCE_DIR/src/main/resources/grammar
ANTLR_TARGET_DIR=$SOURCE_DIR/src/main/java/kr/andold/stock/antlr
#
TOMCAT_BIN_DIR=$HOME_DIR/apps/tomcat/bin
#
#
#
function	kill_tomcat	{
	# 종료되었는지 확인하고, 살아있으면 강제로 종료시킨다.
	if [ -z "`ps -eaf | grep java | grep $1 | grep -v grep`" ]; then
		echo "정보:: 톰캣이 이미 종료되었습니다." $1
		return 0
	fi

	echo    "경고:: 톰캣이 정상적으로 종료되지 않았습니다. 강제로 종료시킵니다."
	ps -eaf | grep java | grep $1 | grep -v grep | awk '{print $2}' |

	while read PID
	do
		echo "Killing $PID ..."
		kill -9 $PID
		echo "Tomcat is being shutdowned."
	done
}
#
function	stop_tomcat	{
	#       시작 로그
	echo    "----------------------------------------------------------------------"
	date
	#       정상적으로 톰캣을 종료시킨다.
	if [ -z "`ps -eaf | grep java | grep $1 | grep -v grep`" ]; then
		echo    "경고:: 톰캣이 실행되고 있지 않았습니다. $1"
		return 0
	fi

	echo    "정보:: 톰캣을 종료시킵니다." $1
	$1/shutdown.sh

	for cx in $(seq 1 16)
	do
		if [ -z "`ps -eaf | grep java | grep $1 | grep -v grep`" ]; then
			echo "정보:: 톰캣이 종료되었습니다." $1
			return 0
		fi

		echo	"wait..." $cx
		sleep 1
	done

	kill_tomcat	$1
}
#
function	start_tomcat    {
	echo    "----------------------------------------------------------------------"
	date
	echo "정보:: 톰캣을 실행시키기 전에, 톰캣의 실행되어 있으면, 종료 시킵니다.." $1
	kill_tomcat	$1

	# 톰캣을 실행시킨다.
	echo "정보:: 톰캣을 실행시킵니다. $1"
	$1/startup.sh
	sleep 1

	jps
	ps -eaf | grep java | grep $1 | grep -v grep
}
#
#
# copy install script file
#
cp $SOURCE_DIR/src/main/resources-$PROFILE/$INSTALL_SCRIPT_FILE_NAME $DEPLOY_DIR
chmod a+x $DEPLOY_DIR/$INSTALL_SCRIPT_FILE_NAME
#
#
# generate antlr grammar source
#
cd	$SOURCE_DIR
rm -f $ANTLR_TARGET_DIR/*
java -jar $ANTLR_JAR_FILE_NAME -encoding UTF8 -package $ANTLR_PACKAGE_NAME -visitor -o $ANTLR_TARGET_DIR $ANTLR_GRAMMAR_DIR/Stock.g4
java -jar $ANTLR_JAR_FILE_NAME -encoding UTF8 -package $ANTLR_PACKAGE_NAME -visitor -o $ANTLR_TARGET_DIR $ANTLR_GRAMMAR_DIR/KrxEtf.g4
java -jar $ANTLR_JAR_FILE_NAME -encoding UTF8 -package $ANTLR_PACKAGE_NAME -visitor -o $ANTLR_TARGET_DIR $ANTLR_GRAMMAR_DIR/Seibro.g4
java -jar $ANTLR_JAR_FILE_NAME -encoding UTF8 -package $ANTLR_PACKAGE_NAME -visitor -o $ANTLR_TARGET_DIR $ANTLR_GRAMMAR_DIR/SeibroEtf.g4
#
#
# react npm install
#
cd	$SOURCE_DIR/src/main/frontend
npm install --no-bin-links --force
npm audit fix --force
npm install react-scripts@latest --save
# 
# 
# build 
#
cd $SOURCE_DIR
bash gradlew build -Pprofile=$PROFILE -x test
#
#
# stop tomcat
#
stop_tomcat $TOMCAT_BIN_DIR
#
#
# Extract files from in $FILE_NAME_WAR
#
cd $DEPLOY_DIR/doc_base
rm -fr *
jar -xf $WAR_FILE_NAME
#
#
# start tomcat
#
start_tomcat $TOMCAT_BIN_DIR
