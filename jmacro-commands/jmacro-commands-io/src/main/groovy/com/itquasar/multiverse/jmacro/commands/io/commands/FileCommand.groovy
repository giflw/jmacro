package com.itquasar.multiverse.jmacro.commands.io.commands

import com.itquasar.multiverse.jmacro.commands.io.commands.file.File
import com.itquasar.multiverse.jmacro.core.Command
import com.itquasar.multiverse.jmacro.core.JMacroCore
import com.itquasar.multiverse.jmacro.core.exception.JMacroException

import javax.script.ScriptEngine
import javax.swing.*
import javax.swing.filechooser.FileFilter
import java.io.File as JFile
import java.nio.file.Path

class FileCommand extends Command {

    FileCommand(JMacroCore core, ScriptEngine scriptEngine) {
        super(core, scriptEngine)
    }

    File call(String path) {
        return call(path, Closure.IDENTITY)
    }

    File call(JFile file) {
        return call(file, Closure.IDENTITY)
    }

    File call(Path path) {
        return call(path, Closure.IDENTITY)
    }

    /**
     * file("name") {*     closure....
     *}* @param filename
     * @param closure
     * @return
     */
    File call(String path, Closure closure) {
        return call(Path.of(path), closure)
    }

    File call(JFile file, Closure closure) {
        return call(file.toPath(), closure)
    }

    File call(Path path, Closure closure) {
        def file = new File(path)
        closure.delegate = file
        closure.resolveStrategy = Closure.DELEGATE_FIRST
        closure.call()
        return file
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
            return new File(file)
        }
        throw new JMacroException(this, 'No files selected')
    }
}
