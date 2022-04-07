package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppautosize">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppautosize</a>}
*/
public enum PpAutoSize implements COMEnum {
    
    /**@ Mixed size. */
    ppAutoSizeMixed(-2),    
    /**@ Does not change size. */
    ppAutoSizeNone(0),    
    /**@ Auto sizes the shape to fit the text. */
    ppAutoSizeShapeToFitText(1);

    private final long value;

    PpAutoSize(long value) {
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
