package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.oldayweektimescale">https://docs.microsoft.com/en-us/office/vba/api/outlook.oldayweektimescale</a>}
*/
public enum OlDayWeekTimeScale implements COMEnum {
    
    /**@ Indicates that each time period represents 10 minutes. */
    olTimeScale10Minutes(2),    
    /**@ Indicates that each time period represents 15 minutes. */
    olTimeScale15Minutes(3),    
    /**@ Indicates that each time period represents 30 minutes. */
    olTimeScale30Minutes(4),    
    /**@ Indicates that each time period represents 5 minutes. */
    olTimeScale5Minutes(0),    
    /**@ Indicates that each time period represents 60 minutes. */
    olTimeScale60Minutes(5),    
    /**@ Indicates that each time period represents 6 minutes. */
    olTimeScale6Minutes(1);

    private final long value;

    OlDayWeekTimeScale(long value) {
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
