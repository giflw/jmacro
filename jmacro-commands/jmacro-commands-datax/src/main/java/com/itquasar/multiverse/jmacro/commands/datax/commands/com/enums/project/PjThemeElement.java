package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjthemeelement">https://docs.microsoft.com/en-us/office/vba/api/project.pjthemeelement</a>}
*/
public enum PjThemeElement implements COMEnum {
    
    /**@ Page background. */
    pjThemeElementWPBkgd(32),    
    /**@ Control builder element. */
    pjThemeElementWPCtlBdr(40),    
    /**@ Groupline element. */
    pjThemeElementWPGroupline(47),    
    /**@ Text on the page. */
    pjThemeElementWPText(33),    
    /**@ Inactive title background. */
    pjThemeElementWPTitleBkgdInactive(35);

    private final long value;

    PjThemeElement(long value) {
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
