package com.itquasar.multiverse.jmacro.commands.datax.commands.com

import com.itquasar.multiverse.jmacro.core.Command
import com.jacob.com.ComThread
import com.jacob.com.Dispatch
import com.jacob.com.Variant
import com.jacob.com.VariantUtilities
import groovy.transform.CompileDynamic

import javax.script.Bindings
import java.util.concurrent.Callable

class COMWrapper implements AutoCloseable {

    private def context
    private Callable closeCallback
    private Bindings bindings

    // FIXME Refactor to factory for Variant and Dispatch
    COMWrapper(Bindings bindings, context = null, Callable closeCallback = null) {
        this.bindings = bindings
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

    @CompileDynamic
    def methodMissing(String name, args) {
        try {
            return Command.methodMissingOn(this.bindings, name, args)
        } catch (MissingMethodException exception) {
            def object = context.respondsTo('toDispatch') ? context.toDispatch() : context
            def transform = { value ->
                value = GString.isInstance(value) ? value.toString() : value
                value = List.isInstance(value) ? value.collect { new Variant(it) }.toArray() : new Variant(value)
                return value
            }
            return new COMWrapper(
                this.bindings,
                Dispatch.call(
                    object,
                    name,
                    *(args.collect {
                        transform(it)
                    })
                )
            )
        }
    }

    def propertyMissing(String name, def value = null) {
        if (value) {
            Dispatch.put((Dispatch) context, name, new Variant(value))
        } else {
            if (this.bindings.containsKey(name)) {
                return this.bindings.get(name)
            }
            return new COMWrapper(this.bindings, Dispatch.get((Dispatch) context, name))
        }
    }


    @Override
    void close() throws Exception {
        if (ComThread.haveSTA) {
            ComThread.Release()
        }
    }

    @Override
    String toString() {
        return context
    }
}

/*
COMWrapper.start(COMWrapper.Application.EXCEL) {
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
