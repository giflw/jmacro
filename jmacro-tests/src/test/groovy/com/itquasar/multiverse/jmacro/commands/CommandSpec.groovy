package com.itquasar.multiverse.jmacro.commands


import com.itquasar.multiverse.jmacro.core.Core
import com.itquasar.multiverse.jmacro.core.SPILoader
import com.itquasar.multiverse.jmacro.core.command.CommandProvider
import com.itquasar.multiverse.jmacro.core.configuration.Configuration
import com.itquasar.multiverse.jmacro.core.repository.GlobalScriptRepository
import com.itquasar.multiverse.jmacro.core.repository.ScriptRepository
import com.itquasar.multiverse.jmacro.core.script.Metadata
import com.itquasar.multiverse.jmacro.core.script.Script
import com.itquasar.multiverse.jmacro.core.script.ScriptResult
import groovy.util.logging.Log4j2
import spock.lang.Ignore
import spock.lang.Specification
import spock.lang.Unroll

@Log4j2
class CommandSpec extends Specification {

    Core core

    void setup() {
        def configuration = new Configuration()
        def uri = CommandSpec.class.getResource("/tests/commands/").toURI()
        println "URI: $uri"
        configuration.repository = new GlobalScriptRepository(new CommandTestRepository(uri))
        println "Configuration: $configuration"
        core = new Core(configuration)
        core.start()
    }

    void cleanup() {
        core.stop()
    }

    @Unroll
    void "Command [#provider.name] of type [#provider.commandType.simpleName]"(CommandProvider provider) {
        when: "Script found"
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

        where: "Command providers loaded through Java SPI"
        provider << SPILoader.load(CommandProvider.class).toList().findAll {
            (it.name == 'tn3270' && System.getProperty('tn3270j.url') != null) || it.name != 'tn3270'
        }
    }

    static Script loadScript(String basename) {
        String filename = basename + ".groovy"
        URL location = CommandSpec.class.getResource("/tests/commands/" + filename)
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
