package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdtocformat">https://docs.microsoft.com/en-us/office/vba/api/word.wdtocformat</a>}
*/
public enum WdTocFormat implements COMEnum {
    
    /**@ Classic formatting. */
    wdTOCClassic(1),    
    /**@ Distinctive formatting. */
    wdTOCDistinctive(2),    
    /**@ Fancy formatting. */
    wdTOCFancy(3),    
    /**@ Formal formatting. */
    wdTOCFormal(5),    
    /**@ Modern formatting. */
    wdTOCModern(4),    
    /**@ Simple formatting. */
    wdTOCSimple(6),    
    /**@ Template formatting. */
    wdTOCTemplate(0);

    private final long value;

    WdTocFormat(long value) {
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
