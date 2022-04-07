package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdlinewidth">https://docs.microsoft.com/en-us/office/vba/api/word.wdlinewidth</a>}
*/
public enum WdLineWidth implements COMEnum {
    
    /**@ 0.25 point. */
    wdLineWidth025pt(2),    
    /**@ 0.50 point. */
    wdLineWidth050pt(4),    
    /**@ 0.75 point. */
    wdLineWidth075pt(6),    
    /**@ 1.00 point. default. */
    wdLineWidth100pt(8),    
    /**@ 1.50 points. */
    wdLineWidth150pt(12),    
    /**@ 2.25 points. */
    wdLineWidth225pt(18),    
    /**@ 3.00 points. */
    wdLineWidth300pt(24),    
    /**@ 4.50 points. */
    wdLineWidth450pt(36),    
    /**@ 6.00 points. */
    wdLineWidth600pt(48);

    private final long value;

    WdLineWidth(long value) {
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
