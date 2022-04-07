package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlcategorylabellevel">https://docs.microsoft.com/en-us/office/vba/api/excel.xlcategorylabellevel</a>}
*/
public enum XlCategoryLabelLevel implements COMEnum {
    
    /**@ Set category labels to all category label levels w/in range on the chart. */
    xlCategoryLabelLevelAll(-1),    
    /**@ Indicates literal data in the category labels. */
    xlCategoryLabelLevelCustom(-2),    
    /**@ Set no category labels in the chart. Defaults to automatic indexed labels. */
    xlCategoryLabelLevelNone(-3);

    private final long value;

    XlCategoryLabelLevel(long value) {
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
