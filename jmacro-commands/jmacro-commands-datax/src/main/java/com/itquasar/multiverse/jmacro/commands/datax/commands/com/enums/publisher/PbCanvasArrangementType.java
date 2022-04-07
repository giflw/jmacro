package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbcanvasarrangementtype">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbcanvasarrangementtype</a>}
*/
public enum PbCanvasArrangementType implements COMEnum {
    
    /**@ Canvas arranged into columns. */
    pbCanvasArrangementTypeColsCanvas(1),    
    /**@ Canvas arranged as a single unit. */
    pbCanvasArrangementTypeOneCanvas(0),    
    /**@ Canvas arranged into rows. */
    pbCanvasArrangementTypeRowsCanvas(2);

    private final long value;

    PbCanvasArrangementType(long value) {
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
