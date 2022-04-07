package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlarabicmodes">https://docs.microsoft.com/en-us/office/vba/api/excel.xlarabicmodes</a>}
*/
public enum XlArabicModes implements COMEnum {
    
    /**@ The spelling checker uses spelling rules regarding both Arabic words ending with the letter yaa and Arabic words beginning with an alef hamza. */
    xlArabicBothStrict(3),    
    /**@ The spelling checker ignores spelling rules regarding either Arabic words ending with the letter yaa or Arabic words beginning with an alef hamza. */
    xlArabicNone(0),    
    /**@ The spelling checker uses spelling rules regarding Arabic words beginning with an alef hamza. */
    xlArabicStrictAlefHamza(1),    
    /**@ The spelling checker uses spelling rules regarding Arabic words ending with the letter yaa. */
    xlArabicStrictFinalYaa(2);

    private final long value;

    XlArabicModes(long value) {
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
