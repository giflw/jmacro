package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlpropertydisplayedin">https://docs.microsoft.com/en-us/office/vba/api/excel.xlpropertydisplayedin</a>}
*/
public enum XlPropertyDisplayedIn implements COMEnum {
    
    /**@ Displays member property in the PivotTable only. This is the default value. */
    xlDisplayPropertyInPivotTable(1),    
    /**@ Displays member property in the tooltip only. */
    xlDisplayPropertyInPivotTableAndTooltip(3),    
    /**@ Displays member property in both the tooltip and the PivotTable. */
    xlDisplayPropertyInTooltip(2);

    private final long value;

    XlPropertyDisplayedIn(long value) {
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
