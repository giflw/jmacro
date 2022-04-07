package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olformregistry">https://docs.microsoft.com/en-us/office/vba/api/outlook.olformregistry</a>}
*/
public enum OlFormRegistry implements COMEnum {
    
    /**@ The Form is registered in the user's default form registry. */
    olDefaultRegistry(0),    
    /**@ The Form is registered in a form registry specific to a particular folder, and can only be accessed from that folder. */
    olFolderRegistry(3),    
    /**@ The Form is registered in the organizational form registry. The form is available to all users. */
    olOrganizationRegistry(4),    
    /**@ The Form is registered in the user's personal registry and is only accessible to that user. */
    olPersonalRegistry(2);

    private final long value;

    OlFormRegistry(long value) {
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
