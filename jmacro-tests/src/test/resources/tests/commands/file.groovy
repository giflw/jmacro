/*
START METADATA
name: FILE
infos:
    expectedResult: jmacro-tests
END METADATA
 */
def basedir = System.getProperty('basedir')
def pom = file(basedir + "/pom.xml")

def project = pom.data

result(project.artifactId.text())
