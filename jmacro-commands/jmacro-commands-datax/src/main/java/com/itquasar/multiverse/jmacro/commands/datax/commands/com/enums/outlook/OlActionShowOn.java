package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olactionshowon">https://docs.microsoft.com/en-us/office/vba/api/outlook.olactionshowon</a>}
*/
public enum OlActionShowOn implements COMEnum {
    
    /**@ Indicates that the action will not be displayed on the menu or toolbar. */
    olDontShow(0),    
    /**@ Indicates that the action will be displayed as an available action on the menu. */
    olMenu(1),    
    /**@ Indicates that the action will be displayed as an available action on the menu and the toolbar. */
    olMenuAndToolbar(2);

    private final long value;

    OlActionShowOn(long value) {
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
