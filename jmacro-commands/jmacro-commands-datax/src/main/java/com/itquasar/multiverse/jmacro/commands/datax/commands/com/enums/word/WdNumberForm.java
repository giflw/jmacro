package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdnumberform">https://docs.microsoft.com/en-us/office/vba/api/word.wdnumberform</a>}
*/
public enum WdNumberForm implements COMEnum {
    
    /**@ Applies the default number form for the font. */
    wdNumberFormDefault(0),    
    /**@ Applies the lining number form to the font. */
    wdNumberFormLining(1),    
    /**@ Applies the "old-style" number form to the font. */
    wdNumberFormOldstyle(2);

    private final long value;

    WdNumberForm(long value) {
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
