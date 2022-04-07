package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.oltablecontents">https://docs.microsoft.com/en-us/office/vba/api/outlook.oltablecontents</a>}
*/
public enum OlTableContents implements COMEnum {
    
    /**@ Only the hidden items in the folder. */
    olHiddenItems(1),    
    /**@ Only the non-hidden user items in the folder. */
    olUserItems(0);

    private final long value;

    OlTableContents(long value) {
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
