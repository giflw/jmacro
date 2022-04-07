package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acdataobjecttype">https://docs.microsoft.com/en-us/office/vba/api/access.acdataobjecttype</a>}
*/
public enum AcDataObjectType implements COMEnum {
    
    /**@ The active object contains the record. */
    acActiveDataObject(-1),    
    /**@ A form contains the record. */
    acDataForm(2),    
    /**@ A user-defined function contains the record (Microsoft Access project only). */
    acDataFunction(10),    
    /**@ A query contains the record. */
    acDataQuery(1),    
    /**@ A report contains the record. */
    acDataReport(3),    
    /**@ A server view contains the record (Microsoft Access project only). */
    acDataServerView(7),    
    /**@ A stored procedure contains the record (Microsoft Access project only). */
    acDataStoredProcedure(9),    
    /**@ A table contains the record. */
    acDataTable(0);

    private final long value;

    AcDataObjectType(long value) {
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
