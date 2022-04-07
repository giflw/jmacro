package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdmappeddatafields">https://docs.microsoft.com/en-us/office/vba/api/word.wdmappeddatafields</a>}
*/
public enum WdMappedDataFields implements COMEnum {
    
    /**@ Address 1 field. */
    wdAddress1(10),    
    /**@ Address 2 field. */
    wdAddress2(11),    
    /**@ Address 3 field. */
    wdAddress3(29),    
    /**@ Business fax field. */
    wdBusinessFax(17),    
    /**@ Business phone field. */
    wdBusinessPhone(16),    
    /**@ City field. */
    wdCity(12),    
    /**@ Company field. */
    wdCompany(9),    
    /**@ Country/region field. */
    wdCountryRegion(15),    
    /**@ Courtesy title field. */
    wdCourtesyTitle(2),    
    /**@ Department field. */
    wdDepartment(30),    
    /**@ Email address field. */
    wdEmailAddress(20),    
    /**@ First name field. */
    wdFirstName(3),    
    /**@ Home fax field. */
    wdHomeFax(19),    
    /**@ Home phone field. */
    wdHomePhone(18),    
    /**@ Job title field. */
    wdJobTitle(8),    
    /**@ Last name field. */
    wdLastName(5),    
    /**@ Middle name field. */
    wdMiddleName(4),    
    /**@ Nickname field. */
    wdNickname(7),    
    /**@ Postal code field. */
    wdPostalCode(14),    
    /**@ Ruby first name field. */
    wdRubyFirstName(27),    
    /**@ Ruby last name field. */
    wdRubyLastName(28),    
    /**@ Spouse/partner courtesy title field. */
    wdSpouseCourtesyTitle(22),    
    /**@ Spouse/partner first name field. */
    wdSpouseFirstName(23),    
    /**@ Spouse/partner last name field. */
    wdSpouseLastName(25),    
    /**@ Spouse/partner middle name field. */
    wdSpouseMiddleName(24),    
    /**@ Spouse/partner nickname field. */
    wdSpouseNickname(26),    
    /**@ State field. */
    wdState(13),    
    /**@ Suffix field. */
    wdSuffix(6),    
    /**@ Unique identifier field. */
    wdUniqueIdentifier(1),    
    /**@ Web page uniform resource locator (URL) field. */
    wdWebPageURL(21);

    private final long value;

    WdMappedDataFields(long value) {
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
