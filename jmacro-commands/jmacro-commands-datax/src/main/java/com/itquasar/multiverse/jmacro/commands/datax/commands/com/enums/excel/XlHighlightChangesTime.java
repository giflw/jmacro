package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlhighlightchangestime">https://docs.microsoft.com/en-us/office/vba/api/excel.xlhighlightchangestime</a>}
*/
public enum XlHighlightChangesTime implements COMEnum {
    
    /**@ Show all changes. */
    xlAllChanges(2),    
    /**@ Show only changes not yet reviewed. */
    xlNotYetReviewed(3),    
    /**@ Show changes made since last save by last user. */
    xlSinceMyLastSave(1);

    private final long value;

    XlHighlightChangesTime(long value) {
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
