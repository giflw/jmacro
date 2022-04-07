package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjfieldtype">https://docs.microsoft.com/en-us/office/vba/api/project.pjfieldtype</a>}
*/
public enum PjFieldType implements COMEnum {
    
    /**@ Project entity. */
    pjProject(2),    
    /**@ Resource entity. */
    pjResource(1),    
    /**@ Task entity. */
    pjTask(0);

    private final long value;

    PjFieldType(long value) {
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
