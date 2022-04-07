package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdbaselinealignment">https://docs.microsoft.com/en-us/office/vba/api/word.wdbaselinealignment</a>}
*/
public enum WdBaselineAlignment implements COMEnum {
    
    /**@ Microsoft Word automatically adjusts the baseline font alignment. */
    wdBaselineAlignAuto(4),    
    /**@ Align to a baseline for the paragraph. */
    wdBaselineAlignBaseline(2),    
    /**@ Align center points of each font. */
    wdBaselineAlignCenter(1),    
    /**@ Align using the baseline for Asian language font standards. */
    wdBaselineAlignFarEast50(3),    
    /**@ Align along top of each font. */
    wdBaselineAlignTop(0);

    private final long value;

    WdBaselineAlignment(long value) {
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
