package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdvisualselection">https://docs.microsoft.com/en-us/office/vba/api/word.wdvisualselection</a>}
*/
public enum WdVisualSelection implements COMEnum {
    
    /**@ All selected lines are the same width. */
    wdVisualSelectionBlock(0),    
    /**@ The selection wraps from line to line. */
    wdVisualSelectionContinuous(1);

    private final long value;

    WdVisualSelection(long value) {
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
