package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olformatcurrency">https://docs.microsoft.com/en-us/office/vba/api/outlook.olformatcurrency</a>}
*/
public enum OlFormatCurrency implements COMEnum {
    
    /**@ Displays currency values with decimal places. */
    olFormatCurrencyDecimal(1),    
    /**@ Displays currency values without decimal places, rounding the currency value to the nearest integer. */
    olFormatCurrencyNonDecimal(2);

    private final long value;

    OlFormatCurrency(long value) {
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
