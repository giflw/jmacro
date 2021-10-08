package com.itquasar.multiverse.jmacro.engine

import com.itquasar.multiverse.jmacro.core.script.Metadata
import com.itquasar.multiverse.jmacro.core.script.Script
import com.itquasar.multiverse.jmacro.core.script.ScriptResult
import spock.lang.Specification
import spock.lang.Stepwise

@Stepwise
class EngineImplTest extends Specification implements Constants {

    def "Parse Metadata"(extension) {
        given:
        def source = getClass()
            .getResource("/scripts/hello-world/hello-world.${extension}")
            .text
        EngineImpl engine = new EngineImpl()
        ScriptResult scriptResult = engine.execute(
            new Script(Metadata.parseMetadata(source), "hello-world.${extension}", '/scripts/hello-world', source)
        )
        Script script = scriptResult.script()

        expect:
        script.filename() == "hello-world.${extension}"
        script.location() == '/scripts/hello-world'
        script.source() == source
        scriptResult.result().get() == "Hello world from ${extension.toUpperCase()}"

        where:
        extension << EXTENSIONS
    }

}
