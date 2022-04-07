package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjtaskfixedtype">https://docs.microsoft.com/en-us/office/vba/api/project.pjtaskfixedtype</a>}
*/
public enum PjTaskFixedType implements COMEnum {
    
    /**@ Fixed duration. */
    pjFixedDuration(1),    
    /**@ Fixed units. */
    pjFixedUnits(0),    
    /**@ Fixed work. */
    pjFixedWork(2);

    private final long value;

    PjTaskFixedType(long value) {
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
