package com.itquasar.multiverse.jmacro.commands.base.commands

import com.itquasar.multiverse.jmacro.ScriptSpec
import groovy.util.logging.Log4j2

@Log4j2
class TimerSpec extends ScriptSpec {

    @Override
    def expectedResult() {
        return true
    }

    def test() {
        when:
        commonExpect()

        then:
        notThrown(Throwable.class)
    }
}
