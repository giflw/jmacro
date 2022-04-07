package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdframesetsizetype">https://docs.microsoft.com/en-us/office/vba/api/word.wdframesetsizetype</a>}
*/
public enum WdFramesetSizeType implements COMEnum {
    
    /**@ Microsoft Word interprets the height or width of the specified frame as a fixed value (in points). */
    wdFramesetSizeTypeFixed(1),    
    /**@ Word interprets the height or width of the specified frame as a percentage of the screen height or width. */
    wdFramesetSizeTypePercent(0),    
    /**@ Word interprets the height or width of the specified frame as relative to the height or width of other frames on the frames page. */
    wdFramesetSizeTypeRelative(2);

    private final long value;

    WdFramesetSizeType(long value) {
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
