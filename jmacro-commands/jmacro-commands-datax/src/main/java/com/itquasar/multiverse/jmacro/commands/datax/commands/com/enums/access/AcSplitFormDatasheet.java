package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acsplitformdatasheet">https://docs.microsoft.com/en-us/office/vba/api/access.acsplitformdatasheet</a>}
*/
public enum AcSplitFormDatasheet implements COMEnum {
    
    /**@ The user can edit the contents of the datasheet. */
    acDatasheetAllowEdits(0),    
    /**@ The user cannot edit the contents of the datasheet. */
    acDatasheetReadOnly(1);

    private final long value;

    AcSplitFormDatasheet(long value) {
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
