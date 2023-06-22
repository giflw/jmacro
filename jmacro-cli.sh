#!/bin/bash
set -e

if [ "$1" == "" ]; then
    echo "usage: jmacro-cli.sh [--clean] [--skip-build] [:project] path/to/config.yaml"
    exit 1
fi

#export JAVA_OPTS='-Xms512M -Xmx2G -Dfile.encoding="UTF-8" -Dsun.jnu.encoding="UTF-8" -Djavax.net.ssl.trustStore="NUL" -Djavax.net.ssl.trustStoreType="Windows-ROOT" -Djava.net.useSystemProxies="true"'

PROJECT=:jmacro
CLEAN=""
BUILD=true
for arg in $@; do
    case "$arg" in
        "--clean" ) CLEAN=clean;;
        "--skip-build" ) BUILD=false ;;
        :* ) PROJECT="${arg}" ;;
        * ) CONFIG_FILE=${arg:=$CONFIG_FILE};;
    esac
done

if [ "$BUILD" == "true" ]; then
    echo "Building ${PROJECT}"
    mvn $CLEAN install -amd -pl "${PROJECT}" -DskipTests=true -P "!application,!data,!installer,!jdk-embedded,!jre-embedded,!launcher,!scripts,!tools"
else
    echo '!!!! Skipping build !!!!'
fi


echo "Using config file: ${CONFIG_FILE}"
CMD="mvn exec:java -pl :jmacro-cli -Djmacro.cli.config.path=${CONFIG_FILE}"
echo "Command: ${CMD}"
$CMD
