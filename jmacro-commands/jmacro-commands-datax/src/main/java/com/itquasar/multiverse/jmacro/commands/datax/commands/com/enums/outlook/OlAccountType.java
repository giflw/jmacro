package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olaccounttype">https://docs.microsoft.com/en-us/office/vba/api/outlook.olaccounttype</a>}
*/
public enum OlAccountType implements COMEnum {
    
    /**@ An account that uses Exchange ActiveSync (EAS) on mobile devices. */
    olEas(4),    
    /**@ An Exchange account. */
    olExchange(0),    
    /**@ An HTTP account. */
    olHttp(3),    
    /**@ An IMAP account. */
    olImap(1),    
    /**@ Other or unknown account. */
    olOtherAccount(5),    
    /**@ A POP3 account. */
    olPop3(2);

    private final long value;

    OlAccountType(long value) {
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
