package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlhtmltype">https://docs.microsoft.com/en-us/office/vba/api/excel.xlhtmltype</a>}
*/
public enum XlHtmlType implements COMEnum {
    
    /**@ Use the Spreadsheet component. Deprecated. */
    xlHtmlCalc(1),    
    /**@ Use the Chart component. Deprecated. */
    xlHtmlChart(3),    
    /**@ Use the PivotTable component. Deprecated. */
    xlHtmlList(2),    
    /**@ Use static (noninteractive) HTML for viewing only. */
    xlHtmlStatic(0);

    private final long value;

    XlHtmlType(long value) {
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
