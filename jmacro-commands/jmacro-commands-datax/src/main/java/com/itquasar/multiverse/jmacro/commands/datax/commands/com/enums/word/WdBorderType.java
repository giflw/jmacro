package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdbordertype">https://docs.microsoft.com/en-us/office/vba/api/word.wdbordertype</a>}
*/
public enum WdBorderType implements COMEnum {
    
    /**@ A bottom border. */
    wdBorderBottom(-3),    
    /**@ A diagonal border starting in the upper-left corner. */
    wdBorderDiagonalDown(-7),    
    /**@ A diagonal border starting in the lower-left corner. */
    wdBorderDiagonalUp(-8),    
    /**@ Horizontal borders. */
    wdBorderHorizontal(-5),    
    /**@ A left border. */
    wdBorderLeft(-2),    
    /**@ A right border. */
    wdBorderRight(-4),    
    /**@ A top border. */
    wdBorderTop(-1),    
    /**@ Vertical borders. */
    wdBorderVertical(-6);

    private final long value;

    WdBorderType(long value) {
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
