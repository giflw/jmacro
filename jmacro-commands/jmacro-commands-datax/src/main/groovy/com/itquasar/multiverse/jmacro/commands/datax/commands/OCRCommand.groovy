package com.itquasar.multiverse.jmacro.commands.datax.commands

import com.itquasar.multiverse.jmacro.core.Command
import com.itquasar.multiverse.jmacro.core.JMacroCore
import lombok.SneakyThrows
import net.sourceforge.tess4j.ITesseract
import net.sourceforge.tess4j.Tesseract

import javax.script.ScriptEngine
import java.awt.image.BufferedImage
import java.nio.file.Path

class OCRCommand extends Command {

    private ITesseract tesseract

    OCRCommand(JMacroCore core, ScriptEngine scriptEngine) {
        super(core, scriptEngine)
    }

    private synchronized void init() {
        if (this.tesseract == null) {
            this.tesseract = new Tesseract()
        }
    }

    void datapath(Path path) {
        this.datapath(path.toString())
    }

    void language(String language) {
        this.init();
        this.tesseract.setLanguage(language)
    }

    void datapath(String path) {
        this.init()
        this.tesseract.setDatapath(path)
    }

    @SneakyThrows
    String call(BufferedImage image) {
        this.init()
        return this.tesseract.doOCR(image)
    }

    @SneakyThrows
    String call(Path path) {
        this.init()
        return this.tesseract.doOCR(path.toFile())
    }

    @SneakyThrows
    String call(File file) {
        this.init()
        return this.tesseract.doOCR(file)
    }

    Object call(Closure closure) {
        this.init()
        closure.setDelegate(this)
        closure.setResolveStrategy(Closure.DELEGATE_FIRST)
        return closure.call()
    }

    def methodMissing(String name, def args) {
        this.init()
        if (args) {
            return this.tesseract."$name"(args)
        }
        return this.tesseract."$name"()
    }

    def propertyMissing(String name) {
        this.init()
        return this.tesseract."$name"
    }

    def propertyMissing(String name, def arg) {
        this.init()
        this.tesseract."$name" = arg
    }
}
