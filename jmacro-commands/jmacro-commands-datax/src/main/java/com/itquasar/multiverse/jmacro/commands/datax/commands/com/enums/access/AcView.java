package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acview">https://docs.microsoft.com/en-us/office/vba/api/access.acview</a>}
*/
public enum AcView implements COMEnum {
    
    /**@ Design view */
    acViewDesign(1),    
    /**@ Layout view */
    acViewLayout(6),    
    /**@ (Default) Normal view */
    acViewNormal(0),    
    /**@ PivotChart view */
    acViewPivotChart(4),    
    /**@ PivotTable view */
    acViewPivotTable(3),    
    /**@ Print Preview */
    acViewPreview(2),    
    /**@ Report view */
    acViewReport(5);

    private final long value;

    AcView(long value) {
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
