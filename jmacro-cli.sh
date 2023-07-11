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
DAEMON=false
for arg in $@; do
    case "$arg" in
        "--clean" ) CLEAN=clean;;
        "--skip-build" ) BUILD=false ;;
        "--daemon" ) DAEMON=true ;;
        :* ) PROJECT="${arg}" ;;
        * ) CONFIG_FILE=${arg:=$CONFIG_FILE};;
    esac
done

if [ "$BUILD" == "true" ]; then
    echo "Building ${PROJECT}"
    maven=mvn
    if [ "$DAEMON" == "true" ]; then
        maven=$(which mvnd 2>/dev/null || which mvn 2>/dev/null || echo mvn)
        echo "Using maven at '$maven'"
    fi
    mvn $CLEAN install -amd -pl "${PROJECT}" -DskipTests=true -P "!application,!data,!installer,!jdk-embedded,!jre-embedded,!launcher,!scripts,!tools"
else
    echo '!!!! Skipping build !!!!'
fi


echo "Using config file: ${CONFIG_FILE}"
CMD="mvn exec:java -pl :jmacro-cli -Djmacro.cli.config.path=${CONFIG_FILE} -Djava.net.useSystemProxies=true"
echo "Command: ${CMD}"
$CMD
