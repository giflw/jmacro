package com.itquasar.multiverse.jmacro.commands.datax.commands;

import com.itquasar.multiverse.jmacro.commands.datax.commands.pdf.PDFAction;
import com.itquasar.multiverse.jmacro.core.command.AbstractCommand;
import com.itquasar.multiverse.jmacro.core.command.ArgAndConsumerCommand;
import com.itquasar.multiverse.jmacro.core.command.CallableCommand;
import com.itquasar.multiverse.jmacro.core.engine.Core;
import com.itquasar.multiverse.jmacro.core.exception.JMacroException;
import lombok.SneakyThrows;

import javax.script.ScriptEngine;
import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.UUID;
import java.util.function.Consumer;

public class PDFCommand extends AbstractCommand implements CallableCommand<Object, PDFAction>, ArgAndConsumerCommand<Object, PDFAction> {

    public PDFCommand(String name, Core core, ScriptEngine scriptEngine) {
        super(name, core, scriptEngine);
    }

    @Override
    public PDFAction call(Object o) {
        return switch (o) {
            case File f -> this.call(f);
            case InputStream i -> this.call(i);
            case Path p -> this.call(p);
            case String s -> this.call(s);
            default -> throw new JMacroException("Type " + o.getClass() + " not supported");
        };
    }


    public PDFAction call(File file) {
        return new PDFAction(file);
    }

    @SneakyThrows
    public PDFAction call(InputStream inputStream) {
        File tmp = File.createTempFile("jmacro-datax-pdf-", UUID.randomUUID().toString());
        Files.copy(inputStream, tmp.toPath(), StandardCopyOption.REPLACE_EXISTING);
        tmp.deleteOnExit();
        return this.call(tmp);
    }

    public PDFAction call(Path path) {
        return this.call(path.toFile());
    }

    public PDFAction call(String string) {
        return this.call(Path.of(string));
    }

    @Override
    public PDFAction call(Object arg, Consumer<PDFAction> consumer) {
        PDFAction pdfAction = this.call(arg);
        consumer.accept(pdfAction);
        return pdfAction;
    }
}
