package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acdisplayas">https://docs.microsoft.com/en-us/office/vba/api/access.acdisplayas</a>}
*/
public enum AcDisplayAs implements COMEnum {
    
    /**@ The attachment is displayed as the icon for that file type. */
    acDisplayAsIcon(1),    
    /**@ If the attachment is a supported image format, then the image is displayed. If the attachment is not a supported image format, then the icon for that file type is displayed. */
    acDisplayAsImageIcon(0),    
    /**@ A paper clip is displayed. */
    acDisplayAsPaperclip(2);

    private final long value;

    AcDisplayAs(long value) {
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
