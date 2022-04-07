package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.achyperlinkpart">https://docs.microsoft.com/en-us/office/vba/api/access.achyperlinkpart</a>}
*/
public enum AcHyperlinkPart implements COMEnum {
    
    /**@ The address part of a Hyperlink field. */
    acAddress(2),    
    /**@ The underlined text displayed in a hyperlink. */
    acDisplayedValue(0),    
    /**@ The displaytext part of a Hyperlink field. */
    acDisplayText(1),    
    /**@ The address and subaddress parts of a Hyperlink field, delimited by a "#" character. */
    acFullAddress(5),    
    /**@ The tooltip part of a Hyperlink field. */
    acScreenTip(4),    
    /**@ The subaddress part of a Hyperlink field. */
    acSubAddress(3);

    private final long value;

    AcHyperlinkPart(long value) {
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
