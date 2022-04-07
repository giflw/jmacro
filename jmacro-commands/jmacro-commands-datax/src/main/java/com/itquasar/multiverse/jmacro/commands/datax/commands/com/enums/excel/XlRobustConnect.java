package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlrobustconnect">https://docs.microsoft.com/en-us/office/vba/api/excel.xlrobustconnect</a>}
*/
public enum XlRobustConnect implements COMEnum {
    
    /**@ The PivotTable cache or query table always uses external source information (as defined by the SourceConnectionFile or SourceDataFile property) to reconnect. */
    xlAlways(1),    
    /**@ The PivotTable cache or query table uses external source information to reconnect by using the Connection property. */
    xlAsRequired(0),    
    /**@ The PivotTable cache or query table never uses source information to reconnect. */
    xlNever(2);

    private final long value;

    XlRobustConnect(long value) {
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
