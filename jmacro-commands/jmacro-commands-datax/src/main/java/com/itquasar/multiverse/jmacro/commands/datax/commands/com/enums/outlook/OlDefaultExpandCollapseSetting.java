package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.oldefaultexpandcollapsesetting">https://docs.microsoft.com/en-us/office/vba/api/outlook.oldefaultexpandcollapsesetting</a>}
*/
public enum OlDefaultExpandCollapseSetting implements COMEnum {
    
    /**@ All groups are collapsed when the view is initially displayed. */
    olAllCollapsed(1),    
    /**@ All groups are expanded when the view is initially displayed. */
    olAllExpanded(0),    
    /**@ Groups are displayed expanded or collapsed depending on the state the groups were in when the view was last closed. */
    olLastViewed(2);

    private final long value;

    OlDefaultExpandCollapseSetting(long value) {
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
