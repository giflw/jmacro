package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olattachmenttype">https://docs.microsoft.com/en-us/office/vba/api/outlook.olattachmenttype</a>}
*/
public enum OlAttachmentType implements COMEnum {
    
    /**@ This value is no longer supported since Microsoft Outlook 2007. Use olByValue to attach a copy of a file in the file system. */
    olByReference(4),    
    /**@ The attachment is a copy of the original file and can be accessed even if the original file is removed. */
    olByValue(1),    
    /**@ The attachment is an Outlook message format file (.msg) and is a copy of the original message. */
    olEmbeddeditem(5),    
    /**@ The attachment is an OLE document. */
    olOLE(6);

    private final long value;

    OlAttachmentType(long value) {
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
