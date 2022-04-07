package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppprintoutputtype">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppprintoutputtype</a>}
*/
public enum PpPrintOutputType implements COMEnum {
    
    /**@ Build Slides */
    ppPrintOutputBuildSlides(7),    
    /**@ Four Slide Handouts */
    ppPrintOutputFourSlideHandouts(8),    
    /**@ Nine Slide Handouts */
    ppPrintOutputNineSlideHandouts(9),    
    /**@ Notes Pages */
    ppPrintOutputNotesPages(5),    
    /**@ Single Slide Handouts */
    ppPrintOutputOneSlideHandouts(10),    
    /**@ Outline */
    ppPrintOutputOutline(6),    
    /**@ Six Slide Handouts */
    ppPrintOutputSixSlideHandouts(4),    
    /**@ Slides */
    ppPrintOutputSlides(1),    
    /**@ Three Slide Handouts */
    ppPrintOutputThreeSlideHandouts(3),    
    /**@ Two Slide Handouts */
    ppPrintOutputTwoSlideHandouts(2);

    private final long value;

    PpPrintOutputType(long value) {
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
