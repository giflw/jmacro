package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olgrouptype">https://docs.microsoft.com/en-us/office/vba/api/outlook.olgrouptype</a>}
*/
public enum OlGroupType implements COMEnum {
    
    /**@ Identifies a user-defined navigation group, added using either the Outlook user interface or an add-in. */
    olCustomFoldersGroup(0),    
    /**@ Identifies the Favorite Folders navigation group. This navigation group exists only within the NavigationGroups collection of a MailModule object and cannot be created in or accessed from other modules. */
    olFavoriteFoldersGroup(4),    
    /**@ Identifies a navigation group that, by default, contains any folders that are part of the local store. */
    olMyFoldersGroup(1),    
    /**@ Identifies a navigation group that, by default, contains shared folders from sources other than that of other persons. */
    olOtherFoldersGroup(3),    
    /**@ Identifies a navigation group that, by default, contains shared folders from other persons. */
    olPeopleFoldersGroup(2),    
    /**@ Identifies a navigation group that is, by default, read-only and no folders can be added or removed from that navigation group. This does not imply the folders themselves are read-only, and write access to the folders depends on how the folders are set up. */
    olReadOnlyGroup(6),    
    /**@ Identifies the Rooms navigation group in the Calendar navigation module. */
    olRoomsGroup(5);

    private final long value;

    OlGroupType(long value) {
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
