package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olformatnumber">https://docs.microsoft.com/en-us/office/vba/api/outlook.olformatnumber</a>}
*/
public enum OlFormatNumber implements COMEnum {
    
    /**@ Displays formatted number values, including one fixed decimal place, using the group and decimal delimiters specified in the system's regional settings. For example, the value 4010.155 is displayed as "4,010.2". */
    olFormatNumber1Decimal(3),    
    /**@ Displays formatted number values, including two fixed decimal places, using the group and decimal delimiters specified in the system's regional settings. For example, the value 4010.155 is displayed as "4,010.16". */
    olFormatNumber2Decimal(4),    
    /**@ Displays formatted number values, including any decimal places specified in the value, using the group and decimal delimiters specified in the system's regional settings. For example, the value 4010.155 is displayed as "4,010.155". */
    olFormatNumberAllDigits(1),    
    /**@ Displays formatted number values, representing bytes, as kilobytes (with the abbreviation "K") depending on the value. For example, the integer value of 1048576 is displayed as "1,024 K". */
    olFormatNumberComputer1(6),    
    /**@ Displays formatted number values, representing bytes, as either kilobytes (with the abbreviation "K"), megabytes (with the abbreviation "M"), or gigabytes (with the abbreviation "G"), depending on the value. For example, the integer value of 2048 is displayed as "2 K". */
    olFormatNumberComputer2(7),    
    /**@ Displays formatted number values, representing bytes, as either bytes (with the abbreviation "B"), kilobytes (with the abbreviation "KB"), megabytes (with the abbreviation "MB"), or gigabytes (with the abbreviation "GB"), depending on the value. For example, the integer value of 1000 is displayed as "1,000 B". */
    olFormatNumberComputer3(8),    
    /**@ Displays unformatted number values, including any decimal places specified in the value. For example, the value 1048576 is displayed as "1048576". */
    olFormatNumberRaw(9),    
    /**@ Displays formatted number values, using scientific notation. For example, the value 1048576 is displayed as "1.049E+06". */
    olFormatNumberScientific(5),    
    /**@ Displays formatted number values as integers, rounding all decimal values, using the group and decimal delimiters specified in the system's regional settings. For example, the value 4010.1 is displayed as "4,010". */
    olFormatNumberTruncated(2);

    private final long value;

    OlFormatNumber(long value) {
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
