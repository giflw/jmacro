package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbreplacetint">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbreplacetint</a>}
*/
public enum PbReplaceTint implements COMEnum {
    
    /**@ Maintain the same tint percentage in the ink represented by the replacement plate as in the deleted plate. For example, replace a 100% tint of yellow with a 100% tint of blue. */
    pbReplaceTintKeepTints(1),    
    /**@ Maintain the same lightness value in the ink represented by the replacement plate as in the deleted plate. For example, replace a 100% tint of yellow with an approximately 10% tint of blue. */
    pbReplaceTintMaintainLuminosity(2),    
    /**@ Default. */
    pbReplaceTintUseDefault(0);

    private final long value;

    PbReplaceTint(long value) {
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
