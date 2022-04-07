package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdtabalignment">https://docs.microsoft.com/en-us/office/vba/api/word.wdtabalignment</a>}
*/
public enum WdTabAlignment implements COMEnum {
    
    /**@ Bar-aligned. */
    wdAlignTabBar(4),    
    /**@ Center-aligned. */
    wdAlignTabCenter(1),    
    /**@ Decimal-aligned. */
    wdAlignTabDecimal(3),    
    /**@ Left-aligned. */
    wdAlignTabLeft(0),    
    /**@ List-aligned. */
    wdAlignTabList(6),    
    /**@ Right-aligned. */
    wdAlignTabRight(2);

    private final long value;

    WdTabAlignment(long value) {
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
