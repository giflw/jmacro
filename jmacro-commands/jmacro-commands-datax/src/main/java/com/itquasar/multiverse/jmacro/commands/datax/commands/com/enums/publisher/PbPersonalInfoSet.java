package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbpersonalinfoset">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbpersonalinfoset</a>}
*/
public enum PbPersonalInfoSet implements COMEnum {
    
    /**@ Home */
    pbPersonalInfoHome(4),    
    /**@ Other organization */
    pbPersonalInfoOtherOrganization(3),    
    /**@ Primary business */
    pbPersonalInfoPrimaryBusiness(1),    
    /**@ Secondary business */
    pbPersonalInfoSecondaryBusiness(2);

    private final long value;

    PbPersonalInfoSet(long value) {
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
