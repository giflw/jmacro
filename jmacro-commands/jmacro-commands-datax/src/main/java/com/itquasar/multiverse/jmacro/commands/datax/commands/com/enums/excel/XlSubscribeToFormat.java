package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlsubscribetoformat">https://docs.microsoft.com/en-us/office/vba/api/excel.xlsubscribetoformat</a>}
*/
public enum XlSubscribeToFormat implements COMEnum {
    
    /**@ Picture */
    xlSubscribeToPicture(-4147),    
    /**@ Text */
    xlSubscribeToText(-4158);

    private final long value;

    XlSubscribeToFormat(long value) {
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
