package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbnumberstylestype">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbnumberstylestype</a>}
*/
public enum PbNumberStylesType implements COMEnum {
    
    /**@ Default number style */
    pbNumberStyleDefault(0),    
    /**@ Mixed number styles */
    pbNumberStyleMixed(-1),    
    /**@ Full-height numbers spaced proportionally */
    pbNumberStyleProportionalLining(1),    
    /**@ Numbers that read well with text */
    pbNumberStyleProportionalOldstyle(3),    
    /**@ Full-height numbers spaced equally */
    pbNumberStyleTabularLining(2),    
    /**@ Numbers that read well and are spaced equally */
    pbNumberStyleTabularOldstyle(4);

    private final long value;

    PbNumberStylesType(long value) {
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
