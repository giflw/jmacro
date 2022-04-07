package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbhorizontalpicturelocking">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbhorizontalpicturelocking</a>}
*/
public enum PbHorizontalPictureLocking implements COMEnum {
    
    /**@ New pictures are inserted along the left edge of the frame. */
    pbHorizontalLockingLeft(1),    
    /**@ New pictures are inserted in the middle between the left and right edges of the frame. */
    pbHorizontalLockingNone(0),    
    /**@ New pictures are inserted along the right edge of the frame. */
    pbHorizontalLockingRight(2),    
    /**@ New pictures are horizontally stretched to the full width of the frame. */
    pbHorizontalLockingStretch(3);

    private final long value;

    PbHorizontalPictureLocking(long value) {
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
