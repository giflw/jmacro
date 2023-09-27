package com.itquasar.multiverse.jmacro.commands.io.commands

import com.itquasar.multiverse.jmacro.commands.io.commands.file.File
import com.itquasar.multiverse.jmacro.core.command.AbstractCommand
import com.itquasar.multiverse.jmacro.core.engine.Core
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware
import com.itquasar.multiverse.jmacro.core.exception.JMacroException

import javax.swing.*
import javax.swing.filechooser.FileFilter
import java.io.File as JFile
import java.nio.file.Path
import java.util.function.Consumer

class FileCommand extends AbstractCommand {

    FileCommand(Core core, ScriptEngineAware scriptEngineAware) {
        super(core, scriptEngineAware)
    }

    def call(String path) {
        return call(path, Closure.IDENTITY)
    }

    def call(JFile file) {
        return call(file, Closure.IDENTITY)
    }

    def call(Path path) {
        return call(path, Closure.IDENTITY)
    }

    /**
     * file("name") {*     consumer....
     *}* @param filename
     * @param consumer
     * @return
     */
    def call(String path, Consumer<File> consumer) {
        return call(Path.of(path), consumer)
    }

    def call(JFile file, Consumer<File> consumer) {
        return call(file.toPath(), consumer)
    }

    def call(Path path, Consumer<File> consumer) {
        def file = new File(path, scriptEngine.context)
        return consumer.accept(file) ?: file
    }

    /**
     * JFileChooser.
     *
     * file(title: "foo")
     *
     * @param args
     * @param exts
     * @return
     */
    File call(Map<String, String> args, String... exts = []) {
        JFileChooser chooser = new JFileChooser(args.directory ? args.directory : System.getProperty("user.home"))
        chooser.setDialogTitle(args.title ? args.title.toString() : 'Choose file')
        chooser.multiSelectionEnabled = false
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY)
        if (exts) {
            chooser.setFileFilter(new FileFilter() {

                @Override
                boolean accept(JFile f) {
                    String ext = f.getName()
                    ext = ext.substring(ext.lastIndexOf('.') + 1).toLowerCase()
                    return f.isDirectory() || ext in exts
                }

                @Override
                String getDescription() {
                    return exts.join(', ')
                }
            })
        }
        if (chooser.showDialog(null, 'Select') == JFileChooser.APPROVE_OPTION) {
            JFile file = chooser.getSelectedFile()
            return new File(file, scriptEngine.getContext())
        }
        throw new JMacroException(this, 'No files selected')
    }
}
