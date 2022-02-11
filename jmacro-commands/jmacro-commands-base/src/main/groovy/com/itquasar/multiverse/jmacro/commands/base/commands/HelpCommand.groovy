package com.itquasar.multiverse.jmacro.commands.base.commands

import com.itquasar.multiverse.jmacro.core.Command
import com.itquasar.multiverse.jmacro.core.JMacroCore
import com.itquasar.multiverse.jmacro.core.command.Doc
import groovy.transform.CompileDynamic
import groovy.transform.CompileStatic

import javax.script.ScriptEngine
import java.lang.reflect.Field
import java.lang.reflect.Method
import java.lang.reflect.Modifier
import java.lang.reflect.Parameter

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
        return command.class.declaredFields.toList().findAll {
            !it.name.startsWith('_') && !it.name.startsWith('$')
            // && Modifier.isPublic(it.modifiers)
        }
    }

    List<Method> methods(Object command) {
        return command.class.declaredMethods.toList().findAll {
            !it.name.contains('$') && Modifier.isPublic(it.modifiers)
        }
    }

    private String toString(Command c) {
        return new StringBuilder()
            .append("\n\nCOMMAND\n\n")
            .append("${c.name}: ${c.class.simpleName}\n")
            .append("\tSuper classes: ${getSupers(c.class).join('\n\t\t\t\t')}\n\n")
            .append("\t\t\t${(c.class.getAnnotation(Doc.class)?.value() ?: 'Documentation not provided').split('\n').join('\n\t\t\t')}\n")
            .append("\n\nFIELDS:\n\n")
            .append("${fields(c).collect { toString(it) }.join("\n\n")}")
            .append("\n\nMETHODS:\n\n")
            .append("${methods(c).collect { toString(it) }.join("\n\n")}")
            .replaceAll("\n", "\n\t")
            .replaceAll("\t", "  ")
            .toString()
    }

    private String toString(Method m) {
        return new StringBuilder()
            .append("\t${m.name}(${m.parameters.collect { "${doc(it)?.name() ?: it.name}: ${it.type.simpleName}" }.join(',')}): ${m.returnType.simpleName}\n")
            .append(m.getDeclaringClass().name ? "\t\tDeclaring class: ${m.getDeclaringClass().name}\n" : '')
            .append("\t\t${m.parameters.collect { toString(it) }.join(',')}\n")
            .append("\t\tReturn type: ${getSupers(m.returnType).join(',')}\n")
            .append("\n")
            .append("\t\t\t${(m.getAnnotation(Doc.class)?.value() ?: 'Documentation not provided').split("\n").join("\n\t\t\t")}\n")
            .replaceAll("\t", "  ")
            .toString()
    }

    private String toString(Parameter param) {
        var doc = doc(param)
        return new StringBuilder()
            .append(doc?.name() ? doc.name() : param.name)
            .append(': ')
            .append(doc?.value() ?: 'Documentation not provided')
            .toString()
    }

    private Doc doc(Class<?> clazz) {
        return clazz.getAnnotation(Doc.class)
    }

    private Doc doc(Parameter param) {
        return param.getAnnotation(Doc.class)
    }

    private String toString(Field f) {
        var supers = getSupers(f.type)
        return new StringBuilder()
            .append("\t${f.name}: ${f.type.simpleName}\n")
            .append(supers.size() > 1 ? "\t\t\t${getSupers(f.type).tail().join("\n\t\t\t")}\n" : '')
            .append(f.isEnumConstant() ? "\t\t*Enum Constant*\n" : '')
            .append(f.getDeclaringClass().name ? "\t\tDeclaring class: ${f.getDeclaringClass().name}\n" : '')
            .append("\n\t\t\t${(f.getAnnotation(Doc.class)?.value() ?: 'Documentation not provided').split("\n").join("\n\t\t\t")}\n")
            .replaceAll("\t", "  ")
            .toString()
    }

    private List<String> getSupers(Class<?> clazz) {
        List<String> classes = []
        while (clazz != null) {
            classes.add(clazz.canonicalName.split('\\.').collect { it.charAt(0).isLowerCase() ? it.charAt(0) : it }.join('.'))
            clazz = clazz.getSuperclass()
        }
        return classes
    }
}
