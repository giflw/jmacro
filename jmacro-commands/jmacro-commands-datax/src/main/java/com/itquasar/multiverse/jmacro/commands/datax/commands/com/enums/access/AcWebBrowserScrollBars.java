package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acwebbrowserscrollbars">https://docs.microsoft.com/en-us/office/vba/api/access.acwebbrowserscrollbars</a>}
*/
public enum AcWebBrowserScrollBars implements COMEnum {
    
    /**@ Scroll bars are displayed if the current page in the control is too large to be displayed in its entirely. */
    acScrollAuto(0),    
    /**@ Scroll bars are not displayed. */
    acScrollNo(2),    
    /**@ Scroll bars are displayed. */
    acScrollYes(1);

    private final long value;

    AcWebBrowserScrollBars(long value) {
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
