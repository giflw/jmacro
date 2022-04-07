package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.vislinkreplacebehavior">https://docs.microsoft.com/en-us/office/vba/api/visio.vislinkreplacebehavior</a>}
*/
public enum VisLinkReplaceBehavior implements COMEnum {
    
    /**@ Always replace links when linking to a shape that has existing links. */
    visLinkReplaceAlways(1),    
    /**@ Never replace links when linking to a shape that has existing links. */
    visLinkReplaceNever(0),    
    /**@ Prompt the user before replacing links when the user attempts to create links in the Microsoft Office Visio user interface. */
    visLinkReplacePrompt(2);

    private final long value;

    VisLinkReplaceBehavior(long value) {
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
