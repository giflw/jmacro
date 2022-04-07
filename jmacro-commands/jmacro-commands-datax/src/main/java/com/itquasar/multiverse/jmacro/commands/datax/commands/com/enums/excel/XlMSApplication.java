package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlmsapplication">https://docs.microsoft.com/en-us/office/vba/api/excel.xlmsapplication</a>}
*/
public enum XlMSApplication implements COMEnum {
    
    /**@ Microsoft Office Access */
    xlMicrosoftAccess(4),    
    /**@ Microsoft FoxPro */
    xlMicrosoftFoxPro(5),    
    /**@ Microsoft Office Outlook */
    xlMicrosoftMail(3),    
    /**@ Microsoft Office PowerPoint */
    xlMicrosoftPowerPoint(2),    
    /**@ Microsoft Office Project */
    xlMicrosoftProject(6),    
    /**@ Microsoft Schedule Plus */
    xlMicrosoftSchedulePlus(7),    
    /**@ Microsoft Office Word */
    xlMicrosoftWord(1);

    private final long value;

    XlMSApplication(long value) {
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
