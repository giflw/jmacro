package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdparagraphalignment">https://docs.microsoft.com/en-us/office/vba/api/word.wdparagraphalignment</a>}
*/
public enum WdParagraphAlignment implements COMEnum {
    
    /**@ Center-aligned. */
    wdAlignParagraphCenter(1),    
    /**@ Paragraph characters are distributed to fill the entire width of the paragraph. */
    wdAlignParagraphDistribute(4),    
    /**@ Fully justified. */
    wdAlignParagraphJustify(3),    
    /**@ Justified with a high character compression ratio. */
    wdAlignParagraphJustifyHi(7),    
    /**@ Justified with a low character compression ratio. */
    wdAlignParagraphJustifyLow(8),    
    /**@ Justified with a medium character compression ratio. */
    wdAlignParagraphJustifyMed(5),    
    /**@ Left-aligned. */
    wdAlignParagraphLeft(0),    
    /**@ Right-aligned. */
    wdAlignParagraphRight(2),    
    /**@ Justified according to Thai formatting layout. */
    wdAlignParagraphThaiJustify(9);

    private final long value;

    WdParagraphAlignment(long value) {
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
