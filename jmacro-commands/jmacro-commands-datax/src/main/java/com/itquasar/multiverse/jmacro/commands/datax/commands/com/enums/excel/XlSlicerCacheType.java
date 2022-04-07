package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlslicercachetype">https://docs.microsoft.com/en-us/office/vba/api/excel.xlslicercachetype</a>}
*/
public enum XlSlicerCacheType implements COMEnum {
    
    /**@ Slicer cache represents a Slicer. */
    xlSlicer(1),    
    /**@ Slicer cache represents a Timeline. */
    xlTimeline(2);

    private final long value;

    XlSlicerCacheType(long value) {
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
