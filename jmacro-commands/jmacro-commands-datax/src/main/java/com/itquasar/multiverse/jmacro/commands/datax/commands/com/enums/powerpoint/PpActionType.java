package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppactiontype">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppactiontype</a>}
*/
public enum PpActionType implements COMEnum {
    
    /**@ Slide show ends. */
    ppActionEndShow(6),    
    /**@ Returns to the first slide. */
    ppActionFirstSlide(3),    
    /**@ Hyperlink. */
    ppActionHyperlink(7),    
    /**@ Moves to the last slide. */
    ppActionLastSlide(4),    
    /**@ Moves to the last slide viewed. */
    ppActionLastSlideViewed(5),    
    /**@ Performs a mixed action. */
    ppActionMixed(-2),    
    /**@ Runs the slideshow. */
    ppActionNamedSlideShow(10),    
    /**@ Moves to the next slide. */
    ppActionNextSlide(1),    
    /**@ No action is performed. */
    ppActionNone(0),    
    /**@ OLE Verb. */
    ppActionOLEVerb(11),    
    /**@ Begins the slideshow. */
    ppActionPlay(12),    
    /**@ Moves to the previous slide. */
    ppActionPreviousSlide(2),    
    /**@ Runs a macro. */
    ppActionRunMacro(8),    
    /**@ Runs a program. */
    ppActionRunProgram(9);

    private final long value;

    PpActionType(long value) {
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
