package com.itquasar.multiverse.jmacro.commands

import com.itquasar.multiverse.jmacro.core.JMacroCore
import com.itquasar.multiverse.jmacro.core.SPILoader
import com.itquasar.multiverse.jmacro.core.command.CommandProvider
import com.itquasar.multiverse.jmacro.core.configuration.Configuration
import com.itquasar.multiverse.jmacro.core.repository.GlobalScriptRepository
import com.itquasar.multiverse.jmacro.core.repository.ScriptRepository
import com.itquasar.multiverse.jmacro.core.script.Metadata
import com.itquasar.multiverse.jmacro.core.script.Script
import com.itquasar.multiverse.jmacro.core.script.ScriptResult
import groovy.util.logging.Log4j2
import org.junit.Assume
import spock.lang.Specification
import spock.lang.Unroll

@Log4j2
class CommandSpec extends Specification {

    /**
     * name of the command to run only one test.
     * Should be null on repository
     */
    static String singleCommandTest = System.getProperty('commandSpec.command')

    static Process mainframe

    static boolean mainframeReady = false

    JMacroCore core

    void setupSpec() {
//        println('Starting command test external tools')
//
//        Path toolsDir = new File(System.getProperty('basedir')).toPath().parent.resolve('tools/')
//        println("Using $toolsDir as tool dir")
//
//        println('Starting hercules mainframe...')
//
//        String arch = ArchUtils.getProcessor().is64Bit() ? '64' : '32'
//
//        String command = "hercules/linux/${arch}/bin/hercules"
//        if (SystemUtils.IS_OS_WINDOWS) {
//            command = "hercules/windows/${arch}/hercules.exe"
//        }
//
//        new Thread({
//            Path mainframeDir = toolsDir.resolve("hercules-mvs-3.8-turnkey-4-system-tk4-update-8/mainframe")
//            var processBuilder = new ProcessBuilder()
//                .directory(mainframeDir.toFile())
//                .command(mainframeDir.resolve(command).toString(), '-f', 'conf/tk4-.cnf')
//                .redirectErrorStream(true)
//            processBuilder.environment().put('HERCULES_RC', 'scripts/ipl.rc')
//            if (SystemUtils.IS_OS_WINDOWS) {
//                processBuilder.environment().put('TK4CRLF', 'CRLF')
//            }
//            println processBuilder.directory()
//            println processBuilder.command()
//            mainframe = processBuilder.start()
//            mainframe.inputReader().each {
//                println it
//                if (it.contains('Tur(n)key System')) {
//                    mainframeReady = true
//                }
//            }
//        }).start()
//
//
//        while (!mainframeReady) {
//            println "Waiting mainframe be ready"
//            Thread.sleep(1000)
//        }
//
//        println('Hercules mainframe started!')
    }

    void cleanupSpec() {
//        ((HttpURLConnection) new URL('http://localhost:8038/cgi-bin/tasks/syslog').openConnection()).with {
//            requestMethod = 'POST'
//            doOutput = true
//            setRequestProperty('Content-Type', 'application/x-www-form-urlencoded')
//            setRequestProperty('Referrer', 'http://localhost:8038/cgi-bin/tasks/syslog')
//            outputStream.withPrintWriter { printWriter ->
//                printWriter.write('command=exit&send=Send&norefresh=1&refresh_interval=5&msgcount=0')
//            }
//            println "Hercules http exit returned ${inputStream.text}"
//        }

//        def writer = mainframe.getOutputStream().newPrintWriter()
//        println "EXIT MAINFRAME"
//        writer.println("exit")
//        println "FLUSH MAINFRAME"
//        writer.flush()
//        println "WAIT FOR MAINFRAME"
//        mainframe.waitFor()
    }

    void setup() {
        def configuration = new Configuration()
        configuration.repository = new GlobalScriptRepository(new CommandTestRepository(CommandSpec.class.getResource("/" + CommandSpec.class.packageName.replace(".", "/") + "/scripts/").toURI()))
        core = new JMacroCore(configuration)
        core.start()
    }

    void cleanup() {
        core.stop()
    }

    @Unroll
    void "Command [#provider.name] of type [#provider.commandType.simpleName]"(CommandProvider provider) {
        when: "Script found"
        if (provider.name.equals("tn3270")) {
            Assume.assumeNotNull(System.getProperty("tn3270j.url"))
        }
        Script script = loadScript(provider.name)
        ScriptResult result = core.engine.execute(script)

        then: "No exception thrown"
        noExceptionThrown()

        and: "Script object is populated"
        script.path == "${provider.name}.groovy"

        and: "Check metadata"
        script.metadata.name == provider.name.toUpperCase()

        and: "Check result"
        script == result.script
        result.exitCode == (script.metadata.infos.exitCode ?: 0)
        script.metadata.infos['expectedResult'] == result.result.get()

        where: "Command providers loaded throw Java SPI"
        provider << SPILoader.load(CommandProvider.class).toList().findAll {
            singleCommandTest ? it.name == singleCommandTest : true
        }
    }

    static Script loadScript(String basename) {
        String filename = basename + ".groovy"
        URL location = CommandSpec.class.getResource("/" + CommandSpec.class.packageName.replace(".", "/") + "/scripts/" + filename)
        if (location == null) {
            throw new IllegalArgumentException("Could not find $filename")
        }
        String source = location.text
        Metadata metadata = Metadata.extractMetadata(source)
        return new Script(metadata, filename, location.toString(), source)
    }

    static class CommandTestRepository implements ScriptRepository {

        private final URI uri

        CommandTestRepository(URI uri) {
            this.uri = uri
        }

        @Override
        String getId() {
            return "command-test"
        }

        @Override
        URI getUri() {
            return this.uri
        }

        @Override
        List<Script> list(boolean reload) {
            return List.of(loadScript("include"),
                loadScript("library"))
        }

        @Override
        Optional<Script> get(UUID uuid) {
            return Optional.ofNullable(list().find { it.getUUID() == uuid })
        }

        @Override
        Optional<Script> get(URI location) {
            return Optional.ofNullable(list().find { it.location == location })
        }
    }

}
