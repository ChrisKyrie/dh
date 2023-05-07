#!/bin/bash

DIR=$(cd $(dirname $0);cd ..;pwd)
LIB_PATH=${DIR}/lib
APP_NAME=dh-app-1.0-SNAPSHOT.jar
LOG_FILE=dh-app.log
echo ${LIB_PATH}

nohup  java -Dloader.path=${LIB_PATH},resources,lib -Dfile.encoding=utf-8 -jar ${APP_NAME} >${LOG_FILE} 2>&1 &

tail -f ${LOG_FILE}
