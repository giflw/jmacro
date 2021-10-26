package jmacro.tests;

import com.itquasar.multiverse.jmacro.core.EngineImpl;
import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.configuration.Configuration;
import com.itquasar.multiverse.jmacro.core.script.Metadata;
import com.itquasar.multiverse.jmacro.core.script.Script;

import java.io.IOException;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws Exception {
        JMacroCore jMacroCore = new JMacroCore(Configuration.load());
        jMacroCore.start();
        jMacroCore.getEngine().execute(
            new Script(
                new Metadata(),
                "teste.scala",
                null,
                """
//                    val name = VERBOSE.name()
//                    logger.warn(name)
                    logger.info("hi")
                    logger.info(QUIET)
                    """
            )
        );

        jMacroCore.stop();
    }
}
