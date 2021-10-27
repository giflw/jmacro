package com.itquasar.multiverse.jmacro


import com.itquasar.multiverse.jmacro.core.JMacroCore
import com.itquasar.multiverse.jmacro.core.configuration.Configuration
import com.itquasar.multiverse.jmacro.core.script.Metadata
import com.itquasar.multiverse.jmacro.core.script.Script
import com.itquasar.multiverse.jmacro.core.script.ScriptResult
import groovy.util.logging.Log4j2
import spock.lang.Shared
import spock.lang.Specification

@Log4j2
abstract class ScriptSpec extends Specification {

    @Shared
    JMacroCore core

    @Shared
    String basename

    @Shared
    Script script;

    @Shared
    ScriptResult scriptResult

    void setupSpec() {
        core = new JMacroCore(Configuration.load())
        core.start()

        basename = (this.class.simpleName.replaceAll(/\B[A-Z]/) { '-' + it }.toLowerCase()).replace("-spec", "")
        String filename = basename + ".groovy"
        URL location = this.class.getResource(filename)
        log.warn "Loading test script ${filename}"
        String source = location.text

        Metadata metadata = Metadata.extractMetadata(source)

        script = new Script(metadata, filename, location.toString(), source)
    }

    void cleanupSpec() {
        core.stop()
    }

    abstract def expectedResult();


    void commonExpect() {
        assert script.filename == "${basename}.groovy"
        assert script.metadata.name == basename.toUpperCase()
        assert expectedResult() == core.engine.execute(script).result.get()
    }
}
