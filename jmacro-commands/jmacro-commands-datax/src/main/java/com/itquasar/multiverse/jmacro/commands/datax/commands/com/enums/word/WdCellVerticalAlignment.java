package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdcellverticalalignment">https://docs.microsoft.com/en-us/office/vba/api/word.wdcellverticalalignment</a>}
*/
public enum WdCellVerticalAlignment implements COMEnum {
    
    /**@ Text is aligned to the bottom border of the cell. */
    wdCellAlignVerticalBottom(3),    
    /**@ Text is aligned to the center of the cell. */
    wdCellAlignVerticalCenter(1),    
    /**@ Text is aligned to the top border of the cell. */
    wdCellAlignVerticalTop(0);

    private final long value;

    WdCellVerticalAlignment(long value) {
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
