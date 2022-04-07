package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acformview">https://docs.microsoft.com/en-us/office/vba/api/access.acformview</a>}
*/
public enum AcFormView implements COMEnum {
    
    /**@ The form opens in Design view. */
    acDesign(1),    
    /**@ The form opens in Datasheet view. */
    acFormDS(3),    
    /**@ The form opens in PivotChart view. */
    acFormPivotChart(5),    
    /**@ The form opens in PivotTable view. */
    acFormPivotTable(4),    
    /**@ The form opens in Layout view. */
    acLayout(6),    
    /**@ (Default) The form opens in Form view. */
    acNormal(0),    
    /**@ The form opens in Print Preview. */
    acPreview(2);

    private final long value;

    AcFormView(long value) {
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
