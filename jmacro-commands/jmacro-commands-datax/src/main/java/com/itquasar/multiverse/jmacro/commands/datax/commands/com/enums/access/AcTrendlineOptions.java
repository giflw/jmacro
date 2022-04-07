package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.actrendlineoptions">https://docs.microsoft.com/en-us/office/vba/api/access.actrendlineoptions</a>}
*/
public enum AcTrendlineOptions implements COMEnum {
    
    /**@ Exponential */
    acTrendlineExponential(2),    
    /**@ Linear */
    acTrendlineLinear(1),    
    /**@ Logarithmic */
    acTrendlineLogarithmic(3),    
    /**@ Moving Average */
    acTrendlineMovingAverage(6),    
    /**@ None */
    acTrendlineNone(0),    
    /**@ Polynomial */
    acTrendlinePolynomial(4),    
    /**@ Power */
    acTrendlinePower(5);

    private final long value;

    AcTrendlineOptions(long value) {
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
