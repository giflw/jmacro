package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.oleditortype">https://docs.microsoft.com/en-us/office/vba/api/outlook.oleditortype</a>}
*/
public enum OlEditorType implements COMEnum {
    
    /**@ HTML editor */
    olEditorHTML(2),    
    /**@ Real Text Format (RTF) editor */
    olEditorRTF(3),    
    /**@ Text editor */
    olEditorText(1),    
    /**@ Microsoft Office Word editor */
    olEditorWord(4);

    private final long value;

    OlEditorType(long value) {
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
