package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visthemetypes">https://docs.microsoft.com/en-us/office/vba/api/visio.visthemetypes</a>}
*/
public enum VisThemeTypes implements COMEnum {
    
    /**@ Theme colors. */
    visThemeTypeColor(1),    
    /**@ Theme connectors. */
    visThemeTypeConnector(3),    
    /**@ Theme effects. */
    visThemeTypeEffect(2),    
    /**@ Theme fonts. */
    visThemeTypeFont(4),    
    /**@ Theme indices. */
    visThemeTypeIndex(0);

    private final long value;

    VisThemeTypes(long value) {
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
