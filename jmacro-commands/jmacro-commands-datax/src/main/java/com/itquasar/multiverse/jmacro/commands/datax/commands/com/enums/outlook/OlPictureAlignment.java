package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olpicturealignment">https://docs.microsoft.com/en-us/office/vba/api/outlook.olpicturealignment</a>}
*/
public enum OlPictureAlignment implements COMEnum {
    
    /**@ The image is aligned to the left of the text and vertically centered on the button. */
    olPictureAlignmentLeft(0),    
    /**@ The image is aligned to the right of the text and horizontally centered on the button. */
    olPictureAlignmentTop(1);

    private final long value;

    OlPictureAlignment(long value) {
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
