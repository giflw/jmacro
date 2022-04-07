package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlspanishmodes">https://docs.microsoft.com/en-us/office/vba/api/excel.xlspanishmodes</a>}
*/
public enum XlSpanishModes implements COMEnum {
    
    /**@ Tuteo and Voseo verb forms. */
    xlSpanishTuteoAndVoseo(1),    
    /**@ Tuteo verb forms only. */
    xlSpanishTuteoOnly(0),    
    /**@ Voseo verb forms only. */
    xlSpanishVoseoOnly(2);

    private final long value;

    XlSpanishModes(long value) {
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
