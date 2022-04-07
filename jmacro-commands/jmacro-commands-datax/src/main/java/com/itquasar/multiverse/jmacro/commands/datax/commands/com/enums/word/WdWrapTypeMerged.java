package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdwraptypemerged">https://docs.microsoft.com/en-us/office/vba/api/word.wdwraptypemerged</a>}
*/
public enum WdWrapTypeMerged implements COMEnum {
    
    /**@ Behind text. */
    wdWrapMergeBehind(3),    
    /**@ In front of text. */
    wdWrapMergeFront(4),    
    /**@ In line with text. */
    wdWrapMergeInline(0),    
    /**@ Square. */
    wdWrapMergeSquare(1),    
    /**@ Through. */
    wdWrapMergeThrough(5),    
    /**@ Tight. */
    wdWrapMergeTight(2),    
    /**@ Top and bottom. */
    wdWrapMergeTopBottom(6);

    private final long value;

    WdWrapTypeMerged(long value) {
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
