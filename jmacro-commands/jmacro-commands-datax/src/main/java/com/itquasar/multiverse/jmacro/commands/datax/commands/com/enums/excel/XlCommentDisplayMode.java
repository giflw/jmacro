package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlcommentdisplaymode">https://docs.microsoft.com/en-us/office/vba/api/excel.xlcommentdisplaymode</a>}
*/
public enum XlCommentDisplayMode implements COMEnum {
    
    /**@ Display comment and indicator at all times. */
    xlCommentAndIndicator(1),    
    /**@ Display comment indicator only. Display comment when mouse pointer is moved over cell. */
    xlCommentIndicatorOnly(-1),    
    /**@ Display neither the comment nor the comment indicator at any time. */
    xlNoIndicator(0);

    private final long value;

    XlCommentDisplayMode(long value) {
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
