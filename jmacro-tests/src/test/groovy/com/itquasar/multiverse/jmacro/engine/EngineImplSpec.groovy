package com.itquasar.multiverse.jmacro.engine

import com.itquasar.multiverse.jmacro.core.EngineImpl
import com.itquasar.multiverse.jmacro.core.script.Metadata
import com.itquasar.multiverse.jmacro.core.script.Script
import com.itquasar.multiverse.jmacro.core.script.ScriptResult
import spock.lang.Specification
import spock.lang.Stepwise

@Stepwise
class EngineImplSpec extends Specification implements Constants {

    def "Parse Metadata"(extension) {
        given:
        def source = getClass()
            .getResource("/scripts/hello-world/hello-world.${extension}")
            .text
        EngineImpl engine = new EngineImpl()

        def metadata = Metadata.parseMetadata(source)
        def scriptOrig = new Script(metadata, "hello-world.${extension}", '/scripts/hello-world', source)
        ScriptResult scriptResult = engine.execute(scriptOrig, null)
        Script script = scriptResult.script

        expect:
        script.filename == "hello-world.${extension}"
        script.location == '/scripts/hello-world'
        script.source == source
        scriptResult.result.get() == "Hello world from ${extension.toUpperCase()}"

        where:
        extension << EXTENSIONS
    }

}
