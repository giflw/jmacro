package com.itquasar.multiverse.jmacro.commands.base.commands

import com.itquasar.multiverse.jmacro.core.Command
import com.itquasar.multiverse.jmacro.core.JMacroCore
import com.itquasar.multiverse.jmacro.core.command.Doc

import javax.script.ScriptEngine
import java.lang.reflect.Field
import java.lang.reflect.Method
import java.lang.reflect.Modifier
import java.lang.reflect.Parameter

class HelpCommand extends Command {

    HelpCommand(String name, JMacroCore core, ScriptEngine scriptEngine) {
        super(name, core, scriptEngine)
    }

    @Doc("Show help for this command.")
    void call() {
        echo toString(this)
    }

    @Doc("Show help for given command.")
    void call(Command command) {
        echo toString(command)
    }

    @Doc("Show help for given command or object.")
    void call(Object object) {
        echo toString(object)
    }

    @Doc("Show help for fields and methods with given name on given command instance.")
    void call(Command command, String name) {
        echo toString(command, command.name, name)
    }

    @Doc("Show help for fields and methods with given name on given object instance.")
    void call(Object object, String name) {
        echo toString(object, object.class.simpleName, name)
    }

    private List<Field> fields(Object object) {
        return object.class.declaredFields.toList().findAll {
            !it.name.startsWith('_') && !it.name.startsWith('$')
            // && Modifier.isPublic(it.modifiers)
        }
    }

    private List<Method> methods(Object object) {
        return object.class.declaredMethods.toList().findAll {
            !it.name.contains('$') && Modifier.isPublic(it.modifiers)
        }
    }

    private String toString(Command command) {
        return toString(command, command.name, name)
    }

    private String toString(Object object) {
        return toString(object, object.class.simpleName, name)
    }

    private String toString(Object obj, String commandName, String fieldOrMethodName) {
        String fields = fields(obj).findAll { fieldOrMethodName == null || it.name == fieldOrMethodName }.collect { toString(it) }.join("\n\n")
        String methods = methods(obj).findAll { fieldOrMethodName == null || it.name == fieldOrMethodName }.collect { toString(it) }.join("\n\n")

        return new StringBuilder()
            .append("\n\n${Command.isInstance(obj) ? 'COMMAND' : 'OBJECT'}\n\n")
            .append("${commandName}: ${obj.class.simpleName}\n")
            .append("\tSuper classes: ${getSupers(obj.class).join('\n\t\t\t\t')}\n\n")
            .append("\t\t\t${(obj.class.getAnnotation(Doc.class)?.value() ?: 'Documentation not provided').split('\n').join('\n\t\t\t')}\n")
            .append("${fields ? "\n\nFIELDS:\n\n$fields" : ''}")
            .append("${methods ? "\n\nMETHODS:\n\n$methods" : ''}")
            .replaceAll("\n", "\n\t")
            .replaceAll("\t", "  ")
            .toString()
    }

    private String toString(Method m) {
        return new StringBuilder()
            .append("\t${m.name}(${m.parameters.collect { "${doc(it)?.name() ?: it.name}: ${it.type.simpleName}" }.join(', ')}): ${m.returnType.simpleName}\n")
            .append(m.getDeclaringClass().name ? "\t\tDeclaring class: ${m.getDeclaringClass().name}\n" : '')
            .append("${m.parameters.collect { "\t\t${toString(it)}\n" }.join('')}")
            .append("\t\tReturn type: ${getSupers(m.returnType).join(' < ')}\n")
            .append("\n")
            .append("\t\t\t${(m.getAnnotation(Doc.class)?.value()?.stripIndent(true) ?: 'Documentation not provided').split("\n").join("\n\t\t\t")}\n")
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
            classes.add(
                clazz.canonicalName.contains('.')
                    ? clazz.canonicalName.split('\\.').collect { it.charAt(0).isLowerCase() ? it.charAt(0) : it }.join('.')
                    : clazz.canonicalName
            )
            clazz = clazz.getSuperclass()
        }
        return classes
    }
}
