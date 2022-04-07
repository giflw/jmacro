package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.accurrentview">https://docs.microsoft.com/en-us/office/vba/api/access.accurrentview</a>}
*/
public enum AcCurrentView implements COMEnum {
    
    /**@ The object is in Datasheet view. */
    acCurViewDatasheet(2),    
    /**@ The object is in Design view. */
    acCurViewDesign(0),    
    /**@ The object is in Form view. */
    acCurViewFormBrowse(1),    
    /**@ The object is in Layout view. */
    acCurViewLayout(7),    
    /**@ The object is in PivotChart view. */
    acCurViewPivotChart(4),    
    /**@ The object is in PivotTable view. */
    acCurViewPivotTable(3),    
    /**@ The object is in Print Preview. */
    acCurViewPreview(5),    
    /**@ The object is in Report view. */
    acCurViewReportBrowse(6);

    private final long value;

    AcCurrentView(long value) {
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
