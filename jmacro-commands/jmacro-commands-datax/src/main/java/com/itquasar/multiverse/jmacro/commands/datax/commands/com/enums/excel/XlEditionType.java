package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xleditiontype">https://docs.microsoft.com/en-us/office/vba/api/excel.xleditiontype</a>}
*/
public enum XlEditionType implements COMEnum {
    
    /**@ Publisher */
    xlPublisher(1),    
    /**@ Subscriber */
    xlSubscriber(2);

    private final long value;

    XlEditionType(long value) {
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
