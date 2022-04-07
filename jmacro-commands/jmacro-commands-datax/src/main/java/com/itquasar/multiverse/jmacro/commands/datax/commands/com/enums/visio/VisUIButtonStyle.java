package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visuibuttonstyle">https://docs.microsoft.com/en-us/office/vba/api/visio.visuibuttonstyle</a>}
*/
public enum VisUIButtonStyle implements COMEnum {
    
    /**@ Default style. */
    visButtonAutomatic(0),    
    /**@ Text only (always). */
    visButtonCaption(2),    
    /**@ Image and text. */
    visButtonIconandCaption(3),    
    /**@ Text only (in menus). */
    visButtonIcon(1);

    private final long value;

    VisUIButtonStyle(long value) {
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
