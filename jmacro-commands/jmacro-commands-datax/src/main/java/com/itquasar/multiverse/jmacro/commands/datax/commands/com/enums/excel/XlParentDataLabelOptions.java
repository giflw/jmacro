package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlparentdatalabeloptions">https://docs.microsoft.com/en-us/office/vba/api/excel.xlparentdatalabeloptions</a>}
*/
public enum XlParentDataLabelOptions implements COMEnum {
    
    /**@ Banner parent data label */
    xlParentDataLabelOptionsBanner(1),    
    /**@ No parent data label */
    xlParentDataLabelOptionsNone(0),    
    /**@ Overlapping parent data label */
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
