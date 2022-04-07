package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjtextfileorigin">https://docs.microsoft.com/en-us/office/vba/api/project.pjtextfileorigin</a>}
*/
public enum PjTextFileOrigin implements COMEnum {
    
    /**@ DOS character set (including OS/2). */
    pjTextOriginDOS(1),    
    /**@ Macintosh character set. */
    pjTextOriginMac(2),    
    /**@ Unicode character set. */
    pjTextOriginUnicode(3),    
    /**@ Windows character set. */
    pjTextOriginWin(0);

    private final long value;

    PjTextFileOrigin(long value) {
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
