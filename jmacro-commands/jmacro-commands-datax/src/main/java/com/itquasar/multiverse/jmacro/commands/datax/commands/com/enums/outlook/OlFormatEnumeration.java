package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olformatenumeration">https://docs.microsoft.com/en-us/office/vba/api/outlook.olformatenumeration</a>}
*/
public enum OlFormatEnumeration implements COMEnum {
    
    /**@ Display as a bitmap with a pop-up list. */
    olFormatEnumBitmap(1),    
    /**@ Display as text with a pop-up list. */
    olFormatEnumText(2);

    private final long value;

    OlFormatEnumeration(long value) {
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
