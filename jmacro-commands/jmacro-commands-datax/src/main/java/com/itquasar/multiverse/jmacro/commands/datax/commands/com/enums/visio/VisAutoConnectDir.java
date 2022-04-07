package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visautoconnectdir">https://docs.microsoft.com/en-us/office/vba/api/visio.visautoconnectdir</a>}
*/
public enum VisAutoConnectDir implements COMEnum {
    
    /**@ Place shape below. */
    visAutoConnectDirDown(2),    
    /**@ Place shape to the left. */
    visAutoConnectDirLeft(3),    
    /**@ Do not place shape. */
    visAutoConnectDirNone(0),    
    /**@ Place shape to the right. */
    visAutoConnectDirRight(4),    
    /**@ Place shape above. */
    visAutoConnectDirUp(1);

    private final long value;

    VisAutoConnectDir(long value) {
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
