package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olmousebutton">https://docs.microsoft.com/en-us/office/vba/api/outlook.olmousebutton</a>}
*/
public enum OlMouseButton implements COMEnum {
    
    /**@ Indicates that the primary (left) button on a mouse is pressed during the event. */
    olMouseButtonLeft(1),    
    /**@ Indicates that the secondary (right) button on a mouse is pressed during the event. */
    olMouseButtonRight(2),    
    /**@ Indicates that the middle button on a mouse is pressed during the event. */
    olMouseButtonMiddle(4);

    private final long value;

    OlMouseButton(long value) {
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
