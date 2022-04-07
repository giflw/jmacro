package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjvisualreportscubetype">https://docs.microsoft.com/en-us/office/vba/api/project.pjvisualreportscubetype</a>}
*/
public enum PjVisualReportsCubeType implements COMEnum {
    
    /**@ Nontimephased assignment cube. */
    pjAssignmentNTP(6),    
    /**@ Timephased assignment cube. */
    pjAssignmentTP(3),    
    /**@ Nontimephased resource cube. */
    pjResourceNTP(5),    
    /**@ Timephased resource cube. */
    pjResourceTP(2),    
    /**@ Nontimephased task cube. */
    pjTaskNTP(4),    
    /**@ Timephased task cube. */
    pjTaskTP(1);

    private final long value;

    PjVisualReportsCubeType(long value) {
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
