package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbwizardnavbarbuttonstyle">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbwizardnavbarbuttonstyle</a>}
*/
public enum PbWizardNavBarButtonStyle implements COMEnum {
    
    /**@ Large buttons */
    pbnbButtonStyleLarge(2),    
    /**@ Small buttons */
    pbnbButtonStyleSmall(1),    
    /**@ Text-only buttons */
    pbnbButtonStyleText(3);

    private final long value;

    PbWizardNavBarButtonStyle(long value) {
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
