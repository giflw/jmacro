package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlpivottablesourcetype">https://docs.microsoft.com/en-us/office/vba/api/excel.xlpivottablesourcetype</a>}
*/
public enum XlPivotTableSourceType implements COMEnum {
    
    /**@ Multiple consolidation ranges. */
    xlConsolidation(3),    
    /**@ Microsoft Excel list or database. */
    xlDatabase(1),    
    /**@ Data from another application. */
    xlExternal(2),    
    /**@ Same source as another PivotTable report. */
    xlPivotTable(-4148),    
    /**@ Data is based on scenarios created using the Scenario Manager. */
    xlScenario(4);

    private final long value;

    XlPivotTableSourceType(long value) {
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
