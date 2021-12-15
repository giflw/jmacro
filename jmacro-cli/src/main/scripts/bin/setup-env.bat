rem "Change codepage to 65001 - UTF-8"
chcp 65001
set JAVA_HOME="%BASEDIR%\java\"
set JAVACMD="%BASEDIR%\java\bin\java.exe"
set JAVA_OPTS=-Dfile.encoding="UTF-8" -Dsun.jnu.encoding="UTF-8"
