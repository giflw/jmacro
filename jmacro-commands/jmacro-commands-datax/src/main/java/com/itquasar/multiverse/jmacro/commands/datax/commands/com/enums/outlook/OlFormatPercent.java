package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olformatpercent">https://docs.microsoft.com/en-us/office/vba/api/outlook.olformatpercent</a>}
*/
public enum OlFormatPercent implements COMEnum {
    
    /**@ Displays formatted number values, including one fixed decimal place, using the group and decimal delimiters specified in the system's regional settings. For example, the value 4010.155 is displayed as "4,010.2%". */
    olFormatPercent1Decimal(2),    
    /**@ Displays formatted number values, including two fixed decimal places, using the group and decimal delimiters specified in the system's regional settings. For example, the value 4010.155 is displayed as "4,010.16%" */
    olFormatPercent2Decimal(3),    
    /**@ Displays formatted number values, including any decimal places specified in the value, using the group and decimal delimiters specified in the system's regional settings. For example, the value 4010.155 is displayed as "4,010.155%" */
    olFormatPercentAllDigits(4),    
    /**@ Displays formatted number values as integers, rounding all decimal values, using the group and decimal delimiters specified in the system's regional settings. For example, the value 4010.155 is displayed as "4,010%". */
    olFormatPercentRounded(1);

    private final long value;

    OlFormatPercent(long value) {
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
