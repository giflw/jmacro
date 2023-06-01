package com.itquasar.multiverse.jmacro.commands.datax.commands;

import com.itquasar.multiverse.jmacro.commands.datax.commands.pdf.PDFAction;
import com.itquasar.multiverse.jmacro.core.Command;
import com.itquasar.multiverse.jmacro.core.Core;
import groovy.lang.Closure;

import javax.script.ScriptEngine;
import java.io.File;
import java.nio.file.Path;

public class PDFCommand extends Command {

    public PDFCommand(String name, Core core, ScriptEngine scriptEngine) {
        super(name, core, scriptEngine);
    }

    public Object call(String path, Closure closure) {
        return this.call(Path.of(path), closure);
    }

    public Object call(Path path, Closure closure) {
        return this.call(path.toFile(), closure);
    }

    public Object call(File file, Closure closure) {
        closure.setDelegate(new PDFAction(file));
        return execute(closure);
    }

    public Object call(Closure closure) {
        closure.setDelegate(new PDFAction());
        return execute(closure);
    }

    private Object execute(Closure closure) {
        closure.setResolveStrategy(Closure.DELEGATE_FIRST);
        return closure.call();
    }
}
