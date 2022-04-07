package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olformatyesno">https://docs.microsoft.com/en-us/office/vba/api/outlook.olformatyesno</a>}
*/
public enum OlFormatYesNo implements COMEnum {
    
    /**@ Displays a check box icon. */
    olFormatYesNoIcon(4),    
    /**@ Displays "On" or "Off". */
    olFormatYesNoOnOff(2),    
    /**@ Displays "True" or "False". */
    olFormatYesNoTrueFalse(3),    
    /**@ Displays "Yes" or "No". */
    olFormatYesNoYesNo(1);

    private final long value;

    OlFormatYesNo(long value) {
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
