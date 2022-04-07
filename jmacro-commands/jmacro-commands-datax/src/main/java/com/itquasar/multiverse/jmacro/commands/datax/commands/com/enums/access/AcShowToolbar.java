package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acshowtoolbar">https://docs.microsoft.com/en-us/office/vba/api/access.acshowtoolbar</a>}
*/
public enum AcShowToolbar implements COMEnum {
    
    /**@ Hide the toolbar. */
    acToolbarNo(2),    
    /**@ Display the toolbar while in the appropriate view. */
    acToolbarWhereApprop(1),    
    /**@ Display the toolbar. */
    acToolbarYes(0);

    private final long value;

    AcShowToolbar(long value) {
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
