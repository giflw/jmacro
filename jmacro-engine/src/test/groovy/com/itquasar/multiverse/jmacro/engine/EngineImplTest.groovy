package com.itquasar.multiverse.jmacro.engine

import com.itquasar.multiverse.jmacro.core.Metadata
import spock.lang.Specification
import spock.lang.Stepwise

@Stepwise
class EngineImplTest extends Specification implements Constants {

    def "Parse Metadata"(extension) {
        given:
        def script = getClass()
            .getResource("/scripts/hello-world/hello-world.${extension}")
            .text
        EngineImpl engine = new EngineImpl()
        Metadata metadata = engine.execute("hello-world.${extension}", '/scripts/hello-world', script)

        expect:
        metadata.filename == "hello-world.${extension}"
        metadata.location == '/scripts/hello-world'
        metadata.source == script
        if (! extension in ['py', 'scala']) {
            metadata.result == "Hello world from ${extension.toUpperCase()}"
        }

        where:
        extension << EXTENSIONS
    }

}
