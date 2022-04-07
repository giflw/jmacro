package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visrotationtypes">https://docs.microsoft.com/en-us/office/vba/api/visio.visrotationtypes</a>}
*/
public enum VisRotationTypes implements COMEnum {
    
    /**@ Rotate the selection around a pin. */
    visRotateSelectionWithPin(1),    
    /**@ Rotate the selection relative to the center of the selection. */
    visRotateSelection(0),    
    /**@ Rotate the selected shapes around their pins relative to their current angle. */
    visRotateShapes(2);

    private final long value;

    VisRotationTypes(long value) {
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
