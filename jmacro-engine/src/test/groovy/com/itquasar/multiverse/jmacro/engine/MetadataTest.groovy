package com.itquasar.multiverse.jmacro.engine

import spock.lang.Shared

class MetadataTest extends spock.lang.Specification {

    @Shared
    Metadata metadata

    def "Parse Metadata"() {
        given:
        def script = """
            START METADATA
                name: Metadata Test
                description: Just a metadata test
                author: I Myself
                version: 0.1.2
                infos:
                  one: 1
                  two: true
                  three: tree
            END METADATA
            """;

        when:
        metadata = Metadata.parseMetadata(script)

        then:
        metadata.name == 'Metadata Test'
        metadata.description == 'Just a metadata test'
        metadata.author == 'I Myself'
        metadata.version == '0.1.2'
        metadata.infos == [one: 1, two: true, three: 'tree']
    }

    def "Dump"() {
        given:
        def yaml = """
                author: I Myself
                description: Just a metadata test
                filename: null
                infos:
                  one: 1
                  two: true
                  three: tree
                location: null
                name: Metadata Test
                source: null
                version: 0.1.2""".stripIndent().trim() + "\n"
        when:
        def dumped = metadata.dump()

        then:
        dumped == yaml
    }

}
