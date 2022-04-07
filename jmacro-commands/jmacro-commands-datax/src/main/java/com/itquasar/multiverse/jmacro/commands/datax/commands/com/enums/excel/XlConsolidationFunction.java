package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlconsolidationfunction">https://docs.microsoft.com/en-us/office/vba/api/excel.xlconsolidationfunction</a>}
*/
public enum XlConsolidationFunction implements COMEnum {
    
    /**@ Average. */
    xlAverage(-4106),    
    /**@ Count. */
    xlCount(-4112),    
    /**@ Count numerical values only. */
    xlCountNums(-4113),    
    /**@ Count using Distinct Count analysis. */
    xlDistinctCount(11),    
    /**@ Maximum. */
    xlMax(-4136),    
    /**@ Minimum. */
    xlMin(-4139),    
    /**@ Multiply. */
    xlProduct(-4149),    
    /**@ Standard deviation, based on a sample. */
    xlStDev(-4155),    
    /**@ Standard deviation, based on the whole population. */
    xlStDevP(-4156),    
    /**@ Sum. */
    xlSum(-4157),    
    /**@ No subtotal function specified. */
    xlUnknown(1000),    
    /**@ Variation, based on a sample. */
    xlVar(-4164),    
    /**@ Variation, based on the whole population. */
    xlVarP(-4165);

    private final long value;

    XlConsolidationFunction(long value) {
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
