package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdpicturelinktype">https://docs.microsoft.com/en-us/office/vba/api/word.wdpicturelinktype</a>}
*/
public enum WdPictureLinkType implements COMEnum {
    
    /**@ Embed the picture in the document. */
    wdLinkDataInDoc(1),    
    /**@ Link the picture to the document. */
    wdLinkDataOnDisk(2),    
    /**@ Do not link to or embed the picture in the document. */
    wdLinkNone(0);

    private final long value;

    WdPictureLinkType(long value) {
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
