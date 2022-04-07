package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.pptextstyletype">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.pptextstyletype</a>}
*/
public enum PpTextStyleType implements COMEnum {
    
    /**@ Body style */
    ppBodyStyle(3),    
    /**@ Default style */
    ppDefaultStyle(1),    
    /**@ Title style */
    ppTitleStyle(2);

    private final long value;

    PpTextStyleType(long value) {
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
