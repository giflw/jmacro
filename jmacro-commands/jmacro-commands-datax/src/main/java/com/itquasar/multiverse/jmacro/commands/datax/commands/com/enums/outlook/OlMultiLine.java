package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olmultiline">https://docs.microsoft.com/en-us/office/vba/api/outlook.olmultiline</a>}
*/
public enum OlMultiLine implements COMEnum {
    
    /**@ Multiple lines are always displayed. */
    olAlwaysMultiLine(2),    
    /**@ Single lines are always displayed. */
    olAlwaysSingleLine(1),    
    /**@ Single lines are displayed unless the length of the line, in characters, is greater than the value for the MultiLineWidth property of the TableView object, at which point multiple lines are displayed. */
    olWidthMultiLine(0);

    private final long value;

    OlMultiLine(long value) {
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
