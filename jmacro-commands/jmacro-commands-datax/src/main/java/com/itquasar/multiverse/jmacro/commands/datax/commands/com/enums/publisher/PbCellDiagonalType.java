package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbcelldiagonaltype">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbcelldiagonaltype</a>}
*/
public enum PbCellDiagonalType implements COMEnum {
    
    /**@ Diagonal Down */
    pbTableCellDiagonalDown(2),    
    /**@ Diagonal Mixed */
    pbTableCellDiagonalMixed(-2),    
    /**@ Not split Diagonally */
    pbTableCellDiagonalNone(0),    
    /**@ Diagonal Up */
    pbTableCellDiagonalUp(1);

    private final long value;

    PbCellDiagonalType(long value) {
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
