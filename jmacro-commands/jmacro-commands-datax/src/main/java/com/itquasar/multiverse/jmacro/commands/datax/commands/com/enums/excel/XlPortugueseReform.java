package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlportuguesereform">https://docs.microsoft.com/en-us/office/vba/api/excel.xlportuguesereform</a>}
*/
public enum XlPortugueseReform implements COMEnum {
    
    /**@ The spelling checker recognizes both pre-reform and post-reform spellings. */
    xlPortugueseBoth(3),    
    /**@ The spelling checker recognizes only post-reform spellings. */
    xlPortuguesePostReform(2),    
    /**@ The spelling checker recognizes only pre-reform spellings. */
    xlPortuguesePreReform(1);

    private final long value;

    XlPortugueseReform(long value) {
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
