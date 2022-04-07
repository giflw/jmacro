package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdtoaformat">https://docs.microsoft.com/en-us/office/vba/api/word.wdtoaformat</a>}
*/
public enum WdToaFormat implements COMEnum {
    
    /**@ Classic formatting. */
    wdTOAClassic(1),    
    /**@ Distinctive formatting. */
    wdTOADistinctive(2),    
    /**@ Formal formatting. */
    wdTOAFormal(3),    
    /**@ Simple formatting. */
    wdTOASimple(4),    
    /**@ Template formatting. */
    wdTOATemplate(0);

    private final long value;

    WdToaFormat(long value) {
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
