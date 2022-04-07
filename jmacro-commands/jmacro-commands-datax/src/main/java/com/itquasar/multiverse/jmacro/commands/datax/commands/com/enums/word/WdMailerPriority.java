package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdmailerpriority">https://docs.microsoft.com/en-us/office/vba/api/word.wdmailerpriority</a>}
*/
public enum WdMailerPriority implements COMEnum {
    
    /**@ Not supported. */
    wdPriorityHigh(3),    
    /**@ Not supported. */
    wdPriorityLow(2),    
    /**@ Not supported. */
    wdPriorityNormal(1);

    private final long value;

    WdMailerPriority(long value) {
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
