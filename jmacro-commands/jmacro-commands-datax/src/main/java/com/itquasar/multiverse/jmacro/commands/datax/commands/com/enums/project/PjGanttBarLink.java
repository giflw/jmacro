package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjganttbarlink">https://docs.microsoft.com/en-us/office/vba/api/project.pjganttbarlink</a>}
*/
public enum PjGanttBarLink implements COMEnum {
    
    /**@ No Gantt bar links. */
    pjNoGanttBarLinks(0),    
    /**@ At the end. */
    pjToEnd(2),    
    /**@ At the top. */
    pjToTop(1);

    private final long value;

    PjGanttBarLink(long value) {
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
