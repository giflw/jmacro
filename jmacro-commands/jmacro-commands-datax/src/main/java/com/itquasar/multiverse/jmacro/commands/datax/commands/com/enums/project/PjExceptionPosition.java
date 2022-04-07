package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjexceptionposition">https://docs.microsoft.com/en-us/office/vba/api/project.pjexceptionposition</a>}
*/
public enum PjExceptionPosition implements COMEnum {
    
    /**@ First week of the month. */
    pjFirst(0),    
    /**@ Fourth week of the month. */
    pjFourth(3),    
    /**@ Last week of the month. */
    pjLast(4),    
    /**@ Second week of the month. */
    pjSecond(1),    
    /**@ Third week of the month. */
    pjThird(2);

    private final long value;

    PjExceptionPosition(long value) {
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
