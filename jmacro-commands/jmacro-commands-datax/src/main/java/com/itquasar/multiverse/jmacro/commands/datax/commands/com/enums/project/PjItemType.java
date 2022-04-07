package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjitemtype">https://docs.microsoft.com/en-us/office/vba/api/project.pjitemtype</a>}
*/
public enum PjItemType implements COMEnum {
    
    /**@ Other item. */
    pjOtherItem(2),    
    /**@ Resource item. */
    pjResourceItem(1),    
    /**@ Task item. */
    pjTaskItem(0);

    private final long value;

    PjItemType(long value) {
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
