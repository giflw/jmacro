package com.itquasar.multiverse.jmacro.engine

import com.itquasar.multiverse.jmacro.core.EngineImpl
import com.itquasar.multiverse.jmacro.core.JMacroCore
import com.itquasar.multiverse.jmacro.core.script.Metadata
import com.itquasar.multiverse.jmacro.core.script.Script
import com.itquasar.multiverse.jmacro.core.script.ScriptResult
import com.itquasar.multiverse.jmacro.core.script.ValueHolder
import spock.lang.Specification

class EngineImplSpec extends Specification implements Constants {

    def setupSpec() {
        // FIXME better report header or remove
        reportHeader "<h2>Using default engine</h2>"
    }

    def "parse metadata"(extension) {
        given:
        def source = getClass()
            .getResource("/scripts/hello-world/hello-world.${extension}")
            .text
        EngineImpl engine = new EngineImpl(new JMacroCore())

        def metadata = Metadata.extractMetadata(source)
        def scriptOrig = new Script(metadata, "hello-world.${extension}", '/scripts/hello-world', source)
        ScriptResult scriptResult = engine.execute(scriptOrig)
        Script script = scriptResult.script

        expect:
        script.path == "hello-world.${extension}"
        script.location == URI.create('/scripts/hello-world')
        script.source == source
        scriptResult.result.get() == "Hello world from ${extension.toUpperCase()}"

        where:
        extension << EXTENSIONS
    }

    def "check engine thread safe"() {
        given:
        EngineImpl engine = new EngineImpl(new JMacroCore())
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
                        __RESULT__("FIRST \${timer.stop == null && x == 'first'}")
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
                            attempt(QUIET) {
                                logger.warn(x)
                            }
                            Thread.sleep(1000)
                            def x = 'second'
                            logger.warn(x)
                            __RESULT__(timer.start === null)
                            attempt(QUIET) {
                                timer.stop()
                            }
                            __RESULT__("SECOND failed (\${timer.start === null})")
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
