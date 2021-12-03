package com.itquasar.multiverse.jmacro.commands.io.commands.file

import com.itquasar.multiverse.jmacro.commands.io.InputParsers
import groovy.transform.CompileDynamic
import groovy.transform.CompileStatic
import org.apache.poi.hssf.usermodel.HSSFWorkbook
import org.apache.poi.ss.usermodel.CellType
import org.apache.poi.ss.usermodel.Workbook
import org.apache.poi.xssf.usermodel.XSSFWorkbook

import java.nio.charset.Charset
import java.nio.charset.StandardCharsets
import java.nio.file.CopyOption
import java.nio.file.Files
import java.nio.file.OpenOption
import java.nio.file.Path

@CompileStatic
class File implements InputParsers {

    private Path path

    File(java.io.File file) {
        this(file.toPath())
    }

    File(String path) {
        this(Path.of(path))
    }

    File(Path path) {
        this.path = path
        this.name = this.path.getFileName()
    }

    @Override
    Object getData() {
        if (InputParsers.super.data == null) {
            read()
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
