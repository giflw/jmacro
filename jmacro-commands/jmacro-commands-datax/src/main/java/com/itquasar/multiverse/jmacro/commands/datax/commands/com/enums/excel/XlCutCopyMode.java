package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlcutcopymode">https://docs.microsoft.com/en-us/office/vba/api/excel.xlcutcopymode</a>}
*/
public enum XlCutCopyMode implements COMEnum {
    
    /**@ In Copy mode */
    xlCopy(1),    
    /**@ In Cut mode */
    xlCut(2);

    private final long value;

    XlCutCopyMode(long value) {
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
