package com.itquasar.multiverse.jmacro.commands.datax.commands

import com.jacob.activeX.ActiveXComponent
import com.jacob.com.ComThread
import com.jacob.com.Dispatch
import com.jacob.com.LibraryLoader
import com.jacob.com.Variant

import java.util.concurrent.Callable

class COMCommand implements AutoCloseable {

    static {
        System.setProperty("jacob.dll.path", LibraryLoader.getPreferredDLLName() + ".dll")
    }

    @Override
    String toString() {
        return context
    }

    static Variant NO_PARAM = { new Variant().putNoParam() }()

    static enum Application {
        EXCEL('Excel.Application');

        private final String activeXName

        private Application(String activeXName) {
            this.activeXName = activeXName
        }

    }

    static start(Application application, Closure closure = null) {
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

    private def context
    private Callable closeCallback

    COMCommand(context = null, Callable closeCallback = null) {
        if (Variant.isInstance(context)) {
            Variant variant = (Variant) context
            context = variant.getvt() == Variant.VariantDispatch ? variant.toDispatch() : variant
        }
        this.context = context
        this.closeCallback = closeCallback
    }

    def call(Closure closure) {
        closure.delegate = this
        closure.resolveStrategy = Closure.DELEGATE_FIRST
        closure()
    }

    /*def call(args) {
        println("C $args")
        String name = args.class.isArray() ? args[0] : args
        Dispatch.call(context.toDispatch(), name, *(args.tail().collect { new Variant(it) }))
    }*/

    def methodMissing(String name, args) {
        def object = context.respondsTo('toDispatch') ? context.toDispatch() : context
        def transform = { value ->
            value = GString.isInstance(value) ? value.toString() : value
            value = List.isInstance(value) ? value.collect { new Variant(it) }.toArray() :
                new Variant(value)
            return value
        }
        return new COMCommand(Dispatch.call(object, name, *(args.collect {
            transform(it)
        })))
    }

    def propertyMissing(String name, def value = null) {
        if (value) {
            Dispatch.put(context, name, new Variant(value))
        } else {
            return new COMCommand(Dispatch.get(context, name))
        }
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
