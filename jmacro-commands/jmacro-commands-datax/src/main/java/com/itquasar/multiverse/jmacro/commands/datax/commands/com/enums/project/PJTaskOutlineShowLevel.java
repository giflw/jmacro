package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjtaskoutlineshowlevel">https://docs.microsoft.com/en-us/office/vba/api/project.pjtaskoutlineshowlevel</a>}
*/
public enum PJTaskOutlineShowLevel implements COMEnum {
    
    /**@ Display level 1. */
    pjTaskOutlineShowLevel1(1),    
    /**@ Display levels 1 and 2. */
    pjTaskOutlineShowLevel2(2),    
    /**@ Display levels 1 through 3. */
    pjTaskOutlineShowLevel3(3),    
    /**@ Display levels 1 through 4. */
    pjTaskOutlineShowLevel4(4),    
    /**@ Display levels 1 through 5. */
    pjTaskOutlineShowLevel5(5),    
    /**@ Display levels 1 through 6. */
    pjTaskOutlineShowLevel6(6),    
    /**@ Display levels 1 through 7. */
    pjTaskOutlineShowLevel7(7),    
    /**@ Display levels 1 through 8. */
    pjTaskOutlineShowLevel8(8),    
    /**@ Display levels 1 through 9. */
    pjTaskOutlineShowLevel9(9),    
    /**@ Display all levels. */
    pjTaskOutlineShowLevelMax(65535);

    private final long value;

    PJTaskOutlineShowLevel(long value) {
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
