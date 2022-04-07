package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visprotection">https://docs.microsoft.com/en-us/office/vba/api/visio.visprotection</a>}
*/
public enum VisProtection implements COMEnum {
    
    /**@ Protect document backgrounds from user customization. */
    visProtectBackgrounds(8),    
    /**@ Protect document masters from user customization. */
    visProtectMasters(4),    
    /**@ Document is unprotected. */
    visProtectNone(0),    
    /**@ Protect document previews from user customization. */
    visProtectPreviews(16),    
    /**@ Protect document shapes from user customization. */
    visProtectShapes(2),    
    /**@ Protect document styles from user customization. */
    visProtectStyles(1);

    private final long value;

    VisProtection(long value) {
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
