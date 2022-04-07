package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdeditiontype">https://docs.microsoft.com/en-us/office/vba/api/word.wdeditiontype</a>}
*/
public enum WdEditionType implements COMEnum {
    
    /**@ Not supported. */
    wdPublisher(0),    
    /**@ Not supported. */
    wdSubscriber(1);

    private final long value;

    WdEditionType(long value) {
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
