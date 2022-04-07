package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdnumbertype">https://docs.microsoft.com/en-us/office/vba/api/word.wdnumbertype</a>}
*/
public enum WdNumberType implements COMEnum {
    
    /**@ Default value for all other cases. */
    wdNumberAllNumbers(3),    
    /**@ Default value for LISTNUM fields. */
    wdNumberListNum(2),    
    /**@ Preset numbers you can add to paragraphs by selecting a template in the Bullets and Numbering dialog box. */
    wdNumberParagraph(1);

    private final long value;

    WdNumberType(long value) {
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
