#!/bin/bash

CLEAN=""
BUILD=true
for arg in $@; do
    case "$arg" in
        "--clean" ) CLEAN=clean;;
        "--skip-build") BUILD=false ;;
        *) CONFIG_FILE=${arg:=$CONFIG_FILE};;
    esac
    shift
done

if [ "$BUILD" == "true" ]; then
    mvn $CLEAN install -DskipTests=true -P !application,!data,!installer,!jdk-embedded,!jre-embedded,!launcher,!scripts,!tools
else
    echo "Skipping build"
fi


echo "Using config file: ${CONFIG_FILE}"
CMD="mvn exec:java -pl :jmacro-cli -Djmacro.cli.config.path=${CONFIG_FILE}"
echo "Command: ${CMD}"
$CMD
