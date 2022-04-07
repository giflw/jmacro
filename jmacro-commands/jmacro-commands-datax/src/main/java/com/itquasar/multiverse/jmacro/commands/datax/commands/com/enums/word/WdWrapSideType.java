package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdwrapsidetype">https://docs.microsoft.com/en-us/office/vba/api/word.wdwrapsidetype</a>}
*/
public enum WdWrapSideType implements COMEnum {
    
    /**@ Both sides of the specified shape. */
    wdWrapBoth(0),    
    /**@ Side of the shape that is farthest from the page margin. */
    wdWrapLargest(3),    
    /**@ Left side of shape only. */
    wdWrapLeft(1),    
    /**@ Right side of shape only. */
    wdWrapRight(2);

    private final long value;

    WdWrapSideType(long value) {
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
