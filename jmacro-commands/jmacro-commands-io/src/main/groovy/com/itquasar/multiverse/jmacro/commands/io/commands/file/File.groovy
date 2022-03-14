package com.itquasar.multiverse.jmacro.commands.io.commands.file

import com.itquasar.multiverse.jmacro.commands.io.InputParsers
import com.itquasar.multiverse.jmacro.core.Command
import com.itquasar.multiverse.jmacro.core.exception.JMacroException
import groovy.transform.CompileDynamic
import groovy.transform.CompileStatic
import org.apache.poi.hssf.usermodel.HSSFWorkbook
import org.apache.poi.ss.usermodel.CellType
import org.apache.poi.ss.usermodel.Workbook
import org.apache.poi.xssf.usermodel.XSSFWorkbook

import javax.script.ScriptContext
import java.nio.charset.Charset
import java.nio.charset.StandardCharsets
import java.nio.file.*
import java.nio.file.attribute.FileAttribute

@CompileStatic
class File implements InputParsers {

    private Path path
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
        this.name = this.path.getFileName()
        this.scriptContext = scriptContext
    }

    @CompileDynamic
    def methodMissing(final String name, final def args) {
        try {
            return Command.methodMissingOn(this.path, name, args)
        } catch (MissingMethodException exPath) {
            MetaMethod method

            def argsToUse

            if (args.length > 0) {
                // try using this.path and option empty array
                for (def attrib : [new OpenOption[0], new CopyOption[0], new LinkOption[0], new FileAttribute[0], new FileAttribute[0]]) {
                    argsToUse = [this.path, *args, attrib]
                    method = Files.metaClass.getMetaMethod(name, *argsToUse)
                    if (method) {
                        return method.invoke(null, method.correctArguments(*argsToUse))
                    }
                }

                // try using this.path + given args
                argsToUse = [this.path, *args]
                method = Files.metaClass.getMetaMethod(name, *argsToUse)
                if (method) {
                    return method.invoke(null, method.correctArguments(argsToUse))
                }

                // try using only given args
                method = Files.metaClass.getMetaMethod(name, *args)
                if (method) {
                    return method.invoke(null, method.correctArguments(args))
                }
            }

            // try using this.path and option empty array
            for (def arr : [new OpenOption[0], new CopyOption[0], new LinkOption[0], new FileAttribute[0], new FileAttribute[0]]) {
                argsToUse = [this.path, arr]
                method = Files.metaClass.getMetaMethod(name, *argsToUse)
                if (method) {
                    return method.invoke(null, method.correctArguments(*argsToUse))
                }
            }

            // try using only this.path
            argsToUse = [this.path]
            method = Files.metaClass.getMetaMethod(name, *argsToUse)
            if (method) {
                return method.invoke(null, method.correctArguments(*argsToUse))
            }

            return Command.propertyMissingOnOrChainToContext(this.scriptContext, this.path.toFile(), name, args)
        }
    }

    @CompileDynamic
    def propertyMissing(String name) {
        try {
            return Command.propertyMissingOn(this.path, name)
        } catch (JMacroException ex) {
            def openOption = StandardOpenOption.values().find { it.name() == name }
            if (openOption) {
                return openOption
            }
            def copyOption = StandardCopyOption.values().find { it.name() == name }
            if (copyOption) {
                return copyOption
            }
            return Command.propertyMissingOnOrChainToContext(this.scriptContext, this.path.toFile(), name)
        }
    }

    @CompileDynamic
    def propertyMissing(String name, def arg) {
        try {
            Command.propertyMissingOn(this.path, name, arg)
        } catch (JMacroException ex) {
            Command.propertyMissingOnOrChainToContext(this.scriptContext, this.path.toFile(), name, arg)
        }
    }

    @Override
    Object getData() {
        if (InputParsers.super.data == null) {
            return read()
        }
        return InputParsers.super.data
    }

    File read(String charset = null) {
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
        return this
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

    @CompileDynamic
    def xlsx(Map<String, ?> args = [drop: 0]) {
        log.debug("Using ${XSSFWorkbook.class} to parse input")
        this.path = this.path ?: Path.of(this.name)
        Workbook workbook = new XSSFWorkbook(this.path.toFile())
        Map<String, List<List>> map = workbook.sheetIterator().collectEntries { sheet ->
            [(sheet.sheetName): sheet.rowIterator().collect { row ->
                row.cellIterator().collect { cell ->
                    String type = cell.cellType.name().toLowerCase().capitalize()
                    switch (cell.cellType) {
                        case CellType.FORMULA:
                            return cell.getCellFormula()
                        case CellType.BLANK:
                            return ''
                        default:
                            return cell."get${type}CellValue"()
                    }
                }
            }
            ]
        }
        workbook.close()
        map = map.collectEntries {
            [(it.key): matrixToMap(it.value.drop(args.drop))]
        }
        this.data = map.size() == 1 ? map.find { true }.value : map
        return this.data
    }


    @CompileDynamic
    def xls(Map<String, ?> args = [drop: 0]) {
        log.debug("Using ${HSSFWorkbook.class} to parse input")
        this.path = this.path ?: Path.of(this.name)
        Workbook workbook = new HSSFWorkbook(new FileInputStream(this.path.toFile()))
        Map<String, List<List>> map = workbook.sheetIterator().collectEntries { sheet ->
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
                                return cell."get${type}CellValue"()
                        }
                    }
                }
            ]
        }
        workbook.close()
        map = map.collectEntries {
            [(it.key): matrixToMap(it.value.drop(args.drop))]
        }
        this.data = map.size() == 1 ? map.find { true }.value : map
        return this.data
    }

    @CompileDynamic
    private List<Map<String, ?>> matrixToMap(List<List> matrix) {
        List headers = matrix.first()
        List<List> rows = matrix.tail()
        return rows.collect { row ->
            row.withIndex().collectEntries { element, Integer index ->
                [(headers[index]): element]
            }
        }
    }

}
