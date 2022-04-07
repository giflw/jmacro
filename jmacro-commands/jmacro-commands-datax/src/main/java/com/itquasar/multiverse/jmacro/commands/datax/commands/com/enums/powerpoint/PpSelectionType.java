package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppselectiontype">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppselectiontype</a>}
*/
public enum PpSelectionType implements COMEnum {
    
    /**@ None */
    ppSelectionNone(0),    
    /**@ Shapes */
    ppSelectionShapes(2),    
    /**@ Slides */
    ppSelectionSlides(1),    
    /**@ Text */
    ppSelectionText(3);

    private final long value;

    PpSelectionType(long value) {
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
