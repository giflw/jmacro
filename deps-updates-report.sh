#!/bin/bash
mvn versions:dependency-updates-report \
	versions:dependency-updates-aggregate-report \
	versions:plugin-updates-report \
	versions:plugin-updates-aggregate-report \
	versions:property-updates-report \
	versions:property-updates-aggregate-report \
	versions:parent-updates-report \
	-DallowSnapshots=false \
	-Dmaven.version.ignore=.\*-NIGHTLY,.\*-alpha.\*,.\*-beta.\*,.\*-M[0-9]+,[0-9]+,20[0-9]{2}.[0-9]+ \
	-DonlyProjectDependencies=true