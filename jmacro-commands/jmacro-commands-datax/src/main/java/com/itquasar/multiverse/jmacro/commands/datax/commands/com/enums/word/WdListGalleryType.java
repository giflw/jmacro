package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdlistgallerytype">https://docs.microsoft.com/en-us/office/vba/api/word.wdlistgallerytype</a>}
*/
public enum WdListGalleryType implements COMEnum {
    
    /**@ Bulleted list. */
    wdBulletGallery(1),    
    /**@ Numbered list. */
    wdNumberGallery(2),    
    /**@ Outline numbered list. */
    wdOutlineNumberGallery(3);

    private final long value;

    WdListGalleryType(long value) {
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
