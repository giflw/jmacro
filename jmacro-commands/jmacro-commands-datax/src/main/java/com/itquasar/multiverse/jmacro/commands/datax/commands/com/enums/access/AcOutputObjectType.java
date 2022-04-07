package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acoutputobjecttype">https://docs.microsoft.com/en-us/office/vba/api/access.acoutputobjecttype</a>}
*/
public enum AcOutputObjectType implements COMEnum {
    
    /**@ Form */
    acOutputForm(2),    
    /**@ User-Defined Function */
    acOutputFunction(10),    
    /**@ Module */
    acOutputModule(5),    
    /**@ Query */
    acOutputQuery(1),    
    /**@ Report */
    acOutputReport(3),    
    /**@ Server View */
    acOutputServerView(7),    
    /**@ Stored Procedure */
    acOutputStoredProcedure(9),    
    /**@ Table */
    acOutputTable(0);

    private final long value;

    AcOutputObjectType(long value) {
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
