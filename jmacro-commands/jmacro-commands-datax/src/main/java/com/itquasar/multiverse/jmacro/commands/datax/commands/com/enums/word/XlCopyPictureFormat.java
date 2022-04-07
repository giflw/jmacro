package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.xlcopypictureformat">https://docs.microsoft.com/en-us/office/vba/api/word.xlcopypictureformat</a>}
*/
public enum XlCopyPictureFormat implements COMEnum {
    
    /**@ A bitmap (.bmp, .jpg, .gif). */
    xlBitmap(2),    
    /**@ A drawn picture (.png, .wmf, .mix). */
    xlPicture(-4147);

    private final long value;

    XlCopyPictureFormat(long value) {
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
