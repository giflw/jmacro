package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olactionresponsestyle">https://docs.microsoft.com/en-us/office/vba/api/outlook.olactionresponsestyle</a>}
*/
public enum OlActionResponseStyle implements COMEnum {
    
    /**@ Indicates that a form will be opened. */
    olOpen(0),    
    /**@ Indicates that the user will be prompted to open or send the form. */
    olPrompt(2),    
    /**@ Indicates that the form will be sent immediately. */
    olSend(1);

    private final long value;

    OlActionResponseStyle(long value) {
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
