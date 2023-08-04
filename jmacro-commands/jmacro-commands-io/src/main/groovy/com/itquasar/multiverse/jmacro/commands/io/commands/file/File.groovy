package com.itquasar.multiverse.jmacro.commands.io.commands.file

import com.itquasar.multiverse.jmacro.commands.io.InputParsers
import com.itquasar.multiverse.jmacro.core.command.CommandUtils
import com.itquasar.multiverse.jmacro.core.exception.JMacroException
import com.itquasar.multiverse.jmacro.core.interfaces.Constants
import groovy.transform.CompileDynamic
import org.apache.poi.hssf.usermodel.HSSFWorkbook
import org.apache.poi.ss.usermodel.CellType
import org.apache.poi.ss.usermodel.Workbook
import org.apache.poi.xssf.usermodel.XSSFWorkbook

import javax.script.ScriptContext
import java.nio.charset.Charset
import java.nio.charset.StandardCharsets
import java.nio.file.*
import java.nio.file.attribute.FileAttribute

class File implements InputParsers, Constants {

    private Path path
    private Path _
    private String ext
    private String baseName
    private final ScriptContext scriptContext

    File(java.io.File file, ScriptContext scriptContext) {
        this(file.toPath(), scriptContext)
    }

    File(String path, ScriptContext scriptContext) {
        this(Path.of(path), scriptContext)
    }

    File(Path path, ScriptContext scriptContext) {
        // if ~ is first char on path, replaces it by user home
        if (path.startsWith("~")) {
            path = Path.of("~").relativize(path)
            path = Path.of(System.getProperty("user.home")).resolve(path)
        }
        this.path = path
        this._ = path
        this.name = this.path.getFileName().toString()
        if (this.name.contains('.')) {
            this.baseName = this.name.substring(0, this.name.lastIndexOf('.'))
            this.ext = this.name.substring(this.name.lastIndexOf('.') + 1)
        } else {
            this.baseName = this.name
            this.ext = ''
        }
        this.scriptContext = scriptContext
    }

    @CompileDynamic
    def methodMissing(final String name, final def args) {
        try {
            return CommandUtils.methodMissingOn(this.path, name, args)
        } catch (MissingMethodException exPath) {
            MetaMethod method

            def argsToUse

            if (Object[].class.isInstance(args) && ((Object[]) args).length > 0) {
                // try using this.path and option empty array
                for (def attrib : [
                    new OpenOption[0],
                    new CopyOption[0],
                    new LinkOption[0],
                    new FileAttribute[0],
                    new FileAttribute[0]
                ]) {
                    argsToUse = [this.path, *args, attrib]
                    method = Files.metaClass.getMetaMethod(name, argsToUse)
                    if (method) {
                        return method.invoke(null, method.correctArguments(argsToUse))
                    }
                }

                // try using this.path + given args
                argsToUse = [this.path, *args]
                method = Files.metaClass.getMetaMethod(name, argsToUse)
                if (method) {
                    return method.invoke(null, method.correctArguments(argsToUse))
                }

                // try using only given args
                method = Files.metaClass.getMetaMethod(name, args)
                if (method) {
                    return method.invoke(null, method.correctArguments(args))
                }
            }

            // try using this.path and option empty array
            for (def arr : [
                new OpenOption[0],
                new CopyOption[0],
                new LinkOption[0],
                new FileAttribute[0],
                new FileAttribute[0]
            ]) {
                argsToUse = [this.path, arr]
                method = Files.metaClass.getMetaMethod(name, argsToUse)
                if (method) {
                    return method.invoke(null, method.correctArguments(argsToUse))
                }
            }

            // try using only this.path
            argsToUse = [this.path]
            method = Files.metaClass.getMetaMethod(name, argsToUse)
            if (method) {
                return method.invoke(null, method.correctArguments(argsToUse))
            }

            return CommandUtils.methodMissingOnOrChainToContext(this.scriptContext, this.path.toFile(), name, args)
        }
    }

    def propertyMissing(String name) {
        try {
            return CommandUtils.propertyMissingOn(this.path, name)
        } catch (JMacroException ex) {
            def openOption = StandardOpenOption.values().find { it.name() == name }
            if (openOption) {
                return openOption
            }
            def copyOption = StandardCopyOption.values().find { it.name() == name }
            if (copyOption) {
                return copyOption
            }
            def linkOption = LinkOption.values().find { it.name() == name }
            if (linkOption) {
                return linkOption
            }
            return CommandUtils.propertyMissingOnOrChainToContext(this.scriptContext, this.path.toFile(), name)
        }
    }

