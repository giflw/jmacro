package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlbinstype">https://docs.microsoft.com/en-us/office/vba/api/excel.xlbinstype</a>}
*/
public enum XlBinsType implements COMEnum {
    
    /**@ Sets bins type automatically. */
    xlBinsTypeAutomatic(0),    
    /**@ Sets bins type by category. */
    xlBinsTypeCategorical(1),    
    /**@ Sets bins type manually. */
    xlBinsTypeManual(2),    
    /**@ Sets bins type by size. */
    xlBinsTypeBinSize(3),    
    /**@ Sets bins type by count. */
    xlBinsTypeBinCount(4);

    private final long value;

    XlBinsType(long value) {
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
