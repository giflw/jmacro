package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.oladdresslisttype">https://docs.microsoft.com/en-us/office/vba/api/outlook.oladdresslisttype</a>}
*/
public enum OlAddressListType implements COMEnum {
    
    /**@ A custom address book provider. */
    olCustomAddressList(4),    
    /**@ A container for address lists on an Exchange server. */
    olExchangeContainer(1),    
    /**@ An Exchange Global Address List. */
    olExchangeGlobalAddressList(0),    
    /**@ An address list that corresponds to the Outlook Contacts Address Book. */
    olOutlookAddressList(2),    
    /**@ An address list that uses the Lightweight Directory Access Protocol (LDAP). */
    olOutlookLdapAddressList(3);

    private final long value;

    OlAddressListType(long value) {
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
