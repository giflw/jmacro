package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdsectionstart">https://docs.microsoft.com/en-us/office/vba/api/word.wdsectionstart</a>}
*/
public enum WdSectionStart implements COMEnum {
    
    /**@ Continuous section break. */
    wdSectionContinuous(0),    
    /**@ Even pages section break. */
    wdSectionEvenPage(3),    
    /**@ New column section break. */
    wdSectionNewColumn(1),    
    /**@ New page section break. */
    wdSectionNewPage(2),    
    /**@ Odd pages section break. */
    wdSectionOddPage(4);

    private final long value;

    WdSectionStart(long value) {
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
