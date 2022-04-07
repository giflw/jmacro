package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xllinkeddatatypestate">https://docs.microsoft.com/en-us/office/vba/api/excel.xllinkeddatatypestate</a>}
*/
public enum XlLinkedDataTypeState implements COMEnum {
    
    /**@ The cell does not contain any Linked data types. */
    xlLinkedDataTypeStateNone(0),    
    /**@ The cell contains a Linked data type. */
    xlLinkedDataTypeStateValidLinkedData(1),    
    /**@ The cell needs to be disambiguated by the user before a Linked data type can be inserted. For example, if the user types "New York" into a cell and attempts to convert it to a "Geography" data type, they may need to select whether they meant New York State or New York City. Until they do so, the cell will be in this state. */
    xlLinkedDataTypeStateDisambiguationNeeded(2),    
    /**@ There is a valid Linked data type in the cell, but entity no longer exists on the service. */
    xlLinkedDataTypeStateBrokenLinkedData(3),    
    /**@ The Linked data type in the cell is in the middle of refreshing new data from the service. */
    xlLinkedDataTypeStateFetchingData(4);

    private final long value;

    XlLinkedDataTypeState(long value) {
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
