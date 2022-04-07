package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjtoolbaraction">https://docs.microsoft.com/en-us/office/vba/api/project.pjtoolbaraction</a>}
*/
public enum PjToolbarAction implements COMEnum {
    
    /**@ Copy. */
    pjCopy(4),    
    /**@ Delete. */
    pjDelete(2),    
    /**@ Hide. */
    pjHide(7),    
    /**@ New. */
    pjNew(3),    
    /**@ Rename. */
    pjRename(5),    
    /**@ Reset. */
    pjReset(2),    
    /**@ Show. */
    pjShow(6),    
    /**@ Toggle. */
    pjToggle(1);

    private final long value;

    PjToolbarAction(long value) {
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
