package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.actextformat">https://docs.microsoft.com/en-us/office/vba/api/access.actextformat</a>}
*/
public enum AcTextFormat implements COMEnum {
    
    /**@ Rich text can be displayed. */
    acTextFormatHTMLRichText(1),    
    /**@ (Default) Plain text is displayed. */
    acTextFormatPlain(0);

    private final long value;

    AcTextFormat(long value) {
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
