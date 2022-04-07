package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acmissingdatapolicy">https://docs.microsoft.com/en-us/office/vba/api/access.acmissingdatapolicy</a>}
*/
public enum AcMissingDataPolicy implements COMEnum {
    
    /**@ Do not plot. */
    acDoNotPlot(1),    
    /**@ Plot as interpolated. */
    acPlotAsInterpolated(2),    
    /**@ Plot as zero. */
    acPlotAsZero(0);

    private final long value;

    AcMissingDataPolicy(long value) {
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
