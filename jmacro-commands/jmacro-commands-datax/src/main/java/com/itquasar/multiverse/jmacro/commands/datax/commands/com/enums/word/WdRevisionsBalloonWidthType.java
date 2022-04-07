package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdrevisionsballoonwidthtype">https://docs.microsoft.com/en-us/office/vba/api/word.wdrevisionsballoonwidthtype</a>}
*/
public enum WdRevisionsBalloonWidthType implements COMEnum {
    
    /**@ Measured as a percentage of the width of the document. */
    wdBalloonWidthPercent(0),    
    /**@ Measured in points. */
    wdBalloonWidthPoints(1);

    private final long value;

    WdRevisionsBalloonWidthType(long value) {
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
