package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdpagecolor">https://docs.microsoft.com/en-us/office/vba/api/word.wdpagecolor</a>}
*/
public enum WdPageColor implements COMEnum {
    
    /**@ Inverse page color. Renders the document content in a manner that resembles high-contrast black, although not necessarily exactly so. Some figures are rendered in full color on a black background. */
    wdPageColorInverse(2),    
    /**@ No page color, the default. The page background is rendered in white. Any assigned page background colors are ignored. */
    wdPageColorNone(0),    
    /**@ Sepia page color, RGB (112, 66, 20) at 80% transparency. Makes no changes to the contents of the document. */
    wdPageColorSepia(1);

    private final long value;

    WdPageColor(long value) {
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
