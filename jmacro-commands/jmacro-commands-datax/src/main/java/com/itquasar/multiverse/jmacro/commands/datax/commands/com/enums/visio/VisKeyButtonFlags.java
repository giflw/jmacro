package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.viskeybuttonflags">https://docs.microsoft.com/en-us/office/vba/api/visio.viskeybuttonflags</a>}
*/
public enum VisKeyButtonFlags implements COMEnum {
    
    /**@ Ctrl key */
    visKeyControl(8),    
    /**@ Shift key */
    visKeyShift(4),    
    /**@ Left mouse button */
    visMouseLeft(1),    
    /**@ Mouse wheel */
    visMouseMiddle(16),    
    /**@ Right mouse button */
    visMouseRight(2);

    private final long value;

    VisKeyButtonFlags(long value) {
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
