package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visselectiontypes">https://docs.microsoft.com/en-us/office/vba/api/visio.visselectiontypes</a>}
*/
public enum VisSelectionTypes implements COMEnum {
    
    /**@ A selection that initially contains all shapes. */
    visSelTypeAll(1),    
    /**@ A selection that initially contains all shapes that have a given type of data graphic appled. */
    visSelTypeByDataGraphic(6),    
    /**@ A selection that initially contains all the shapes of a given layer. */
    visSelTypeByLayer(3),    
    /**@ A selection that initially contains all the instantiated shapes of a given master. */
    visSelTypeByMaster(5),    
    /**@ A selection that initially contains all the shapes that have a given role. */
    visSelTypeByRole(7),    
    /**@ A selection that initially contains all the shapes of a given type. */
    visSelTypeByType(4),    
    /**@ A selection that initially contains no shapes. */
    visSelTypeEmpty(0),    
    /**@ A selection that initially contains one shape. */
    visSelTypeSingle(2);

    private final long value;

    VisSelectionTypes(long value) {
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
