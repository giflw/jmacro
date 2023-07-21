package com.itquasar.multiverse.jmacro.commands.io.commands;

import com.itquasar.multiverse.jmacro.commands.io.commands.zip.ZipFileExtended;
import com.itquasar.multiverse.jmacro.core.command.AbstractCommand;
import com.itquasar.multiverse.jmacro.core.engine.Core;

import javax.script.ScriptEngine;
import java.io.File;
import java.nio.file.Path;

public class ZipCommand extends AbstractCommand {

    public ZipCommand(String name, Core core, ScriptEngine scriptEngine) {
        super(name, core, scriptEngine);
    }

    private static char[] passwordCharArray(String password) {
        return password == null ? null : password.toCharArray();
    }

    ZipFileExtended call(Path zipFile) {
        return call(zipFile, null);
    }

    ZipFileExtended call(Path zipFile, String password) {
        return new ZipFileExtended(zipFile, passwordCharArray(password));
    }

    ZipFileExtended call(File zipFile) {
        return call(zipFile, null);
    }

    ZipFileExtended call(File zipFile, String password) {
        return new ZipFileExtended(zipFile, passwordCharArray(password));
    }

    ZipFileExtended call(String zipFile) {
        return call(zipFile, null);
    }

    ZipFileExtended call(String zipFile, String password) {
        return new ZipFileExtended(zipFile, passwordCharArray(password));
    }

}
