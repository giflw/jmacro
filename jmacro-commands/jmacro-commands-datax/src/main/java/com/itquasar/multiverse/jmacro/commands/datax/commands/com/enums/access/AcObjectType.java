package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acobjecttype">https://docs.microsoft.com/en-us/office/vba/api/access.acobjecttype</a>}
*/
public enum AcObjectType implements COMEnum {
    
    /**@ Database property */
    acDatabaseProperties(11),    
    /**@ No description provided */
    acDefault(-1),    
    /**@ Database Diagram (Microsoft Access project) */
    acDiagram(8),    
    /**@ Form */
    acForm(2),    
    /**@ Function */
    acFunction(10),    
    /**@ Macro */
    acMacro(4),    
    /**@ Module */
    acModule(5),    
    /**@ Query */
    acQuery(1),    
    /**@ Report */
    acReport(3),    
    /**@ Server View */
    acServerView(7),    
    /**@ Stored Procedure (Microsoft Access project) */
    acStoredProcedure(9),    
    /**@ Table */
    acTable(0),    
    /**@ Data macro */
    acTableDataMacro(12);

    private final long value;

    AcObjectType(long value) {
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
