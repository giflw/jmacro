package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdoutlinelevel">https://docs.microsoft.com/en-us/office/vba/api/word.wdoutlinelevel</a>}
*/
public enum WdOutlineLevel implements COMEnum {
    
    /**@ Outline level 1. */
    wdOutlineLevel1(1),    
    /**@ Outline level 2. */
    wdOutlineLevel2(2),    
    /**@ Outline level 3. */
    wdOutlineLevel3(3),    
    /**@ Outline level 4. */
    wdOutlineLevel4(4),    
    /**@ Outline level 5. */
    wdOutlineLevel5(5),    
    /**@ Outline level 6. */
    wdOutlineLevel6(6),    
    /**@ Outline level 7. */
    wdOutlineLevel7(7),    
    /**@ Outline level 8. */
    wdOutlineLevel8(8),    
    /**@ Outline level 9. */
    wdOutlineLevel9(9),    
    /**@ No outline level. */
    wdOutlineLevelBodyText(10);

    private final long value;

    WdOutlineLevel(long value) {
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
