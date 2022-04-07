package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppprintrangetype">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppprintrangetype</a>}
*/
public enum PpPrintRangeType implements COMEnum {
    
    /**@ Print all slides in the presentation. */
    ppPrintAll(1),    
    /**@ Print the current slide from the presentation. */
    ppPrintCurrent(3),    
    /**@ Print a named slideshow. */
    ppPrintNamedSlideShow(5),    
    /**@ Print a selection of slides. */
    ppPrintSelection(2),    
    /**@ Print a range of slides. */
    ppPrintSlideRange(4);

    private final long value;

    PpPrintRangeType(long value) {
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
