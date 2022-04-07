package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.vispagesizingbehaviors">https://docs.microsoft.com/en-us/office/vba/api/visio.vispagesizingbehaviors</a>}
*/
public enum VisPageSizingBehaviors implements COMEnum {
    
    /**@ Do not automatically resize pages under any circumstances. */
    visNeverResizePages(0),    
    /**@ Automatically resize all pages when the Microsoft Visio Drawing Control is resized or when a new document is loaded into it. Leave shapes unchanged. */
    visResizePages(1);

    private final long value;

    VisPageSizingBehaviors(long value) {
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
