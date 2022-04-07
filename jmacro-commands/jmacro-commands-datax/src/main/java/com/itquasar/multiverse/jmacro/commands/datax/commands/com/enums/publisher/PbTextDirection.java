package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbtextdirection">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbtextdirection</a>}
*/
public enum PbTextDirection implements COMEnum {
    
    /**@ Text flows from left to right. */
    pbTextDirectionLeftToRight(1),    
    /**@ A return value indicating a range containing some left-to-right text and some right-to-left text. */
    pbTextDirectionMixed(-9999999),    
    /**@ Text flows from right to left. */
    pbTextDirectionRightToLeft(2);

    private final long value;

    PbTextDirection(long value) {
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
