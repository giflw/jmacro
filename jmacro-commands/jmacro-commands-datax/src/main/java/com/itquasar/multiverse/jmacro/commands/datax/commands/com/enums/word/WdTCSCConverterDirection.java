package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdtcscconverterdirection">https://docs.microsoft.com/en-us/office/vba/api/word.wdtcscconverterdirection</a>}
*/
public enum WdTCSCConverterDirection implements COMEnum {
    
    /**@ Convert in the appropriate direction based on the detected language of the specified range. */
    wdTCSCConverterDirectionAuto(2),    
    /**@ Convert from Simplified Chinese to Traditional Chinese. */
    wdTCSCConverterDirectionSCTC(0),    
    /**@ Convert from Traditional Chinese to Simplified Chinese. */
    wdTCSCConverterDirectionTCSC(1);

    private final long value;

    WdTCSCConverterDirection(long value) {
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
