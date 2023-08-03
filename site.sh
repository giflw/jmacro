#!/bin/bash
mvn -P '!launcher,!installer,!jdk-embedded,!jre-embedded,!application,!data,!scripts,!tools,!extra-jlink-modules' -pl '!:tn3270j' site site:stage 