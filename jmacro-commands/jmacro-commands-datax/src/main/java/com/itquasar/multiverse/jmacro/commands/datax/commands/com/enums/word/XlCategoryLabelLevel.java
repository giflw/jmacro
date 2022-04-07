package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.xlcategorylabellevel">https://docs.microsoft.com/en-us/office/vba/api/word.xlcategorylabellevel</a>}
*/
public enum XlCategoryLabelLevel implements COMEnum {
    
    /**@ Use all category label levels within range on the chart. The default. */
    xlCategoryLabelLevelAll(-1),    
    /**@ Indicates literal data in the category labels. */
    xlCategoryLabelLevelCustom(-2),    
    /**@ Use no category labels in the chart. Defaults to automatic indexed labels. */
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
