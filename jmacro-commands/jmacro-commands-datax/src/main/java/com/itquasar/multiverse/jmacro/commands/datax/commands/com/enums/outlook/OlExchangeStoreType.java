package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olexchangestoretype">https://docs.microsoft.com/en-us/office/vba/api/outlook.olexchangestoretype</a>}
*/
public enum OlExchangeStoreType implements COMEnum {
    
    /**@ Specifies an Exchange delegate mailbox store. */
    olExchangeMailbox(1),    
    /**@ Specifies an Exchange Public Folder store. */
    olExchangePublicFolder(2),    
    /**@ Specifies that the store is not an Exchange store. */
    olNotExchange(3),    
    /**@ Specifies a primary Exchange mailbox store. */
    olPrimaryExchangeMailbox(0),    
    /**@ Specifies an additional Exchange mailbox store. */
    olAdditionalExchangeMailbox(4);

    private final long value;

    OlExchangeStoreType(long value) {
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
