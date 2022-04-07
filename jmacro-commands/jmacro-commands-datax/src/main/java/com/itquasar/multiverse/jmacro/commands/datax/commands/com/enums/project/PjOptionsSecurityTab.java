package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjoptionssecuritytab">https://docs.microsoft.com/en-us/office/vba/api/project.pjoptionssecuritytab</a>}
*/
public enum PjOptionsSecurityTab implements COMEnum {
    
    /**@ Represents the Add-ins tab, for add-in security options. */
    pjOptionsSecurityTabAddins(1),    
    /**@ Represents the Legacy Formats tab, for options on opening or saving legacy file formats. */
    pjOptionsSecurityTabLegacy(4),    
    /**@ Represents the Macro Settings tab, for macro security settings. */
    pjOptionsSecurityTabMacro(2),    
    /**@ Represents the Privacy Options tab, which includes settings for Help content, removing personal information from file properties, and other security options. */
    pjOptionsSecurityTabPrivacy(3),    
    /**@ Represents the Trusted Publishers tab, which contains a list of trusted publisher tokens. */
    pjOptionsSecurityTabPublishers(0);

    private final long value;

    PjOptionsSecurityTab(long value) {
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
