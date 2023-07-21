package com.itquasar.multiverse.jmacro.engine

import com.itquasar.multiverse.jmacro.core.configuration.Configuration
import com.itquasar.multiverse.jmacro.core.engine.Core
import com.itquasar.multiverse.jmacro.core.engine.EngineImpl
import com.itquasar.multiverse.jmacro.core.script.Metadata
import com.itquasar.multiverse.jmacro.core.script.Script
import com.itquasar.multiverse.jmacro.core.script.ValueHolder
import spock.lang.Specification

class EngineImplSpec extends Specification implements Constants {

    def "parse metadata and build script object"(extension) {
        given:
        def source = getClass()
            .getResource("/tests/hello-world/hello-world.${extension}")
            .text

        def metadata = Metadata.extractMetadata(source)
        def script = new Script(metadata, "hello-world.${extension}", '/scripts/hello-world', source)

        expect:
        metadata.name == 'Metadata Test'
        metadata.description == 'Just a metadata test'
        metadata.author == 'I Myself'
        metadata.version == '0.1.2'
        script.path == "hello-world.${extension}"
        script.location == URI.create('/scripts/hello-world')
        script.source == source

        where:
        extension << EXTENSIONS
    }

    def "check engine thread safe"() {
        given:
        EngineImpl engine = new EngineImpl(new Core(Configuration.load()))
        final ValueHolder first = new ValueHolder()
        final ValueHolder second = new ValueHolder()
        Thread.start {
            first.set(
                engine.execute(new Script(
                    Metadata.EMPTY,
                    "set_scope.groovy",
                    '',
                    """
                        def x = 'first'
                        logger.warn(x)
                        timer.start()
                        logger.info("Timer started")
                        Thread.sleep(4000)
                        timer.partial()
                        timer.log()
                        result("FIRST \${timer.stop == null && x == 'first'}")
                        """
                )).result.get()
            )
        }
        Thread.start {
            second.set(
                engine.execute(new Script(
                    Metadata.EMPTY,
                    "set_scope.groovy",
                    '',
                    """
                            Thread.sleep(1000)
                            attempt(\$QUIET) {
                                logger.warn(x)
                            }
                            Thread.sleep(1000)
                            def x = 'second'
                            logger.warn(x)
                            result(timer.start === null)
                            attempt(\$QUIET) {
                                timer.stop()
                            }
                            result("SECOND failed (\${timer.start === null})")
                            timer.log()
                            Thread.sleep(2000)
                        """
                )).result.get()
            )
        }.join()

        expect:
        assert first.get() == "FIRST true"
        assert second.get() == "SECOND failed (true)"
    }

}
