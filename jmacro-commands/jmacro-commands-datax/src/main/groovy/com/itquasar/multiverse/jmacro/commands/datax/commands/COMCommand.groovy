package com.itquasar.multiverse.jmacro.commands.datax.commands


import com.itquasar.multiverse.jmacro.commands.datax.commands.com.COMWrapper
import com.itquasar.multiverse.jmacro.core.command.AbstractCommand
import com.itquasar.multiverse.jmacro.core.command.Command
import com.itquasar.multiverse.jmacro.core.engine.Core
import com.itquasar.multiverse.jmacro.core.engine.ScriptEngineAware
import com.jacob.activeX.ActiveXComponent
import com.jacob.com.ComThread
import com.jacob.com.LibraryLoader
import com.jacob.com.Variant
import groovy.transform.CompileDynamic

import javax.script.ScriptEngine
import java.util.concurrent.atomic.AtomicBoolean
import java.util.function.Consumer

class COMCommand extends AbstractCommand implements AutoCloseable {

    @Lazy
    static final Variant NO_PARAM = { new Variant().putNoParam() }()

    private final AtomicBoolean started = new AtomicBoolean(false)

    static enum Application {
        ACCESS('Access.Application'),
        EXCEL('Excel.Application'),
        OUTLOOK('Outlook.Application'),
        POWERPOINT('PowerPoint.Application'),
        PROJECT('Project.Application'),
        PUBLISHER('Publisher.Application'),
        VISIO('Visio.Application'),
        WORD('Word.Application');

        private final String activeXName

        Application(String activeXName) {
            this.activeXName = activeXName
        }
    }

    @CompileDynamic
    @Override
    void allCommandsLoaded(Collection<? extends Command> Command) {
        Application.values().each {
            // FIXME NPE on constants
            bindings.constants?.put(it.name(), it)
        }
    }

    def call(Application application, Consumer<COMWrapper> consumer = null) {
        if (started.compareAndSet(false, true)) {
            ComThread.startMainSTA()
        }
        if (!ComThread.haveSTA) {
            ComThread.InitSTA()
        }
        COMWrapper wrapper = new COMWrapper(
            application,
            [:],
            this.bindings,
            new ActiveXComponent(application.activeXName) // Instance of application object created.
        )
        if (consumer != null) {
            wrapper.call(consumer)
        }
        return wrapper
    }

    COMCommand(String name, Core core, ScriptEngineAware scriptEngineAware) {
        super(name, core, scriptEngineAware)
        if (!System.getProperty("jacob.dll.path")) {
            def dllPath = core.configuration.folders.bin().resolve(LibraryLoader.getPreferredDLLName() + ".dll").toString()
            System.setProperty("jacob.dll.path", dllPath)
        }
        getScriptLogger().warn("JACOB dll: " + System.getProperty("jacob.dll.path"))
    }

    @Override
    void close() throws Exception {
        if (started.compareAndSet(true, false)) {
            if (ComThread.haveSTA) {
                ComThread.Release()
            }
            ComThread.quitMainSTA()
        }
    }


}

/*
COMCommand.start(COMCommand.Application.EXCEL) {
    File file = new File("TESTE_JACOB.xlsm");  // file to be opened.
    try {
        println "version $version"
        DisplayAlerts = false
        Visible = true
        //def workbook = Workbooks.Add(file.getAbsolutePath())
        def workbook = Workbooks.Open(file.getAbsolutePath())
        def worksheet = workbook.Worksheets("Sheet2")
        worksheet.Activate()
        println worksheet.Evaluate('A1').Value
        println worksheet.Evaluate('A2').Value
        worksheet.Evaluate('A3').Value = 30
        worksheet.Evaluate('A4').Value = 60
        println worksheet.Evaluate('A3').Value

        //workbook.SaveAs(file.absolutePath)//, 'xlOpenXMLWorkbookMacroEnabled')//, NO_PARAM, NO_PARAM, NO_PARAM, NO_PARAM, NO_PARAM, 'xlLocalSessionChanges')
        workbook.Save()
        boolean saveChanges = false
        workbook.Close(saveChanges)
        DisplayAlerts = true
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        Quit()
        ComThread.Release()
    }
}
 */
