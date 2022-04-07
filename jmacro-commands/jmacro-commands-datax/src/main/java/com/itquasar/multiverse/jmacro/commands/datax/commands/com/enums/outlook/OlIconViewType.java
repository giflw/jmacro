package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.oliconviewtype">https://docs.microsoft.com/en-us/office/vba/api/outlook.oliconviewtype</a>}
*/
public enum OlIconViewType implements COMEnum {
    
    /**@ Displays Outlook items as large icons, with the description for the Outlook item below the icon. */
    olIconViewLarge(0),    
    /**@ Displays Outlook items as a list of small icons, with the description for the Outlook item next to the icon. */
    olIconViewList(2),    
    /**@ Displays Outlook items as a collection of small icons, with the description for the Outlook item next to the icon. */
    olIconViewSmall(1);

    private final long value;

    OlIconViewType(long value) {
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
