package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visuimenuanimation">https://docs.microsoft.com/en-us/office/vba/api/visio.visuimenuanimation</a>}
*/
public enum VisUIMenuAnimation implements COMEnum {
    
    /**@ Animations appear immediately. */
    visMenuAnimationNone(0),    
    /**@ Animations unfold or slide randomly. */
    visMenuAnimationRandom(1),    
    /**@ Animations appear to slide into view from above. */
    visMenuAnimationSlide(3),    
    /**@ Animations appear to expand from a point in the upper-left corner of the animation. */
    visMenuAnimationUnfold(2);

    private final long value;

    VisUIMenuAnimation(long value) {
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
