package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbtextorientation">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbtextorientation</a>}
*/
public enum PbTextOrientation implements COMEnum {
    
    /**@ Horizontal text orientation */
    pbTextOrientationHorizontal(1),    
    /**@ Mixed text orientation */
    pbTextOrientationMixed(-2),    
    /**@ RightToLeft text orientation */
    pbTextOrientationRightToLeft(256),    
    /**@ VerticalEastAsia text orientation */
    pbTextOrientationVerticalEastAsia(2);

    private final long value;

    PbTextOrientation(long value) {
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
