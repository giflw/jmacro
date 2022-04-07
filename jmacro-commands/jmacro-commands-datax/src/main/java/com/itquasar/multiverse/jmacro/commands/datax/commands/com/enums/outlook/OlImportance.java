package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olimportance">https://docs.microsoft.com/en-us/office/vba/api/outlook.olimportance</a>}
*/
public enum OlImportance implements COMEnum {
    
    /**@ Item is marked as high importance. */
    olImportanceHigh(2),    
    /**@ Item is marked as low importance. */
    olImportanceLow(0),    
    /**@ Item is marked as medium importance. */
    olImportanceNormal(1);

    private final long value;

    OlImportance(long value) {
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
