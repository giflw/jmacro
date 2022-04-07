package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdtofformat">https://docs.microsoft.com/en-us/office/vba/api/word.wdtofformat</a>}
*/
public enum WdTofFormat implements COMEnum {
    
    /**@ Centered formatting. */
    wdTOFCentered(3),    
    /**@ Classic formatting. */
    wdTOFClassic(1),    
    /**@ Distinctive formatting. */
    wdTOFDistinctive(2),    
    /**@ Formal formatting. */
    wdTOFFormal(4),    
    /**@ Simple formatting. */
    wdTOFSimple(5),    
    /**@ Template formatting. */
    wdTOFTemplate(0);

    private final long value;

    WdTofFormat(long value) {
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
