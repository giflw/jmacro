package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppindentcontrol">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppindentcontrol</a>}
*/
public enum PpIndentControl implements COMEnum {
    
    /**@ Mixed control. */
    ppIndentControlMixed(-2),    
    /**@ Keep attribute. */
    ppIndentKeepAttr(2),    
    /**@ Replace attribute. */
    ppIndentReplaceAttr(1);

    private final long value;

    PpIndentControl(long value) {
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
