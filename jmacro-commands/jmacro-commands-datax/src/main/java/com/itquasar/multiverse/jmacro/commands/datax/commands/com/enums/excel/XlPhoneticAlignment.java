package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlphoneticalignment">https://docs.microsoft.com/en-us/office/vba/api/excel.xlphoneticalignment</a>}
*/
public enum XlPhoneticAlignment implements COMEnum {
    
    /**@ Centered */
    xlPhoneticAlignCenter(2),    
    /**@ Distributed */
    xlPhoneticAlignDistributed(3),    
    /**@ Left aligned */
    xlPhoneticAlignLeft(1),    
    /**@ Excel controls alignment */
    xlPhoneticAlignNoControl(0);

    private final long value;

    XlPhoneticAlignment(long value) {
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
