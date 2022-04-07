package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olpane">https://docs.microsoft.com/en-us/office/vba/api/outlook.olpane</a>}
*/
public enum OlPane implements COMEnum {
    
    /**@ The folder list pane */
    olFolderList(2),    
    /**@ The navigation pane */
    olNavigationPane(4),    
    /**@ The Outlook bar pane */
    olOutlookBar(1),    
    /**@ The reading pane */
    olPreview(3);

    private final long value;

    OlPane(long value) {
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
