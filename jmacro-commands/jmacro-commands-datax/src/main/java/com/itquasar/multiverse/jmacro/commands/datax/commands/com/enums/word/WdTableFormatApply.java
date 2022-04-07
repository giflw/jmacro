package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdtableformatapply">https://docs.microsoft.com/en-us/office/vba/api/word.wdtableformatapply</a>}
*/
public enum WdTableFormatApply implements COMEnum {
    
    /**@ AutoFit. */
    wdTableFormatApplyAutoFit(16),    
    /**@ Borders. */
    wdTableFormatApplyBorders(1),    
    /**@ Color. */
    wdTableFormatApplyColor(8),    
    /**@ Apply AutoFormat to first column. */
    wdTableFormatApplyFirstColumn(128),    
    /**@ Font. */
    wdTableFormatApplyFont(4),    
    /**@ Apply AutoFormat to heading rows. */
    wdTableFormatApplyHeadingRows(32),    
    /**@ Apply AutoFormat to last column. */
    wdTableFormatApplyLastColumn(256),    
    /**@ Apply AutoFormat to last row. */
    wdTableFormatApplyLastRow(64),    
    /**@ Shading. */
    wdTableFormatApplyShading(2);

    private final long value;

    WdTableFormatApply(long value) {
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
