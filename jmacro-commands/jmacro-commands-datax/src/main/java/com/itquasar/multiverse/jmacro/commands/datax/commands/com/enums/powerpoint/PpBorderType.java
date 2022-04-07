package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppbordertype">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppbordertype</a>}
*/
public enum PpBorderType implements COMEnum {
    
    /**@ Bottom */
    ppBorderBottom(3),    
    /**@ Diagonally down */
    ppBorderDiagonalDown(5),    
    /**@ Diagonally up */
    ppBorderDiagonalUp(6),    
    /**@ Left */
    ppBorderLeft(2),    
    /**@ Right */
    ppBorderRight(4),    
    /**@ Top */
    ppBorderTop(1);

    private final long value;

    PpBorderType(long value) {
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
