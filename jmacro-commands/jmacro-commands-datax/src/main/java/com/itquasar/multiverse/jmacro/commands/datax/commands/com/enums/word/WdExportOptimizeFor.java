package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdexportoptimizefor">https://docs.microsoft.com/en-us/office/vba/api/word.wdexportoptimizefor</a>}
*/
public enum WdExportOptimizeFor implements COMEnum {
    
    /**@ Export for screen, which is a lower quality and results in a smaller file size. */
    wdExportOptimizeForOnScreen(1),    
    /**@ Export for print, which is higher quality and results in a larger file size. */
    wdExportOptimizeForPrint(0);

    private final long value;

    WdExportOptimizeFor(long value) {
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
