package com.itquasar.multiverse.jmacro.clitest;

import com.itquasar.multiverse.jmacro.cli.Run;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class RunTest {

    @Test
    public void checkInfixAndExtension() {
        Run run = new Run();
        run.mainInfix = "infix";
        run.defaultExtension = "ext";
        String expected = "script.infix.ext";

        assertEquals(expected, run.checkInfixAndExtension("script").get());
        assertEquals(expected, run.checkInfixAndExtension("script.infix").get());
        assertEquals(expected, run.checkInfixAndExtension("script.infix.ext").get());
        assertEquals("script.foo.bar", run.checkInfixAndExtension("script.foo.bar").get());
        assertEquals("script.foo", run.checkInfixAndExtension("script.foo").get());
    }

}
