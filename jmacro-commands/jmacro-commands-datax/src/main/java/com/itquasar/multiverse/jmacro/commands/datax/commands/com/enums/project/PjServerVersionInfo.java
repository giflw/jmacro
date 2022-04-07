package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjserverversioninfo">https://docs.microsoft.com/en-us/office/vba/api/project.pjserverversioninfo</a>}
*/
public enum PjServerVersionInfo implements COMEnum {
    
    /**@ The Project Server version is unknown. */
    pjServerVersionInfo_Unknown(-2),    
    /**@ Format error information. */
    pjServerVersionInfo_Error(-1),    
    /**@ Format email information. */
    pjServerVersionInfo_Email(0),    
    /**@ Format information from Microsoft Project Central (Project Server 2000) */
    pjServerVersionInfo_P9(900),    
    /**@ Format information from Project Server 2002 */
    pjServerVersionInfo_P10(1000),    
    /**@ Format information from Project Server 2003 */
    pjServerVersionInfo_P11(1100),    
    /**@ Format information from Office Project 2007. */
    pjServerVersionInfo_P12(1200),    
    /**@ Format information from Project. */
    pjServerVersionInfo_P14(1400);

    private final long value;

    PjServerVersionInfo(long value) {
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
