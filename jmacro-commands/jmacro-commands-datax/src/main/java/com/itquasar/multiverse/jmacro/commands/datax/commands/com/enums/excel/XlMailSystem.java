package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlmailsystem">https://docs.microsoft.com/en-us/office/vba/api/excel.xlmailsystem</a>}
*/
public enum XlMailSystem implements COMEnum {
    
    /**@ MAPI-complaint system */
    xlMAPI(1),    
    /**@ No mail system */
    xlNoMailSystem(0),    
    /**@ PowerTalk mail system */
    xlPowerTalk(2);

    private final long value;

    XlMailSystem(long value) {
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
