package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.oldisplaymode">https://docs.microsoft.com/en-us/office/vba/api/outlook.oldisplaymode</a>}
*/
public enum OlDisplayMode implements COMEnum {
    
    /**@ Displays Normal mode. */
    olDisplayModeNormal(0),    
    /**@ Displays Portrait Reading Pane mode. */
    olDisplayModePortraitReadingPane(2),    
    /**@ Displays Portrait View mode. */
    olDisplayModePortraitView(1);

    private final long value;

    OlDisplayMode(long value) {
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
