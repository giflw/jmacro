package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjcalendarbartype">https://docs.microsoft.com/en-us/office/vba/api/project.pjcalendarbartype</a>}
*/
public enum PjCalendarBarType implements COMEnum {
    
    /**@ Line bar. */
    pjLineBar(1),    
    /**@ No bar. */
    pjNoBar(2),    
    /**@ Normal bar. */
    pjNormalBar(0);

    private final long value;

    PjCalendarBarType(long value) {
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
