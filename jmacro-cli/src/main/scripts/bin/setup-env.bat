rem "Change codepage to 65001 - UTF-8"
chcp 65001
set JAVA_HOME="%BASEDIR%\jdk\"
set JAVACMD="%BASEDIR%\jdk\bin\java.exe"
set JAVA_OPTS=--enable-preview -Xms512M -Xmx2G -Dfile.encoding="UTF-8" -Dsun.jnu.encoding="UTF-8" -Djavax.net.ssl.trustStore="NUL" -Djavax.net.ssl.trustStoreType="Windows-ROOT" -Djava.net.useSystemProxies="true"
