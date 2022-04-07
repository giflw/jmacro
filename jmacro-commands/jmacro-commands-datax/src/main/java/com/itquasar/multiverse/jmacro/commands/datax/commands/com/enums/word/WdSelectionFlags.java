package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdselectionflags">https://docs.microsoft.com/en-us/office/vba/api/word.wdselectionflags</a>}
*/
public enum WdSelectionFlags implements COMEnum {
    
    /**@ The selection is the active selection. */
    wdSelActive(8),    
    /**@ The selection is at the end of the letter. */
    wdSelAtEOL(2),    
    /**@ The selection was overtyped. */
    wdSelOvertype(4),    
    /**@ The selection was replaced. */
    wdSelReplace(16),    
    /**@ The selection is at the start of the active document. */
    wdSelStartActive(1);

    private final long value;

    WdSelectionFlags(long value) {
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
