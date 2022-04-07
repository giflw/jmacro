package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.xlborderweight">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.xlborderweight</a>}
*/
public enum XlBorderWeight implements COMEnum {
    
    /**@ A hairline border (thinnest border). */
    xlHairline(1),    
    /**@ A medium border. */
    xlMedium(-4138),    
    /**@ A thick border (widest border). */
    xlThick(4),    
    /**@ A thin border. */
    xlThin(2);

    private final long value;

    XlBorderWeight(long value) {
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
