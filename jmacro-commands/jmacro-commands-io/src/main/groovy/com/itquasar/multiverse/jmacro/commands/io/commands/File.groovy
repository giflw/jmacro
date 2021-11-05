package com.itquasar.multiverse.jmacro.commands.io.commands

import com.itquasar.multiverse.jmacro.commands.io.commands.file.File as FileAction
import com.itquasar.multiverse.jmacro.core.exception.JMacroException
import groovy.transform.CompileStatic
import groovy.util.logging.Log4j2

import javax.swing.*
import javax.swing.filechooser.FileFilter
import java.io.File as JFile

@Log4j2
@CompileStatic
class File {

    FileAction call(String filename) {
        return call(filename, Closure.IDENTITY)
    }

    /**
     * file("name") {*     closure....
     *}* @param filename
     * @param closure
     * @return
     */
    FileAction call(String filename, Closure closure) {
        def fileAction = new FileAction(new JFile(filename))
        fileAction.call(closure)
        fileAction
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
    FileAction call(Map<String, String> args, String... exts = []) {
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
            return new FileAction(file)
        }
        throw new JMacroException(this, 'No files selected')
    }
}
