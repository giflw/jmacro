package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.accolorindex">https://docs.microsoft.com/en-us/office/vba/api/access.accolorindex</a>}
*/
public enum AcColorIndex implements COMEnum {
    
    /**@ Aqua color. */
    acColorIndexAqua(14),    
    /**@ Black color. */
    acColorIndexBlack(0),    
    /**@ Blue color. */
    acColorIndexBlue(12),    
    /**@ Bright green color. */
    acColorIndexBrightGreen(10),    
    /**@ Dark blue color. */
    acColorIndexDarkBlue(4),    
    /**@ Fuchsia color. */
    acColorIndexFuchsia(13),    
    /**@ Gray color. */
    acColorIndexGray(7),    
    /**@ Green color. */
    acColorIndexGreen(2),    
    /**@ Maroon color. */
    acColorIndexMaroon(1),    
    /**@ Olive color. */
    acColorIndexOlive(3),    
    /**@ Red color. */
    acColorIndexRed(9),    
    /**@ Silver color. */
    acColorIndexSilver(8),    
    /**@ Teal color. */
    acColorIndexTeal(6),    
    /**@ Violet color. */
    acColorIndexViolet(5),    
    /**@ White color. */
    acColorIndexWhite(15),    
    /**@ Yellow color. */
    acColorIndexYellow(11);

    private final long value;

    AcColorIndex(long value) {
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
