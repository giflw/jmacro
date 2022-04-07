package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olattachmentblocklevel">https://docs.microsoft.com/en-us/office/vba/api/outlook.olattachmentblocklevel</a>}
*/
public enum OlAttachmentBlockLevel implements COMEnum {
    
    /**@ There is no restriction on the type of the attachment based on its file extension. */
    olAttachmentBlockLevelNone(0),    
    /**@ There is a restriction on the type of the attachment based on its file extension such that users must first save the attachment to disk before opening it. */
    olAttachmentBlockLevelOpen(1);

    private final long value;

    OlAttachmentBlockLevel(long value) {
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
