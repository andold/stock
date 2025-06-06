#!/bin/bash
#
#
PROJECT=stock
VERSION=0.0.2-SNAPSHOT
PROFILE=linux
HOME_DIR=/home/andold
INSTALL_SCRIPT_FILE_NAME=install-$PROJECT-$PROFILE.sh
DEPLOY_SCRIPT_FILE_NAME=deploy.sh
SOURCE_DIR=$HOME_DIR/src/github/$PROJECT
DEPLOY_DIR=$HOME_DIR/deploy/$PROJECT
TOMCAT_BIN_DIR=$HOME_DIR/apps/tomcat/bin
#
#
date
#
#
# source checkout
#
git config --global core.quotepath false
cd	$SOURCE_DIR
git stash
git clean -f
git pull
git log --pretty=format:"%h - %an, %ai:%ar : %s" -8
#
#
# copy deploy script file
#
cp $SOURCE_DIR/src/main/resources-$PROFILE/$DEPLOY_SCRIPT_FILE_NAME	$DEPLOY_DIR
#
#
cd $DEPLOY_DIR
chmod a+x $DEPLOY_SCRIPT_FILE_NAME
bash $DEPLOY_SCRIPT_FILE_NAME
#
