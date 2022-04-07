package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdtableposition">https://docs.microsoft.com/en-us/office/vba/api/word.wdtableposition</a>}
*/
public enum WdTablePosition implements COMEnum {
    
    /**@ At the bottom of the document. */
    wdTableBottom(-999997),    
    /**@ Centered. */
    wdTableCenter(-999995),    
    /**@ Placed inside a range. */
    wdTableInside(-999994),    
    /**@ Aligned to the left side of the document. */
    wdTableLeft(-999998),    
    /**@ Placed outside a range. */
    wdTableOutside(-999993),    
    /**@ Aligned to the right side of the document. */
    wdTableRight(-999996),    
    /**@ At the top of the document. */
    wdTableTop(-999999);

    private final long value;

    WdTablePosition(long value) {
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
