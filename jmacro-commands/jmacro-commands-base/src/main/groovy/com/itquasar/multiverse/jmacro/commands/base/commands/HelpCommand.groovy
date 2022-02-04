package com.itquasar.multiverse.jmacro.commands.base.commands

import com.itquasar.multiverse.jmacro.core.Command
import com.itquasar.multiverse.jmacro.core.JMacroCore
import com.itquasar.multiverse.jmacro.core.command.CommandDoc
import groovy.transform.CompileDynamic
import groovy.transform.CompileStatic

import javax.script.ScriptEngine
import java.lang.reflect.Field
import java.lang.reflect.Method

@CompileStatic
class HelpCommand extends Command {

    HelpCommand(String name, JMacroCore core, ScriptEngine scriptEngine) {
        super(name, core, scriptEngine)
    }

    @CompileDynamic
    void call() {
        echo toString(this)
    }

    @CompileDynamic
    void call(Command command) {
        echo toString(command)
    }

    @CompileDynamic
    void call(Object command, String name) {
        echo(
            [
                fields(command).findAll { it.name == name }.collect {
                    toString(it)
                }.join("\n"),
                methods(command).findAll { it.name == name }.collect {
                    toString(it)
                }.join("\n")
            ].join("\n")
        )
    }

    List<Field> fields(Object command) {
        return command.class.declaredFields.toList().findAll { !it.name.startsWith('_') && !it.name.startsWith('$') }
    }

    List<Method> methods(Object command) {
        return command.class.declaredMethods.toList().findAll { !it.name.contains('$') }
    }

    private String toString(Command c) {
        return """
        |${c.name}: ${c.class.simpleName}
        |Command: ${getSupers(c.class).join(',')}
        |=============================================
        |
        |${c.class.getAnnotation(CommandDoc.class)?.value() ?: 'Documentation not provided'}
        |
        |
        |Fields:
        |---------------------------------------------
        |
        |${fields(c).collect { toString(it) }.join("\n|\n|")}
        |
        |
        |Methods:
        |---------------------------------------------
        |
        |${methods(c).collect { toString(it) }.join("\n|\n|")}
        """.stripMargin("|")
    }

    private String toString(Method m) {
        return """
        |${m.name}(${m.parameterTypes.collect { it.simpleName }.join(',')}): ${m.returnType.simpleName}
        |Declaring class: ${m.getDeclaringClass().name ?: '<NONE>'}
        |Return type: ${getSupers(m.returnType).join(',')}
        |
        |${m.getAnnotation(CommandDoc.class)?.value() ?: 'Documentation not provided'}
        """.stripMargin("|")
    }

    private String toString(Field f) {
        return """
        |${f.name}: ${f.type.simpleName}
        |${getSupers(f.type).join(',')}
        |Enum constant: ${f.isEnumConstant()}
        |Declaring class: ${f.getDeclaringClass().name ?: '<NONE>'}
        |
        |${f.getAnnotation(CommandDoc.class)?.value() ?: 'Documentation not provided'}
        """.stripMargin("|")
    }

    private List<Class<?>> getSupers(Class<?> clazz) {
        List<Class<?>> classes = [clazz]
        while (clazz != null) {
            clazz = clazz.getSuperclass()
            classes.add(clazz)
        }
        return classes
    }
}
