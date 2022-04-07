package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppprinthandoutorder">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppprinthandoutorder</a>}
*/
public enum PpPrintHandoutOrder implements COMEnum {
    
    /**@ Slides are ordered horizontally, with the first slide in the upper-left corner and the second slide to the right of it. If your language setting specifies a right-to-left language, the first slide is in the upper-right corner with the second slide to the left of it. */
    ppPrintHandoutHorizontalFirst(2),    
    /**@ Slides are ordered vertically, with the first slide in the upper-left corner and the second slide below it. If your language setting specifies a right-to-left language, the first slide is in the upper-right corner with the second slide below it. */
    ppPrintHandoutVerticalFirst(1);

    private final long value;

    PpPrintHandoutOrder(long value) {
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
