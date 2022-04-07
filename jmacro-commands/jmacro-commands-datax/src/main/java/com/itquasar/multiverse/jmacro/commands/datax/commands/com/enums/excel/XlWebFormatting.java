package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlwebformatting">https://docs.microsoft.com/en-us/office/vba/api/excel.xlwebformatting</a>}
*/
public enum XlWebFormatting implements COMEnum {
    
    /**@ All formatting is imported. */
    xlWebFormattingAll(1),    
    /**@ No formatting is imported. */
    xlWebFormattingNone(3),    
    /**@ Rich Text Format - compatible formatting is imported. */
    xlWebFormattingRTF(2);

    private final long value;

    XlWebFormatting(long value) {
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
