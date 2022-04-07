package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olformatinteger">https://docs.microsoft.com/en-us/office/vba/api/outlook.olformatinteger</a>}
*/
public enum OlFormatInteger implements COMEnum {
    
    /**@ Displays integer values, representing bytes, as kilobytes (with the abbreviation "K") depending on the value. For example, the integer value of 1048576 is displayed as "1,024 K". */
    olFormatIntegerComputer1(2),    
    /**@ Displays integer values, representing bytes, as either kilobytes (with the abbreviation "K"), megabytes (with the abbreviation "M"), or gigabytes (with the abbreviation "G"), depending on the value. For example, the integer value of 2048 is displayed as "2 K". */
    olFormatIntegerComputer2(3),    
    /**@ Displays integer values, representing bytes, as either bytes (with the abbreviation "B"), kilobytes (with the abbreviation "KB"), megabytes (with the abbreviation "MB"), or gigabytes (with the abbreviation "GB"), depending on the value. For example, the integer value of 1000 is displayed as "1,000 B". */
    olFormatIntegerComputer3(4),    
    /**@ Displays integer values using the number format specified in your computer's regional settings. */
    olFormatIntegerPlain(1);

    private final long value;

    OlFormatInteger(long value) {
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
