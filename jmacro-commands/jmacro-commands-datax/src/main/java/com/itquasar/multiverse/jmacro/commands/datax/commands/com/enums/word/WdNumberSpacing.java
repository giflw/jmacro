package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdnumberspacing">https://docs.microsoft.com/en-us/office/vba/api/word.wdnumberspacing</a>}
*/
public enum WdNumberSpacing implements COMEnum {
    
    /**@ Applies the default number spacing for the font. */
    wdNumberSpacingDefault(0),    
    /**@ Applies proportional number spacing to the font. */
    wdNumberSpacingProportional(1),    
    /**@ Applies tabular number spacing to the font. */
    wdNumberSpacingTabular(2);

    private final long value;

    WdNumberSpacing(long value) {
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
