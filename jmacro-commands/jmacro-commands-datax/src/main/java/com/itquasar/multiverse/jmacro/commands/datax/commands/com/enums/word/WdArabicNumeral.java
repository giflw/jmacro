package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdarabicnumeral">https://docs.microsoft.com/en-us/office/vba/api/word.wdarabicnumeral</a>}
*/
public enum WdArabicNumeral implements COMEnum {
    
    /**@ Arabic shape is used for numerals. */
    wdNumeralArabic(0),    
    /**@ Numeral shape depends on text surrounding it. */
    wdNumeralContext(2),    
    /**@ Hindi shape is used for numerals. */
    wdNumeralHindi(1),    
    /**@ Numeral shape is determined by system settings. */
    wdNumeralSystem(3);

    private final long value;

    WdArabicNumeral(long value) {
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
