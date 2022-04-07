package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbwizardnavbaralignment">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbwizardnavbaralignment</a>}
*/
public enum PbWizardNavBarAlignment implements COMEnum {
    
    /**@ Center-aligned */
    pbnbAlignCenter(2),    
    /**@ Left-aligned */
    pbnbAlignLeft(1),    
    /**@ Right-aligned */
    pbnbAlignRight(3);

    private final long value;

    PbWizardNavBarAlignment(long value) {
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
