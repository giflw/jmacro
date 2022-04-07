package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdselectiontype">https://docs.microsoft.com/en-us/office/vba/api/word.wdselectiontype</a>}
*/
public enum WdSelectionType implements COMEnum {
    
    /**@ No selection. */
    wdNoSelection(0),    
    /**@ A block selection. */
    wdSelectionBlock(6),    
    /**@ A column selection. */
    wdSelectionColumn(4),    
    /**@ A frame selection. */
    wdSelectionFrame(3),    
    /**@ An inline shape selection. */
    wdSelectionInlineShape(7),    
    /**@ An inline paragraph selection. */
    wdSelectionIP(1),    
    /**@ A normal or user-defined selection. */
    wdSelectionNormal(2),    
    /**@ A row selection. */
    wdSelectionRow(5),    
    /**@ A shape selection. */
    wdSelectionShape(8);

    private final long value;

    WdSelectionType(long value) {
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
