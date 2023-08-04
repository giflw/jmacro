#!/bin/bash

CLEAN=""
if [ "$1" == "--clean" ]; then
    CLEAN=clean
fi
echo CLEAN=$CLEAN
mvn -P '!launcher,!installer,!jdk-embedded,!jre-embedded,!application,!data,!scripts,!tools,!extra-jlink-modules' -pl '!:tn3270j' $CLEAN verify site site:stage
