package com.itquasar.multiverse.jmacro.commands.datax.commands;

import groovy.lang.Closure;
import lombok.SneakyThrows;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;

import java.awt.image.BufferedImage;
import java.io.File;

public class TetracubeCommand {

    private ITesseract tesseract;

    private synchronized void init() {
        if(this.tesseract == null) {
            this.tesseract = new Tesseract();
        }
    }

    public void datapath(String path) {
        this.init();
        this.tesseract.setDatapath(path);
    }

    @SneakyThrows
    public String call(BufferedImage image) {
        this.init();
        return this.tesseract.doOCR(image);
    }

    @SneakyThrows
    public String call(File file) {
        this.init();
        return this.tesseract.doOCR(file);
    }

    public Object call(Closure closure) {
        this.init();
        closure.setDelegate(this);
        closure.setResolveStrategy(Closure.DELEGATE_FIRST);
        return closure.call();
    }
}
