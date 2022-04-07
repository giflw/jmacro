package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdeditionoption">https://docs.microsoft.com/en-us/office/vba/api/word.wdeditionoption</a>}
*/
public enum WdEditionOption implements COMEnum {
    
    /**@ Not supported. */
    wdAutomaticUpdate(3),    
    /**@ Not supported. */
    wdCancelPublisher(0),    
    /**@ Not supported. */
    wdChangeAttributes(5),    
    /**@ Not supported. */
    wdManualUpdate(4),    
    /**@ Not supported. */
    wdOpenSource(7),    
    /**@ Not supported. */
    wdSelectPublisher(2),    
    /**@ Not supported. */
    wdSendPublisher(1),    
    /**@ Not supported. */
    wdUpdateSubscriber(6);

    private final long value;

    WdEditionOption(long value) {
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
