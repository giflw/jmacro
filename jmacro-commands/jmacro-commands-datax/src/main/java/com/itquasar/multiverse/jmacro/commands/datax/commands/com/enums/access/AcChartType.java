package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.accharttype">https://docs.microsoft.com/en-us/office/vba/api/access.accharttype</a>}
*/
public enum AcChartType implements COMEnum {
    
    /**@ Clustered Bar */
    acChartBarClustered(3),    
    /**@ Stacked Bar */
    acChartBarStacked(4),    
    /**@ 100% Stacked Bar */
    acChartBarStacked100(5),    
    /**@ Clustered Column */
    acChartColumnClustered(0),    
    /**@ Stacked Column */
    acChartColumnStacked(1),    
    /**@ 100% Stacked Column */
    acChartColumnStacked100(2),    
    /**@ Combo */
    acChartCombo(10),    
    /**@ Line */
    acChartLine(6),    
    /**@ Line Stacked */
    acChartLineStacked(7),    
    /**@ 100% Stacked Line */
    acChartLineStacked100(8),    
    /**@ Pie */
    acChartPie(9);

    private final long value;

    AcChartType(long value) {
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
