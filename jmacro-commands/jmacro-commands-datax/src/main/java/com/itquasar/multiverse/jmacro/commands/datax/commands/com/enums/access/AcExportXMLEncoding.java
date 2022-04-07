package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acexportxmlencoding">https://docs.microsoft.com/en-us/office/vba/api/access.acexportxmlencoding</a>}
*/
public enum AcExportXMLEncoding implements COMEnum {
    
    /**@ UTF16 encoding. */
    acUTF16(1),    
    /**@ (Default) UTF8 encoding. */
    acUTF8(0);

    private final long value;

    AcExportXMLEncoding(long value) {
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
