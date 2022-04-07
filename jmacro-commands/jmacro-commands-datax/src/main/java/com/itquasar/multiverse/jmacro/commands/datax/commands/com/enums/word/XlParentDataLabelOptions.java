package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.xlparentdatalabeloptions">https://docs.microsoft.com/en-us/office/vba/api/word.xlparentdatalabeloptions</a>}
*/
public enum XlParentDataLabelOptions implements COMEnum {
    
    /**@ No parent labels are shown. */
    xlParentDataLabelOptionsNone(0),    
    /**@ The parent label layout is a banner above the category. */
    xlParentDataLabelOptionsBanner(1),    
    /**@ The parent label is laid out within the category. */
    xlParentDataLabelOptionsOverlapping(2);

    private final long value;

    XlParentDataLabelOptions(long value) {
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
