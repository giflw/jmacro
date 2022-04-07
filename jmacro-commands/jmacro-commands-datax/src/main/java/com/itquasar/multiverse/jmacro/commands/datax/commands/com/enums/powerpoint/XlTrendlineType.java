package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.xltrendlinetype">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.xltrendlinetype</a>}
*/
public enum XlTrendlineType implements COMEnum {
    
    /**@ Uses an equation to calculate the least squares fit through points (for example, y=ab^x) . */
    xlExponential(5),    
    /**@ Uses the linear equation y = mx + b to calculate the least squares fit through points. */
    xlLinear(-4132),    
    /**@ Uses the equation y = c ln x + b to calculate the least squares fit through points. */
    xlLogarithmic(-4133),    
    /**@ Uses a sequence of averages computed from parts of the data series. The number of points equals the total number of points in the series minus the number specified for the period. */
    xlMovingAvg(6),    
    /**@ Uses an equation to calculate the least squares fit through points (for example, y = ax^6 + bx^5 + cx^4 + dx^3 + ex^2 + fx + g). */
    xlPolynomial(3),    
    /**@ Uses an equation to calculate the least squares fit through points (for example, y = ax^b). */
    xlPower(4);

    private final long value;

    XlTrendlineType(long value) {
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
