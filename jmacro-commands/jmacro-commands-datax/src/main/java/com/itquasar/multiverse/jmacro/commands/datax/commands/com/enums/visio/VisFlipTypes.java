package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visfliptypes">https://docs.microsoft.com/en-us/office/vba/api/visio.visfliptypes</a>}
*/
public enum VisFlipTypes implements COMEnum {
    
    /**@ Flip the selection around a pin. */
    visFlipSelectionWithPin(1),    
    /**@ Flip the selection around its center. */
    visFlipSelection(0),    
    /**@ Flip the selected shapes around their pins. */
    visFlipShapes(2);

    private final long value;

    VisFlipTypes(long value) {
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
