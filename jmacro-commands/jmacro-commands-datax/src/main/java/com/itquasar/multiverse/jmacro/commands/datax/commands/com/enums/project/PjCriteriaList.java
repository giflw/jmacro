package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjcriterialist">https://docs.microsoft.com/en-us/office/vba/api/project.pjcriterialist</a>}
*/
public enum PjCriteriaList implements COMEnum {
    
    /**@ Tasks are not summary tasks. */
    pjCriteriaNonSummary(0),    
    /**@ The task is the project summary task (task ID 0). */
    pjCriteriaProjectSummary(2),    
    /**@ Tasks are summary tasks. */
    pjCriteriaSummary(1);

    private final long value;

    PjCriteriaList(long value) {
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
