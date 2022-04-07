package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjresourcetypes">https://docs.microsoft.com/en-us/office/vba/api/project.pjresourcetypes</a>}
*/
public enum PjResourceTypes implements COMEnum {
    
    /**@ Resource type is Cost. */
    pjResourceTypeCost(2),    
    /**@ Resource type is Material. */
    pjResourceTypeMaterial(1),    
    /**@ Resource type is Work. */
    pjResourceTypeWork(0);

    private final long value;

    PjResourceTypes(long value) {
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
