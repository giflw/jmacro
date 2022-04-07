package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdmailsystem">https://docs.microsoft.com/en-us/office/vba/api/word.wdmailsystem</a>}
*/
public enum WdMailSystem implements COMEnum {
    
    /**@ Standard Messaging Application Programming Interface (MAPI) mail system. */
    wdMAPI(1),    
    /**@ Both a standard Messaging Application Programming Interface (MAPI) mail system and a PowerTalk mail system. */
    wdMAPIandPowerTalk(3),    
    /**@ No mail system. */
    wdNoMailSystem(0),    
    /**@ PowerTalk mail system. */
    wdPowerTalk(2);

    private final long value;

    WdMailSystem(long value) {
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