    def propertyMissing(String name, def arg) {
        try {
            CommandUtils.propertyMissingOn(this.path, name, arg)
        } catch (JMacroException ex) {
            CommandUtils.propertyMissingOnOrChainToContext(this.scriptContext, this.path.toFile(), name, arg)
        }
    }

    @Override
    Object getData() {
        if (InputParsers.super.data == null) {
            return read()
        }
        return InputParsers.super.data
    }

    Object read(String charset = null) {
        this.type = name.substring(name.lastIndexOf('.') + 1).toLowerCase()
        this.charset = charset ?: this.charset

        switch (this.type) {
            case 'xlsx':
                this.data = this.getXlsx()
                break
            case 'xls':
                this.data = this.getXls()
                break
            case 'xml':
                this.data = this.getXml()
                break
            case 'json':
                this.data = this.getJson()
                break
            case 'csv':
                this.data = this.getCsv()
                break
            case 'txt':
                this.data = raw
                break
            default:
                throw new Error("File type $type unknow!")
        }
        return this.data
    }

    Path write(String text, OpenOption... options) {
        return write(text, StandardCharsets.UTF_8, options)
    }

    Path write(String text, String charset, OpenOption... options) {
        return write(text, Charset.forName(charset), options)
    }

    Path write(String text, Charset charset, OpenOption... options) {
        return Files.write(path, text.getBytes(charset), options)
    }

    long write(InputStream input, CopyOption... options) {
        return Files.copy(input, path, options)
    }

    @Override
    String getText() {
        return Files.readString(path, Charset.forName(charset))
    }

    private byte[] getRaw() {
        return this.path.toFile().readBytes()
    }

    def getXlsx() {
        return xlsx()
    }

    def getXls() {
        return xls()
    }

    def xlsx(Map<String, Object> args = null) {
        this.data = xlWorkbook(XSSFWorkbook.class, args)
        return this.data
    }

    def xls(Map<String, Object> args = null) {
        this.data = xlWorkbook(HSSFWorkbook.class, args)
        return this.data
    }

    private def xlWorkbook(Class<?> workbookHandler, Map<String, Object> args) {
        Map<String, Object> defaults = [drop: 0, map: true, sheet: null, firstSheetAsRoot: true, headers: [:]]
        args = args ?: defaults
        defaults.each { k, v ->
            args.putIfAbsent(k, v)
        }
        this.path = this.path ?: Path.of(this.name)
        CommandUtils.log(scriptContext, DEBUG, "Using ${workbookHandler} to parse input with ${args}")

        Workbook workbook = (Workbook) workbookHandler.newInstance(new FileInputStream(this.path.toFile()))
        def data = extractXLData(workbook)
        workbook.close()

        if (args.map) {
            data = data.findAll { !it.value.isEmpty() }.collectEntries {
                [(it.key): matrixToMap(it.value.drop((int) args.drop), (Map<String, String>) args.headers)]
            }
        }
        // get given sheet by name
        if (args.sheet != null) {
            data = data[args.sheet]
        } else {
            // git first sheet if only one found
            data = args.firstSheetAsRoot && data.size() == 1 ? data.find { true }.value : data
        }

        return data
    }

    static private Map<String, List<List>> extractXLData(Workbook workbook) {
        return workbook.sheetIterator().collectEntries { sheet ->
            [
                (sheet.sheetName): sheet.rowIterator().collect { row ->
                    row.cellIterator().collect { cell ->
                        String type = cell.cellType.name().toLowerCase().capitalize()
                        switch (cell.cellType) {
                            case CellType.FORMULA:
                                return cell.getCellFormula()
                            case CellType.BLANK:
                                return ''
                            default:
                                return cell.invokeMethod("get${type}CellValue", null)
                        }
                    }
                }
            ]
        }
    }

    static private List<Map<String, ?>> matrixToMap(List<List> matrix, Map<String, String> headersMap) {
        List<String> headers = matrix.first()
        List<List> rows = matrix.tail()
        return rows.stream().map { row ->
            row.withIndex().collectEntries { element, index ->
                String name = headers[index as Integer]
                [(headersMap.getOrDefault(name, name)): element]
            }
        }.toList() as List<Map<String, ?>>
    }
}
