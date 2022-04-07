package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xltoolbarprotection">https://docs.microsoft.com/en-us/office/vba/api/excel.xltoolbarprotection</a>}
*/
public enum XlToolbarProtection implements COMEnum {
    
    /**@ No button changes permitted. */
    xlNoButtonChanges(1),    
    /**@ No changes of any kind. */
    xlNoChanges(4),    
    /**@ No changes to toolbar's docking position. */
    xlNoDockingChanges(3),    
    /**@ No changes to toolbar shape. */
    xlNoShapeChanges(2),    
    /**@ All changes permitted. */
    xlToolbarProtectionNone(-4143);

    private final long value;

    XlToolbarProtection(long value) {
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
