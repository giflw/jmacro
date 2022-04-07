package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdverticalalignment">https://docs.microsoft.com/en-us/office/vba/api/word.wdverticalalignment</a>}
*/
public enum WdVerticalAlignment implements COMEnum {
    
    /**@ Bottom vertical alignment. */
    wdAlignVerticalBottom(3),    
    /**@ Center vertical alignment. */
    wdAlignVerticalCenter(1),    
    /**@ Justified vertical alignment. */
    wdAlignVerticalJustify(2),    
    /**@ Top vertical alignment. */
    wdAlignVerticalTop(0);

    private final long value;

    WdVerticalAlignment(long value) {
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
