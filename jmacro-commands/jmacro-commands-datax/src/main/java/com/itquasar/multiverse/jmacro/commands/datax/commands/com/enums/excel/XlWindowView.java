package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlwindowview">https://docs.microsoft.com/en-us/office/vba/api/excel.xlwindowview</a>}
*/
public enum XlWindowView implements COMEnum {
    
    /**@ Normal. */
    xlNormalView(1),    
    /**@ Page break preview. */
    xlPageBreakPreview(2),    
    /**@ Page layout view. */
    xlPageLayoutView(3);

    private final long value;

    XlWindowView(long value) {
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
