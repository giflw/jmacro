package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olfolderdisplaymode">https://docs.microsoft.com/en-us/office/vba/api/outlook.olfolderdisplaymode</a>}
*/
public enum OlFolderDisplayMode implements COMEnum {
    
    /**@ Only the contents of the selected folder are displayed. */
    olFolderDisplayFolderOnly(1),    
    /**@ Folder contents are displayed but no navigation pane is shown. */
    olFolderDisplayNoNavigation(2),    
    /**@ Folder is displayed with navigation pane on the left and folder contents on the right. */
    olFolderDisplayNormal(0);

    private final long value;

    OlFolderDisplayMode(long value) {
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
