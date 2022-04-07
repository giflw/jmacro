package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdconditioncode">https://docs.microsoft.com/en-us/office/vba/api/word.wdconditioncode</a>}
*/
public enum WdConditionCode implements COMEnum {
    
    /**@ Applies formatting to even-numbered columns. */
    wdEvenColumnBanding(7),    
    /**@ Applies formatting to even-numbered rows. */
    wdEvenRowBanding(3),    
    /**@ Applies formatting to the first column in a table. */
    wdFirstColumn(4),    
    /**@ Applies formatting to the first row in a table. */
    wdFirstRow(0),    
    /**@ Applies formatting to the last column in a table. */
    wdLastColumn(5),    
    /**@ Applies formatting to the last row in a table. */
    wdLastRow(1),    
    /**@ Applies formatting to the last cell in the first row. */
    wdNECell(8),    
    /**@ Applies formatting to the first cell in the first row. */
    wdNWCell(9),    
    /**@ Applies formatting to odd-numbered columns. */
    wdOddColumnBanding(6),    
    /**@ Applies formatting to odd-numbered rows. */
    wdOddRowBanding(2),    
    /**@ Applies formatting to the last cell in the table. */
    wdSECell(10),    
    /**@ Applies formatting to first cell in the last row of the table. */
    wdSWCell(11);

    private final long value;

    WdConditionCode(long value) {
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
