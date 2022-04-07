package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xloleverb">https://docs.microsoft.com/en-us/office/vba/api/excel.xloleverb</a>}
*/
public enum XlOLEVerb implements COMEnum {
    
    /**@ Open the object. */
    xlVerbOpen(2),    
    /**@ Perform the primary action for the server. */
    xlVerbPrimary(1);

    private final long value;

    XlOLEVerb(long value) {
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
