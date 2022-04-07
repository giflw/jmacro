package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.viscontainertypes">https://docs.microsoft.com/en-us/office/vba/api/visio.viscontainertypes</a>}
*/
public enum VisContainerTypes implements COMEnum {
    
    /**@ Member shapes are not arranged in a list. */
    visContainerTypeNormal(0),    
    /**@ Member shapes are arranged in a list. */
    visContainerTypeList(1);

    private final long value;

    VisContainerTypes(long value) {
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
