package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlfileformat">https://docs.microsoft.com/en-us/office/vba/api/excel.xlfileformat</a>}
*/
public enum XlFileFormat implements COMEnum {
    
    /**@ Microsoft Excel 97-2003 Add-In */
    xlAddIn(18),    
    /**@ Microsoft Excel 97-2003 Add-In */
    xlAddIn8(18),    
    /**@ CSV */
    xlCSV(6),    
    /**@ Macintosh CSV */
    xlCSVMac(22),    
    /**@ MSDOS CSV */
    xlCSVMSDOS(24),    
    /**@ UTF8 CSV */
    xlCSVUTF8(62),    
    /**@ Windows CSV */
    xlCSVWindows(23),    
    /**@ Current Platform Text */
    xlCurrentPlatformText(-4158),    
    /**@ Dbase 2 format */
    xlDBF2(7),    
    /**@ Dbase 3 format */
    xlDBF3(8),    
    /**@ Dbase 4 format */
    xlDBF4(11),    
    /**@ Data Interchange format */
    xlDIF(9),    
    /**@ Excel Binary Workbook */
    xlExcel12(50),    
    /**@ Excel version 2.0 (1987) */
    xlExcel2(16),    
    /**@ Excel version 2.0 far east (1987) */
    xlExcel2FarEast(27),    
    /**@ Excel version 3.0 (1990) */
    xlExcel3(29),    
    /**@ Excel version 4.0 (1992) */
    xlExcel4(33),    
    /**@ Excel version 4.0. Workbook format (1992) */
    xlExcel4Workbook(35),    
    /**@ Excel version 5.0 (1994) */
    xlExcel5(39),    
    /**@ Excel 95 (version 7.0) */
    xlExcel7(39),    
    /**@ Excel 97-2003 Workbook */
    xlExcel8(56),    
    /**@ Excel version 95 and 97 */
    xlExcel9795(43),    
    /**@ HTML format */
    xlHtml(44),    
    /**@ International Add-In */
    xlIntlAddIn(26),    
    /**@ International Macro */
    xlIntlMacro(25),    
    /**@ OpenDocument Spreadsheet */
    xlOpenDocumentSpreadsheet(60),    
    /**@ Open XML Add-In */
    xlOpenXMLAddIn(55),    
    /**@ Strict Open XML file */
    xlOpenXMLStrictWorkbook(61),    
    /**@ Open XML Template */
    xlOpenXMLTemplate(54),    
    /**@ Open XML Template Macro Enabled */
    xlOpenXMLTemplateMacroEnabled(53),    
    /**@ Open XML Workbook */
    xlOpenXMLWorkbook(51),    
    /**@ Open XML Workbook Macro Enabled */
    xlOpenXMLWorkbookMacroEnabled(52),    
    /**@ Symbolic Link format */
    xlSYLK(2),    
    /**@ Excel Template format */
    xlTemplate(17),    
    /**@ Template 8 */
    xlTemplate8(17),    
    /**@ Macintosh Text */
    xlTextMac(19),    
    /**@ MSDOS Text */
    xlTextMSDOS(21),    
    /**@ Printer Text */
    xlTextPrinter(36),    
    /**@ Windows Text */
    xlTextWindows(20),    
    /**@ Unicode Text */
    xlUnicodeText(42),    
    /**@ Web Archive */
    xlWebArchive(45),    
    /**@ Japanese 1-2-3 */
    xlWJ2WD1(14),    
    /**@ Japanese 1-2-3 */
    xlWJ3(40),    
    /**@ Japanese 1-2-3 format */
    xlWJ3FJ3(41),    
    /**@ Lotus 1-2-3 format */
    xlWK1(5),    
    /**@ Lotus 1-2-3 format */
    xlWK1ALL(31),    
    /**@ Lotus 1-2-3 format */
    xlWK1FMT(30),    
    /**@ Lotus 1-2-3 format */
    xlWK3(15),    
    /**@ Lotus 1-2-3 format */
    xlWK3FM3(32),    
    /**@ Lotus 1-2-3 format */
    xlWK4(38),    
    /**@ Lotus 1-2-3 format */
    xlWKS(4),    
    /**@ Workbook default */
    xlWorkbookDefault(51),    
    /**@ Workbook normal */
    xlWorkbookNormal(-4143),    
    /**@ Microsoft Works 2.0 far east format */
    xlWorks2FarEast(28),    
    /**@ Quattro Pro format */
    xlWQ1(34),    
    /**@ XML Spreadsheet */
    xlXMLSpreadsheet(46);

    private final long value;

    XlFileFormat(long value) {
        this.value = value;
    }

    @Override
    public Variant toVariant() {
        return new Variant(this.value);
    }

    @Override
    public long getValue() {
        return this.value;
    }
}
