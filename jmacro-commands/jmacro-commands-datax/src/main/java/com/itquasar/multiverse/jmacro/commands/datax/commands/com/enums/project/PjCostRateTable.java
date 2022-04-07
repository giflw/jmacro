package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjcostratetable">https://docs.microsoft.com/en-us/office/vba/api/project.pjcostratetable</a>}
*/
public enum PjCostRateTable implements COMEnum {
    
    /**@ Cost rate table A. */
    pjCostRateTableA(0),    
    /**@ Cost rate table B. */
    pjCostRateTableB(1),    
    /**@ Cost rate table C. */
    pjCostRateTableC(2),    
    /**@ Cost rate table D. */
    pjCostRateTableD(3),    
    /**@ Cost rate table E. */
    pjCostRateTableE(4);

    private final long value;

    PjCostRateTable(long value) {
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
