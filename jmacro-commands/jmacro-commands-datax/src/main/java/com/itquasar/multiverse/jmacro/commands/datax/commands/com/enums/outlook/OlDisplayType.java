package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.oldisplaytype">https://docs.microsoft.com/en-us/office/vba/api/outlook.oldisplaytype</a>}
*/
public enum OlDisplayType implements COMEnum {
    
    /**@ Agent address */
    olAgent(3),    
    /**@ Exchange distribution list */
    olDistList(1),    
    /**@ Forum address */
    olForum(2),    
    /**@ Organization address */
    olOrganization(4),    
    /**@ Outlook private distribution list */
    olPrivateDistList(5),    
    /**@ Remote user address */
    olRemoteUser(6),    
    /**@ User address */
    olUser(0);

    private final long value;

    OlDisplayType(long value) {
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
