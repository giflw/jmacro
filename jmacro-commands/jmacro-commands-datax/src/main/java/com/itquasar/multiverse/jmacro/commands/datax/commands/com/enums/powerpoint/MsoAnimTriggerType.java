package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.msoanimtriggertype">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.msoanimtriggertype</a>}
*/
public enum MsoAnimTriggerType implements COMEnum {
    
    /**@ After the Previous button is clicked. */
    msoAnimTriggerAfterPrevious(3),    
    /**@ Mixed actions. */
    msoAnimTriggerMixed(-1),    
    /**@ No action associated as the trigger. */
    msoAnimTriggerNone(0),    
    /**@ When a page is clicked. */
    msoAnimTriggerOnPageClick(1),    
    /**@ When a shape is clicked. */
    msoAnimTriggerOnShapeClick(4),    
    /**@ When the Previous button is clicked. */
    msoAnimTriggerWithPrevious(2),    
    /**@ No description provided */
    msoAnimTriggerOnMediaBookmark(5);

    private final long value;

    MsoAnimTriggerType(long value) {
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
