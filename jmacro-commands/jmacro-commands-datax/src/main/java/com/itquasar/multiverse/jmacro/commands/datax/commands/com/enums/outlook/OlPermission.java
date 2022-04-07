package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olpermission">https://docs.microsoft.com/en-us/office/vba/api/outlook.olpermission</a>}
*/
public enum OlPermission implements COMEnum {
    
    /**@ Item cannot be forwarded. */
    olDoNotForward(1),    
    /**@ Outlook will use an Information Rights Management (IRM) template to determine the access and usage permissions for the item. See MailItem.PermissionService and SharingItem.PermissionService properties. */
    olPermissionTemplate(2),    
    /**@ Item has no permission restrictions. */
    olUnrestricted(0);

    private final long value;

    OlPermission(long value) {
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
