package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdtextformfieldtype">https://docs.microsoft.com/en-us/office/vba/api/word.wdtextformfieldtype</a>}
*/
public enum WdTextFormFieldType implements COMEnum {
    
    /**@ Calculation text field. */
    wdCalculationText(5),    
    /**@ Current date text field. */
    wdCurrentDateText(3),    
    /**@ Current time text field. */
    wdCurrentTimeText(4),    
    /**@ Date text field. */
    wdDateText(2),    
    /**@ Number text field. */
    wdNumberText(1),    
    /**@ Regular text field. */
    wdRegularText(0);

    private final long value;

    WdTextFormFieldType(long value) {
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
