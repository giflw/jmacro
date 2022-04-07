package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.pptextleveleffect">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.pptextleveleffect</a>}
*/
public enum PpTextLevelEffect implements COMEnum {
    
    /**@ By all levels */
    ppAnimateByAllLevels(16),    
    /**@ By fifth level */
    ppAnimateByFifthLevel(5),    
    /**@ By first level */
    ppAnimateByFirstLevel(1),    
    /**@ By fourth level */
    ppAnimateByFourthLevel(4),    
    /**@ By second level */
    ppAnimateBySecondLevel(2),    
    /**@ By third level */
    ppAnimateByThirdLevel(3),    
    /**@ Mixed level */
    ppAnimateLevelMixed(-2),    
    /**@ No level */
    ppAnimateLevelNone(0);

    private final long value;

    PpTextLevelEffect(long value) {
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
