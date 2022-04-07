package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbverticalpicturelocking">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbverticalpicturelocking</a>}
*/
public enum PbVerticalPictureLocking implements COMEnum {
    
    /**@ New pictures are inserted along the bottom edge of the frame. */
    pbVerticalLockingBottom(2),    
    /**@ New pictures are inserted in the center between the top and bottom edges of the frame. */
    pbVerticalLockingNone(0),    
    /**@ New pictures are vertically stretched to the full height of the frame. */
    pbVerticalLockingStretch(3),    
    /**@ New pictures are inserted along the top edge of the frame. */
    pbVerticalLockingTop(1);

    private final long value;

    PbVerticalPictureLocking(long value) {
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
