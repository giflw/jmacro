package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olbodyformat">https://docs.microsoft.com/en-us/office/vba/api/outlook.olbodyformat</a>}
*/
public enum OlBodyFormat implements COMEnum {
    
    /**@ HTML format */
    olFormatHTML(2),    
    /**@ Plain format */
    olFormatPlain(1),    
    /**@ Rich text format */
    olFormatRichText(3),    
    /**@ Unspecified format */
    olFormatUnspecified(0);

    private final long value;

    OlBodyFormat(long value) {
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
