package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visselectitemstatus">https://docs.microsoft.com/en-us/office/vba/api/visio.visselectitemstatus</a>}
*/
public enum VisSelectItemStatus implements COMEnum {
    
    /**@ The item is the primary item. */
    visSelIsPrimaryItem(1),    
    /**@ The item is a subselected item. */
    visSelIsSubItem(2),    
    /**@ The item is a superselected item. */
    visSelIsSuperItem(4);

    private final long value;

    VisSelectItemStatus(long value) {
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
