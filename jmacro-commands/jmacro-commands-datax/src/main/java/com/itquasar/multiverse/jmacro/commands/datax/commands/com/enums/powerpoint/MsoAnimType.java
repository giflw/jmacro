package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.msoanimtype">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.msoanimtype</a>}
*/
public enum MsoAnimType implements COMEnum {
    
    /**@ Color */
    msoAnimTypeColor(2),    
    /**@ Command */
    msoAnimTypeCommand(6),    
    /**@ Filter */
    msoAnimTypeFilter(7),    
    /**@ Mixed */
    msoAnimTypeMixed(-2),    
    /**@ Motion */
    msoAnimTypeMotion(1),    
    /**@ None */
    msoAnimTypeNone(0),    
    /**@ Property */
    msoAnimTypeProperty(5),    
    /**@ Rotation */
    msoAnimTypeRotation(4),    
    /**@ Scale */
    msoAnimTypeScale(3),    
    /**@ Set */
    msoAnimTypeSet(8);

    private final long value;

    MsoAnimType(long value) {
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
