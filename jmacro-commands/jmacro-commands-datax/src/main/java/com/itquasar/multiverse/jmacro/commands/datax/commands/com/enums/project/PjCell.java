package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjcell">https://docs.microsoft.com/en-us/office/vba/api/project.pjcell</a>}
*/
public enum PjCell implements COMEnum {
    
    /**@ Column 1, row 1. */
    pjCell1_1(0),    
    /**@ Column 1, row 2. */
    pjCell1_2(4),    
    /**@ Column 1, row 3. */
    pjCell1_3(8),    
    /**@ Column 1, row 4. */
    pjCell1_4(12),    
    /**@ Column 2, row 1. */
    pjCell2_1(1),    
    /**@ Column 2, row 2. */
    pjCell2_2(5),    
    /**@ Column 2, row 3. */
    pjCell2_3(9),    
    /**@ Column 2, row 4. */
    pjCell2_4(13),    
    /**@ Column 3, row 1. */
    pjCell3_1(2),    
    /**@ Column 3, row 2. */
    pjCell3_2(6),    
    /**@ Column 3, row 3. */
    pjCell3_3(10),    
    /**@ Column 3, row 4. */
    pjCell3_4(14),    
    /**@ Column 4, row 1. */
    pjCell4_1(3),    
    /**@ Column 4, row 2. */
    pjCell4_2(7),    
    /**@ Column 4, row 3. */
    pjCell4_3(11),    
    /**@ Column 4, row 4. */
    pjCell4_4(15);

    private final long value;

    PjCell(long value) {
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
