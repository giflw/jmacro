package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbrulerguidetype">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbrulerguidetype</a>}
*/
public enum PbRulerGuideType implements COMEnum {
    
    /**@ Horizontal ruler */
    pbRulerGuideTypeHorizontal(2),    
    /**@ Vertical ruler */
    pbRulerGuideTypeVertical(1);

    private final long value;

    PbRulerGuideType(long value) {
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
