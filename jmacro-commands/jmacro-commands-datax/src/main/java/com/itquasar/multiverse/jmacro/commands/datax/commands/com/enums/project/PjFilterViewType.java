package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjfilterviewtype">https://docs.microsoft.com/en-us/office/vba/api/project.pjfilterviewtype</a>}
*/
public enum PjFilterViewType implements COMEnum {
    
    /**@ Resource view type. */
    pjFilterViewTypeResource(1),    
    /**@ Task view type. */
    pjFilterViewTypeTask(0),    
    /**@ The filter matches the view. */
    pjFilterViewTypeUseView(65535);

    private final long value;

    PjFilterViewType(long value) {
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
