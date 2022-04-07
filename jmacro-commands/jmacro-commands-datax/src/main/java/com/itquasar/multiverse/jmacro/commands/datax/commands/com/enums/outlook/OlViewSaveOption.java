package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olviewsaveoption">https://docs.microsoft.com/en-us/office/vba/api/outlook.olviewsaveoption</a>}
*/
public enum OlViewSaveOption implements COMEnum {
    
    /**@ Indicates that the view is available in all folders of the same type. */
    olViewSaveOptionAllFoldersOfType(2),    
    /**@ Indicates that the view is only available in the current folder and is available to all users. */
    olViewSaveOptionThisFolderEveryone(0),    
    /**@ Indicates that the view is only available in the current folder and is only available to the current Outlook user. */
    olViewSaveOptionThisFolderOnlyMe(1);

    private final long value;

    OlViewSaveOption(long value) {
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
