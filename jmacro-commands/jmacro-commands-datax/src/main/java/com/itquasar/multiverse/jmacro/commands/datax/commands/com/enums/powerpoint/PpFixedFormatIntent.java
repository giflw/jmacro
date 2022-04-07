package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppfixedformatintent">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppfixedformatintent</a>}
*/
public enum PpFixedFormatIntent implements COMEnum {
    
    /**@ Intent is to print exported file. */
    ppFixedFormatIntentPrint(2),    
    /**@ Intent is to view exported file on screen. */
    ppFixedFormatIntentScreen(1);

    private final long value;

    PpFixedFormatIntent(long value) {
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
