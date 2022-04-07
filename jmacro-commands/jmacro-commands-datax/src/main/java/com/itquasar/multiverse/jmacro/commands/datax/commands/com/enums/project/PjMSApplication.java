package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjmsapplication">https://docs.microsoft.com/en-us/office/vba/api/project.pjmsapplication</a>}
*/
public enum PjMSApplication implements COMEnum {
    
    /**@ Microsoft Access. */
    pjMicrosoftAccess(3),    
    /**@ Microsoft Excel. */
    pjMicrosoftExcel(5),    
    /**@ Microsoft FoxPro. */
    pjMicrosoftFoxPro(4),    
    /**@ Microsoft Mail. */
    pjMicrosoftMail(2),    
    /**@ Microsoft PowerPoint. */
    pjMicrosoftPowerPoint(1),    
    /**@ Microsoft Publisher. */
    pjMicrosoftPublisher(7),    
    /**@ Microsoft Schedule+. */
    pjMicrosoftSchedulePlus(6),    
    /**@ Microsoft Word. */
    pjMicrosoftWord(0);

    private final long value;

    PjMSApplication(long value) {
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
