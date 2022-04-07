package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppchartuniteffect">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppchartuniteffect</a>}
*/
public enum PpChartUnitEffect implements COMEnum {
    
    /**@ By category */
    ppAnimateByCategory(2),    
    /**@ By category elements */
    ppAnimateByCategoryElements(4),    
    /**@ By series */
    ppAnimateBySeries(1),    
    /**@ By series elements */
    ppAnimateBySeriesElements(3),    
    /**@ Chart all at once */
    ppAnimateChartAllAtOnce(5),    
    /**@ Chart mixed */
    ppAnimateChartMixed(-2);

    private final long value;

    PpChartUnitEffect(long value) {
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
