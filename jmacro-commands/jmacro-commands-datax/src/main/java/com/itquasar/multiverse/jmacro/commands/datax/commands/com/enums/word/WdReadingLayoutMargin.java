package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdreadinglayoutmargin">https://docs.microsoft.com/en-us/office/vba/api/word.wdreadinglayoutmargin</a>}
*/
public enum WdReadingLayoutMargin implements COMEnum {
    
    /**@ Shows the pages without margins. */
    wdAutomaticMargin(0),    
    /**@ Shows the pages with margins. */
    wdFullMargin(2),    
    /**@ Microsoft Word determines automatically whether to show or hide the margins based on the available space. */
    wdSuppressMargin(1);

    private final long value;

    WdReadingLayoutMargin(long value) {
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
