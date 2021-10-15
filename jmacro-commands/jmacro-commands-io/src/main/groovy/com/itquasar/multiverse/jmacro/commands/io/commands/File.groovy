package com.itquasar.multiverse.jmacro.commands.io.commands


import com.itquasar.multiverse.jmacro.commands.io.InputParsers
import com.itquasar.multiverse.jmacro.commands.io.OutputSerializers
import com.itquasar.multiverse.jmacro.core.GroovyCommand
import com.itquasar.multiverse.jmacro.core.exceptions.JMacroException
import groovy.transform.CompileDynamic
import groovy.transform.CompileStatic
import groovy.transform.ToString
import groovy.util.logging.Log4j2
import org.apache.poi.hssf.usermodel.HSSFWorkbook
import org.apache.poi.ss.usermodel.CellType
import org.apache.poi.ss.usermodel.Workbook
import org.apache.poi.xssf.usermodel.XSSFWorkbook

import javax.swing.*
import javax.swing.filechooser.FileFilter

@Log4j2
@CompileStatic
@ToString(includePackage = false, includeNames = true, includeFields = true, includes = ['name', 'type'])
class File implements GroovyCommand, InputParsers, OutputSerializers {

    java.io.File file

    def call(Closure closure) {
        File newInstance = new File()
        newInstance.context = this.context
        closure.delegate = newInstance
        closure.resolveStrategy = Closure.DELEGATE_FIRST
        closure()
        this
    }

    File open(Map<String, ?> args, String... exts = []) {
        JFileChooser chooser = new JFileChooser(System.getProperty("user.home"))
        chooser.setDialogTitle(args.title ? args.title.toString() : 'Selecione o arquivo')
        chooser.multiSelectionEnabled = false
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY)
        if (exts) {
            chooser.setFileFilter(new FileFilter() {

                @Override
                boolean accept(java.io.File f) {
                    String ext = f.getName()
                    ext = ext.substring(ext.lastIndexOf('.') + 1).toLowerCase()
                    return f.isDirectory() || ext in exts
                }

                @Override
                String getDescription() {
                    return exts.join(', ')
                }
            })
        }
        if (chooser.showDialog(null, 'Selecionar') == JFileChooser.APPROVE_OPTION) {
            this.file = chooser.getSelectedFile()
            return this
        }
        throw new JMacroException(this, 'Nenhum arquivo selecionado')
    }

    File read(String name = null, String charset = null) {
        name = name ?: this.file.name
        this.name = name.startsWith('~')
            ? System.getProperty('user.home') + java.io.File.separator + name.substring(2)
            : name
        this.data = null
        this.type = name.substring(name.lastIndexOf('.') + 1).toLowerCase()
        this.charset = charset ?: this.charset

        switch (this.type) {
            case 'xlsx':
                this.getXlsx();
                break
            case 'xls':
                this.getXls();
                break
            case 'xml':
                this.getXml()
                break
            case 'json':
                this.getJson()
                break
            case 'csv':
                this.getCsv()
                break
            case 'txt':
                this.data = raw
                break
            default:
                throw new Error("File type $type unknow!")
        }
        return this
    }

    void write(String givenName, String charset = null) {
        this.name = givenName.startsWith('~')
            ? System.getProperty('user.home') + java.io.File.separator + givenName.substring(2)
            : givenName
        this.file = new java.io.File(this.name)
        log.info("Writing file ${this.file.canonicalPath}")
        this.charset = charset ?: this.charset
        file.write(outputContent, this.charset)
    }

    String getRaw() {
        java.io.File file = new java.io.File(this.name)
        log.info("Reading file ${this.file.canonicalPath}")
        if (!file.exists()) {
            throw new JMacroException(this, "File ${file.canonicalPath} not found!")
        }
        return file.getText(this.charset)
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
        this.file = this.file ?: new java.io.File(this.name)
        Workbook workbook = new XSSFWorkbook(this.file)
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
        this.file = this.file ?: new java.io.File(this.name)
        Workbook workbook = new HSSFWorkbook(new FileInputStream(this.file))
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
