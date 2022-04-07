package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdmultiplewordconversionsmode">https://docs.microsoft.com/en-us/office/vba/api/word.wdmultiplewordconversionsmode</a>}
*/
public enum WdMultipleWordConversionsMode implements COMEnum {
    
    /**@ Hangul to Hanja. */
    wdHangulToHanja(0),    
    /**@ Hanja to Hangul. */
    wdHanjaToHangul(1);

    private final long value;

    WdMultipleWordConversionsMode(long value) {
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
