package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olcontactphonenumber">https://docs.microsoft.com/en-us/office/vba/api/outlook.olcontactphonenumber</a>}
*/
public enum OlContactPhoneNumber implements COMEnum {
    
    /**@ Telephone number of the person who is the assistant for the contact */
    olContactPhoneAssistant(0),    
    /**@ Business telephone number */
    olContactPhoneBusiness(1),    
    /**@ Second business telephone number */
    olContactPhoneBusiness2(2),    
    /**@ Business fax number */
    olContactPhoneBusinessFax(3),    
    /**@ Callback telephone number */
    olContactPhoneCallback(4),    
    /**@ Car telephone number */
    olContactPhoneCar(5),    
    /**@ Main company telephone number */
    olContactPhoneCompany(6),    
    /**@ Home telephone number */
    olContactPhoneHome(7),    
    /**@ Second home telephone number */
    olContactPhoneHome2(8),    
    /**@ Home fax number */
    olContactPhoneHomeFax(9),    
    /**@ Integrated Services Digital Network (ISDN) phone number */
    olContactPhoneISDN(10),    
    /**@ Mobile telephone number */
    olContactPhoneMobile(11),    
    /**@ Other telephone number */
    olContactPhoneOther(12),    
    /**@ Other fax number */
    olContactPhoneOtherFax(13),    
    /**@ Pager telephone number */
    olContactPhonePager(14),    
    /**@ Primary telephone number */
    olContactPhonePrimary(15),    
    /**@ Radio telephone number */
    olContactPhoneRadio(16),    
    /**@ Telex telephone number */
    olContactPhoneTelex(17),    
    /**@ TTD/TTY (Teletypewriting Device for the Deaf/Teletypewriter) telephone number */
    olContactPhoneTTYTTD(18);

    private final long value;

    OlContactPhoneNumber(long value) {
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
