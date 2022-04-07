package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xldirection">https://docs.microsoft.com/en-us/office/vba/api/excel.xldirection</a>}
*/
public enum XlDirection implements COMEnum {
    
    /**@ Down. */
    xlDown(-4121),    
    /**@ To left. */
    xlToLeft(-4159),    
    /**@ To right. */
    xlToRight(-4161),    
    /**@ Up. */
    xlUp(-4162);

    private final long value;

    XlDirection(long value) {
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
