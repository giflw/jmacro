package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjborder">https://docs.microsoft.com/en-us/office/vba/api/project.pjborder</a>}
*/
public enum PjBorder implements COMEnum {
    
    /**@ Around every page. */
    pjAroundEveryPage(1),    
    /**@ No border. */
    pjNoBorder(0),    
    /**@ On the outside pages. */
    pjOutsidePages(2);

    private final long value;

    PjBorder(long value) {
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
