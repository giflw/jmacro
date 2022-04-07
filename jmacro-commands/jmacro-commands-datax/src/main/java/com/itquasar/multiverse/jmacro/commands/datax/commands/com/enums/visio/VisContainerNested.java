package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.viscontainernested">https://docs.microsoft.com/en-us/office/vba/api/visio.viscontainernested</a>}
*/
public enum VisContainerNested implements COMEnum {
    
    /**@ Include shapes that are in nested containers. */
    visContainerIncludeNested(0),    
    /**@ Exclude shapes that are in nested containers. */
    visContainerExcludeNested(1);

    private final long value;

    VisContainerNested(long value) {
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
