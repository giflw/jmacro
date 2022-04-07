package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.pphtmlversion">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.pphtmlversion</a>}
*/
public enum PpHTMLVersion implements COMEnum {
    
    /**@ Autodetect */
    ppHTMLAutodetect(4),    
    /**@ Dual version */
    ppHTMLDual(3),    
    /**@ HTML Version 3 */
    ppHTMLv3(1),    
    /**@ HTML Version 4 (Default) */
    ppHTMLv4(2);

    private final long value;

    PpHTMLVersion(long value) {
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
