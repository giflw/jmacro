package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppparagraphalignment">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppparagraphalignment</a>}
*/
public enum PpParagraphAlignment implements COMEnum {
    
    /**@ Center align */
    ppAlignCenter(2),    
    /**@ Distribute */
    ppAlignDistribute(5),    
    /**@ Justify */
    ppAlignJustify(4),    
    /**@ Low justify */
    ppAlignJustifyLow(7),    
    /**@ Left aligned */
    ppAlignLeft(1),    
    /**@ Mixed alignment */
    ppAlignmentMixed(-2),    
    /**@ Right-aligned */
    ppAlignRight(3),    
    /**@ Thai distributed */
    ppAlignThaiDistribute(6);

    private final long value;

    PpParagraphAlignment(long value) {
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
