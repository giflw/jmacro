package com.itquasar.multiverse.jmacro.commands.io.commands.zip;

import lombok.SneakyThrows;
import net.lingala.zip4j.ZipFile;

import java.io.File;
import java.nio.file.Path;
import java.util.List;

public class ZipFileExtended extends ZipFile {

    public ZipFileExtended(String zipFile) {
        super(zipFile);
    }

    public ZipFileExtended(String zipFile, char[] password) {
        super(zipFile, password);
    }

    public ZipFileExtended(File zipFile) {
        super(zipFile);
    }

    public ZipFileExtended(File zipFile, char[] password) {
        super(zipFile, password);
    }

    public ZipFileExtended(Path zipFile) {
        super(zipFile.toFile());
    }

    public ZipFileExtended(Path zipFile, char[] password) {
        super(zipFile.toFile(), password);
    }

    public ZipFileExtended add(Path... paths) {
        return this.add(List.of(paths).stream().map(Path::toFile).toList());
    }

    public ZipFileExtended add(File... files) {
        return this.add(List.of(files));
    }

    public ZipFileExtended add(String... files) {
        return this.add(List.of(files).stream().map(File::new).toList());
    }

    @SneakyThrows
    public ZipFileExtended add(List<File> files) {
        for (File file : files) {
            if (file.isDirectory()) {
                this.addFolder(file);
            } else {
                this.addFile(file);
            }
        }
        return this;
    }

    public ZipFileExtended extractTo(File destination) {
        return this.extractTo(destination.getAbsolutePath());
    }

    public ZipFileExtended extractTo(Path destination) {
        return this.extractTo(destination.toAbsolutePath().toString());
    }

    @SneakyThrows
    public ZipFileExtended extractTo(String destination) {
        this.extractAll(destination);
        return this;
    }

}
