package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlcubefieldsubtype">https://docs.microsoft.com/en-us/office/vba/api/excel.xlcubefieldsubtype</a>}
*/
public enum XlCubeFieldSubType implements COMEnum {
    
    /**@ Attribute */
    xlCubeAttribute(4),    
    /**@ Calculated Measure */
    xlCubeCalculatedMeasure(5),    
    /**@ Hierarchy */
    xlCubeHierarchy(1),    
    /**@ An implicit measure */
    xlCubeImplicitMeasure(11),    
    /**@ KPI Goal */
    xlCubeKPIGoal(7),    
    /**@ KPI Status */
    xlCubeKPIStatus(8),    
    /**@ KPI Trend */
    xlCubeKPITrend(9),    
    /**@ KPI Value */
    xlCubeKPIValue(6),    
    /**@ KPI Weight */
    xlCubeKPIWeight(10),    
    /**@ Measure */
    xlCubeMeasure(2),    
    /**@ Set */
    xlCubeSet(3);

    private final long value;

    XlCubeFieldSubType(long value) {
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
