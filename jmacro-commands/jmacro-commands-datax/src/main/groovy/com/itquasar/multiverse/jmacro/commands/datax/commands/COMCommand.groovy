package com.itquasar.multiverse.jmacro.commands.datax.commands

import com.itquasar.multiverse.jmacro.core.Command
import com.itquasar.multiverse.jmacro.core.JMacroCore
import com.jacob.activeX.ActiveXComponent
import com.jacob.com.ComThread
import com.jacob.com.LibraryLoader
import com.jacob.com.Variant

import javax.script.ScriptEngine

class COMCommand extends Command implements AutoCloseable {

    @Lazy
    static final Variant NO_PARAM = { new Variant().putNoParam() }()

    static enum Application {
        EXCEL('Excel.Application'),
        OUTLOOK('Outlook.Application'),
        POWERPOINT('PowerPoint.Application'),
        WORD('Word.Application');

        private final String activeXName

        private Application(String activeXName) {
            this.activeXName = activeXName
        }
    }

    def start(Application application, Closure closure = null) {
        if (!ComThread.haveSTA) {
            ComThread.InitSTA()
        }
        COMCommand wrapper = new COMCommand(
            new ActiveXComponent(application.activeXName) // Instance of application object created.
        )
        if (closure != null) {
            wrapper.call(closure)
        }
        return wrapper
    }

    COMCommand(JMacroCore core, ScriptEngine scriptEngine) {
        super(core, scriptEngine)
        if (!System.getProperty("jacob.dll.path")) {
            def dllPath = core.configuration.folders.bin().resolve(LibraryLoader.getPreferredDLLName() + ".dll").toString()
            System.setProperty("jacob.dll.path", dllPath);
        }
        getLogger().warn("JACOB dll: " + System.getProperty("jacob.dll.path"));
    }

    @Override
    void close() throws Exception {
        if (ComThread.haveSTA) {
            ComThread.Release()
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
