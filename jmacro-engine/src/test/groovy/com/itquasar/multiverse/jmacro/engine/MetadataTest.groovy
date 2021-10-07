package com.itquasar.multiverse.jmacro.engine

import com.itquasar.multiverse.jmacro.core.Metadata
import spock.lang.Specification
import spock.lang.Stepwise

@Stepwise
class MetadataTest extends Specification implements Constants {

    def "Parse Metadata"(extension) {
        given:
        def script = getClass()
            .getResource("/scripts/hello-world/hello-world.${extension}")
            .text
        Metadata metadata = Metadata.parseMetadata(script)

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
