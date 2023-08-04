/*
START METADATA
name: FILE
infos:
    expectedResult: jmacro-tests
END METADATA
 */

String basedir = echo.getClass().getProtectionDomain().codeSource.location.path.toString().replace('/jmacro-commands/jmacro-commands-base/target/classes/', '')
basedir = (basedir.charAt(2) == (char) ':' ? basedir.substring(1) : basedir) + "/jmacro-tests/pom.xml"
echo basedir

def pom = file(basedir)
echo "POM $pom"

def project = pom.data
echo "PROJECT $project"

result(project.artifactId.text())
