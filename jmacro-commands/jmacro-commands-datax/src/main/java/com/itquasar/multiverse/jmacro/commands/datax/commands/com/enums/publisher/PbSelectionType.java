package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbselectiontype">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbselectiontype</a>}
*/
public enum PbSelectionType implements COMEnum {
    
    /**@ Selection type none. */
    pbSelectionNone(0),    
    /**@ Selection type shape. */
    pbSelectionShape(1),    
    /**@ Selection type subselection. */
    pbSelectionShapeSubSelection(4),    
    /**@ Selection type table cells. */
    pbSelectionTableCells(3),    
    /**@ Selection type text. */
    pbSelectionText(2);

    private final long value;

    PbSelectionType(long value) {
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
