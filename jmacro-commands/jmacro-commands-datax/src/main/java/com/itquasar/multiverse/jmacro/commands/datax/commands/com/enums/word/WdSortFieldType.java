package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdsortfieldtype">https://docs.microsoft.com/en-us/office/vba/api/word.wdsortfieldtype</a>}
*/
public enum WdSortFieldType implements COMEnum {
    
    /**@ Alphanumeric order. */
    wdSortFieldAlphanumeric(0),    
    /**@ Date order. */
    wdSortFieldDate(2),    
    /**@ Japanese JIS order. */
    wdSortFieldJapanJIS(4),    
    /**@ Korean KS order. */
    wdSortFieldKoreaKS(6),    
    /**@ Numeric order. */
    wdSortFieldNumeric(1),    
    /**@ Stroke order. */
    wdSortFieldStroke(5),    
    /**@ Syllable order. */
    wdSortFieldSyllable(3);

    private final long value;

    WdSortFieldType(long value) {
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
