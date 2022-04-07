package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbinlinealignment">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbinlinealignment</a>}
*/
public enum PbInlineAlignment implements COMEnum {
    
    /**@ Shape is aligned with the text characters. */
    pbInlineAlignmentCharacter(0),    
    /**@ Shape is left-aligned. */
    pbInlineAlignmentLeft(1),    
    /**@ Shape is mixed-aligned. */
    pbInlineAlignmentMixed(-2),    
    /**@ Shape is right-aligned. */
    pbInlineAlignmentRight(2);

    private final long value;

    PbInlineAlignment(long value) {
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
