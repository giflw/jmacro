package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjaccrueat">https://docs.microsoft.com/en-us/office/vba/api/project.pjaccrueat</a>}
*/
public enum PjAccrueAt implements COMEnum {
    
    /**@ Task accrues the resource cost when the task ends. */
    pjEnd(2),    
    /**@ Task accrues the resource cost as the task progresses. */
    pjProrated(3),    
    /**@ Task accrues the resource cost when the task starts. */
    pjStart(1);

    private final long value;

    PjAccrueAt(long value) {
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
