package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.msoanimcommandtype">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.msoanimcommandtype</a>}
*/
public enum MsoAnimCommandType implements COMEnum {
    
    /**@ Call */
    msoAnimCommandTypeCall(1),    
    /**@ Event */
    msoAnimCommandTypeEvent(0),    
    /**@ Verb */
    msoAnimCommandTypeVerb(2);

    private final long value;

    MsoAnimCommandType(long value) {
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
