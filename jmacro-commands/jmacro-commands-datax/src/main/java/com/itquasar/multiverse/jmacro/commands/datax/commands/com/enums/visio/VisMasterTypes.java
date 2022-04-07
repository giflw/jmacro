package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.vismastertypes">https://docs.microsoft.com/en-us/office/vba/api/visio.vismastertypes</a>}
*/
public enum VisMasterTypes implements COMEnum {
    
    /**@ Data graphic master. */
    visTypeDataGraphic(5),    
    /**@ Fill pattern master. */
    visTypeFillPattern(2),    
    /**@ Line end master. */
    visTypeLineEnd(4),    
    /**@ Line pattern master. */
    visTypeLinePattern(3),    
    /**@ Generic master, no overload. */
    visTypeMaster(1),    
    /**@ Theme colors master. */
    visTypeThemeColors(6),    
    /**@ Theme effects master. */
    visTypeThemeEffects(7);

    private final long value;

    VisMasterTypes(long value) {
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
