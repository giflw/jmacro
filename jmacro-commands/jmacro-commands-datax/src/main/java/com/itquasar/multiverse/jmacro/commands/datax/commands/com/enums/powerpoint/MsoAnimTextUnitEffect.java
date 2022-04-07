package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.msoanimtextuniteffect">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.msoanimtextuniteffect</a>}
*/
public enum MsoAnimTextUnitEffect implements COMEnum {
    
    /**@ By character. */
    msoAnimTextUnitEffectByCharacter(1),    
    /**@ By paragraph. */
    msoAnimTextUnitEffectByParagraph(0),    
    /**@ By word. */
    msoAnimTextUnitEffectByWord(2),    
    /**@ Mixed effect. */
    msoAnimTextUnitEffectMixed(-1);

    private final long value;

    MsoAnimTextUnitEffect(long value) {
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
