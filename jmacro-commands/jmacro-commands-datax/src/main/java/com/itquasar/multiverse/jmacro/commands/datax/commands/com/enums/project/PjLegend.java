package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjlegend">https://docs.microsoft.com/en-us/office/vba/api/project.pjlegend</a>}
*/
public enum PjLegend implements COMEnum {
    
    /**@ Legend appears after the last page. */
    pjAfterLastPage(1),    
    /**@ No legend. */
    pjNoLegend(0),    
    /**@ Legend appears on every page. */
    pjOnEveryPage(2);

    private final long value;

    PjLegend(long value) {
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
