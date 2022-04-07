package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlmousebutton">https://docs.microsoft.com/en-us/office/vba/api/excel.xlmousebutton</a>}
*/
public enum XlMouseButton implements COMEnum {
    
    /**@ No button was pressed. */
    xlNoButton(0),    
    /**@ The primary button (normally the left mouse button) was pressed. */
    xlPrimaryButton(1),    
    /**@ The secondary button (normally the right mouse button) was pressed. */
    xlSecondaryButton(2);

    private final long value;

    XlMouseButton(long value) {
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
