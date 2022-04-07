package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdrevisionsballoonprintorientation">https://docs.microsoft.com/en-us/office/vba/api/word.wdrevisionsballoonprintorientation</a>}
*/
public enum WdRevisionsBalloonPrintOrientation implements COMEnum {
    
    /**@ Microsoft Word automatically selects the orientation that keeps the zoom factor closest to 100%. */
    wdBalloonPrintOrientationAuto(0),    
    /**@ Word forces all sections to be printed in Landscape mode, regardless of original orientation, and prints the revision and comment balloons on the side opposite to the document text. */
    wdBalloonPrintOrientationForceLandscape(2),    
    /**@ Word preserves the orientation of the original, uncommented document. */
    wdBalloonPrintOrientationPreserve(1);

    private final long value;

    WdRevisionsBalloonPrintOrientation(long value) {
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
