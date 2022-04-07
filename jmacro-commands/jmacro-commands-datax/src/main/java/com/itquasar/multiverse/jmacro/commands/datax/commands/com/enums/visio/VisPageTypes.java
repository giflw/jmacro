package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.vispagetypes">https://docs.microsoft.com/en-us/office/vba/api/visio.vispagetypes</a>}
*/
public enum VisPageTypes implements COMEnum {
    
    /**@ Not a Microsoft Visio page. */
    visPageTypeInval(0),    
    /**@ A background page. */
    visTypeBackground(2),    
    /**@ A foreground page. */
    visTypeForeground(1),    
    /**@ An annotation page. */
    visTypeMarkup(3);

    private final long value;

    VisPageTypes(long value) {
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
