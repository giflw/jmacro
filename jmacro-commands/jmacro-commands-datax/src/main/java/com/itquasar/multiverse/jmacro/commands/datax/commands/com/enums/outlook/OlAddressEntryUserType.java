package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.oladdressentryusertype">https://docs.microsoft.com/en-us/office/vba/api/outlook.oladdressentryusertype</a>}
*/
public enum OlAddressEntryUserType implements COMEnum {
    
    /**@ An address entry that is an Exchange agent. */
    olExchangeAgentAddressEntry(3),    
    /**@ An address entry that is an Exchange distribution list. */
    olExchangeDistributionListAddressEntry(1),    
    /**@ An address entry that is an Exchange organization. */
    olExchangeOrganizationAddressEntry(4),    
    /**@ An address entry that is an Exchange public folder. */
    olExchangePublicFolderAddressEntry(2),    
    /**@ An Exchange user that belongs to a different Exchange forest. */
    olExchangeRemoteUserAddressEntry(5),    
    /**@ An Exchange user that belongs to the same Exchange forest. */
    olExchangeUserAddressEntry(0),    
    /**@ An address entry that uses the Lightweight Directory Access Protocol (LDAP). */
    olLdapAddressEntry(20),    
    /**@ A custom or some other type of address entry such as FAX. */
    olOtherAddressEntry(40),    
    /**@ An address entry in an Outlook Contacts folder. */
    olOutlookContactAddressEntry(10),    
    /**@ An address entry that is an Outlook distribution list. */
    olOutlookDistributionListAddressEntry(11),    
    /**@ An address entry that uses the Simple Mail Transfer Protocol (SMTP). */
    olSmtpAddressEntry(30);

    private final long value;

    OlAddressEntryUserType(long value) {
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
