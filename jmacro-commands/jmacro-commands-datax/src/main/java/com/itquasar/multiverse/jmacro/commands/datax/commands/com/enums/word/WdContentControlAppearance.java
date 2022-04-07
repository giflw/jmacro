package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdcontentcontrolappearance">https://docs.microsoft.com/en-us/office/vba/api/word.wdcontentcontrolappearance</a>}
*/
public enum WdContentControlAppearance implements COMEnum {
    
    /**@ Represents a content control shown as a shaded rectangle or bounding box (with optional title). */
    wdContentControlBoundingBox(0),    
    /**@ Represents a content control shown as start and end markers. */
    wdContentControlTags(1),    
    /**@ Represents a content control that is not shown. */
    wdContentControlHidden(2);

    private final long value;

    WdContentControlAppearance(long value) {
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
