package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlptselectionmode">https://docs.microsoft.com/en-us/office/vba/api/excel.xlptselectionmode</a>}
*/
public enum XlPTSelectionMode implements COMEnum {
    
    /**@ Blanks */
    xlBlanks(4),    
    /**@ Buttons */
    xlButton(15),    
    /**@ Data and labels */
    xlDataAndLabel(0),    
    /**@ Data */
    xlDataOnly(2),    
    /**@ First row */
    xlFirstRow(256),    
    /**@ Label */
    xlLabelOnly(1),    
    /**@ Origin */
    xlOrigin(3);

    private final long value;

    XlPTSelectionMode(long value) {
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
