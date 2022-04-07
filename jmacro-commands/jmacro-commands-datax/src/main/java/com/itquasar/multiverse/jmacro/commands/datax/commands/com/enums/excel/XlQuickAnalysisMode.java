package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlquickanalysismode">https://docs.microsoft.com/en-us/office/vba/api/excel.xlquickanalysismode</a>}
*/
public enum XlQuickAnalysisMode implements COMEnum {
    
    /**@ Show the button but no callout user interface */
    xlLensOnly(0),    
    /**@ Conditional Formatting */
    xlFormatConditions(1),    
    /**@ Charts */
    xlRecommendedCharts(2),    
    /**@ Totals */
    xlTotals(3),    
    /**@ Tables */
    xlTables(4),    
    /**@ Sparklines */
    xlSparklines(5);

    private final long value;

    XlQuickAnalysisMode(long value) {
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
