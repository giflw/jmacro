package com.itquasar.multiverse.jmacro.engine

import com.itquasar.multiverse.jmacro.core.JMacroCore
import com.itquasar.multiverse.jmacro.core.configuration.Configuration
import com.itquasar.multiverse.jmacro.core.repository.GlobalScriptRepository
import com.itquasar.multiverse.jmacro.core.repository.ScriptRepository
import com.itquasar.multiverse.jmacro.core.script.Metadata
import com.itquasar.multiverse.jmacro.core.script.Script
import com.itquasar.multiverse.jmacro.core.script.ScriptResult
import spock.lang.Specification
import spock.lang.Stepwise

@Stepwise
class BaseExampleScriptSpec extends Specification implements Constants {

    def "Run Base Example script"() {
        when:
        def configuration = Configuration.load();
        configuration.setRepository(new BaseExampleRepository())
        def jMacroCore = new JMacroCore(configuration)
        def source = getClass()
            .getResource("/scripts/example/base-example.groovy")
            .text

        def metadata = Metadata.extractMetadata(source)

        def scriptOrig = new Script(metadata, "base-example.groovy", '/scripts/example/base-example.groovy', source)
        ScriptResult scriptResult = jMacroCore.engine.execute(scriptOrig)
        Script script = scriptResult.script

        then:
        script.metadata.name == "Base Example"
        script.path == "base-example.groovy"
        script.location == URI.create('/scripts/example/base-example.groovy')
        script.source == source
        scriptResult.result.get() == "RESULT"
    }

}

class BaseExampleRepository extends GlobalScriptRepository {
    public BaseExampleRepository() {
        super([new ScriptRepository() {

            @Override
            String getId() {
                return "test"
            }

            @Override
            URI getUri() {
                return URI.create("memory:/" + BaseExampleScriptSpec.class.name)
            }

            @Override
            List<Script> list(boolean reload) {
                return []
            }

            @Override
            Optional<Script> get(UUID uuid) {
                return null
            }

            @Override
            Optional<Script> get(URI location) {
                return Optional.of(
                    new Script(
                        new Metadata(),
                        "test-include",
                        "/scripts/example/test-include.groovy",
                        getClass()
                            .getResource("/scripts/example/test-include.groovy")
                            .text
                    )
                )
            }
        }])
    }
}
