package com.itquasar.multiverse.jmacro.engine

import com.itquasar.multiverse.jmacro.core.script.Metadata
import spock.lang.Specification

class MetadataSpec extends Specification implements Constants {

    def "Parse Metadata"(extension) {
        given:
        def script = getClass()
            .getResource("/tests/hello-world/hello-world.${extension}")
            .text
        Metadata metadata = Metadata.extractMetadata(script)

        expect:
        metadata.name == 'Metadata Test'
        metadata.description == 'Just a metadata test'
        metadata.author == 'I Myself'
        metadata.version == '0.1.2'
        metadata.infos == [one: 1, two: true, three: 'tree']
        metadata.dump() == """
                author: I Myself
                description: Just a metadata test
                infos:
                  one: 1
                  two: true
                  three: tree
                name: Metadata Test
                version: 0.1.2""".stripIndent().trim() + "\n"

        where:
        extension << EXTENSIONS
    }

}
