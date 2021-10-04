package com.itquasar.multiverse.jmacro.engine;

import javax.script.*;
import java.io.PrintWriter;
import java.io.StringWriter;

public class Engine {

    public static void main(String[] args) throws Exception {
        ScriptEngineManager manager = new ScriptEngineManager();
        manager.getEngineFactories().forEach(engine -> {
            System.out.println(engine);
            System.out.println("\tNAME:" + engine.getEngineName());
            System.out.println("\tLANG:" + engine.getLanguageName() + " v" + engine.getLanguageVersion());
            System.out.println("\tEXTS: " + engine.getExtensions());
            System.out.println("\tALIAS: " + engine.getNames());
        });

        System.out.println("====================");
        ScriptEngine engine = manager.getEngineByName("ruby");

        StringWriter strWrtr = new StringWriter();

        engine.getContext().setWriter(strWrtr);
        // set global variable
        engine.getBindings(ScriptContext.GLOBAL_SCOPE).put("x", "hello");

        // evaluate JavaScript code that prints the variable (x = "hello")
        //engine.eval("println(x)");
        engine.eval("puts x");

        // define a different script context
        ScriptContext newContext = new SimpleScriptContext();
        newContext.setWriter(strWrtr);
        newContext.setBindings(engine.createBindings(), ScriptContext.ENGINE_SCOPE);
        Bindings engineScope = newContext.getBindings(ScriptContext.ENGINE_SCOPE);

        // set the variable to a different value in another scope
        engineScope.put("x", "world");

        // evaluate the same code but in a different script context (x = "world")
        //engine.eval("println(x)", newContext);
        engine.eval("puts x", newContext);

        System.out.println("START OUTPUT");
        System.out.println(strWrtr);
        System.out.println("DONE!");
    }
}
