package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdshowfilter">https://docs.microsoft.com/en-us/office/vba/api/word.wdshowfilter</a>}
*/
public enum WdShowFilter implements COMEnum {
    
    /**@ All formatting available. */
    wdShowFilterFormattingAvailable(4),    
    /**@ All formatting in use. */
    wdShowFilterFormattingInUse(3),    
    /**@ All styles. */
    wdShowFilterStylesAll(2),    
    /**@ All styles available. */
    wdShowFilterStylesAvailable(0),    
    /**@ All styles in use. */
    wdShowFilterStylesInUse(1),    
    /**@ Only recommended styles. */
    wdShowFilterFormattingRecommended(5);

    private final long value;

    WdShowFilter(long value) {
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
