package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.pptextuniteffect">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.pptextuniteffect</a>}
*/
public enum PpTextUnitEffect implements COMEnum {
    
    /**@ Text-unit effects are animated by character. */
    ppAnimateByCharacter(2),    
    /**@ Text-unit effects are animated by paragraph. */
    ppAnimateByParagraph(0),    
    /**@ Text-unit effects are animated by word. */
    ppAnimateByWord(1),    
    /**@ Text-unit effects are animated in a mixed manner. */
    ppAnimateUnitMixed(-2);

    private final long value;

    PpTextUnitEffect(long value) {
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
