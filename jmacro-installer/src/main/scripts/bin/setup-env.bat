rem "Change codepage to 65001 - UTF-8"
chcp 65001
set JAVA_HOME="%BASEDIR%\jre\"
set JAVACMD="%BASEDIR%\jre\bin\java.exe"
rem set JAVA_OPTS=-Xms512M -Xmx2G -Dfile.encoding="UTF-8" -Dsun.jnu.encoding="UTF-8" -Djavax.net.ssl.trustStore="NUL" -Djavax.net.ssl.trustStoreType="Windows-ROOT"
set JAVA_OPTS=-Dfile.encoding="UTF-8" -Dsun.jnu.encoding="UTF-8" -Djavax.net.ssl.trustStore="NUL" -Djavax.net.ssl.trustStoreType="Windows-ROOT"
