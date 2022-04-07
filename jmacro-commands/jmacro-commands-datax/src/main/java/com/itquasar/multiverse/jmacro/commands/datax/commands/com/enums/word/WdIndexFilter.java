package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdindexfilter">https://docs.microsoft.com/en-us/office/vba/api/word.wdindexfilter</a>}
*/
public enum WdIndexFilter implements COMEnum {
    
    /**@ Japanese words use the AIUEO method of alphabetizing. */
    wdIndexFilterAiueo(1),    
    /**@ Japanese words use Akasatana. */
    wdIndexFilterAkasatana(2),    
    /**@ Korean words use Chosung. */
    wdIndexFilterChosung(3),    
    /**@ Korean words use Chosung. */
    wdIndexFilterFull(6),    
    /**@ Japanese words use Akasatana. */
    wdIndexFilterLow(4),    
    /**@ Japanese words use the AIUEO method of alphabetizing. */
    wdIndexFilterMedium(5),    
    /**@ No special filtering. */
    wdIndexFilterNone(0);

    private final long value;

    WdIndexFilter(long value) {
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
