package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.vispublishpages">https://docs.microsoft.com/en-us/office/vba/api/visio.vispublishpages</a>}
*/
public enum VisPublishPages implements COMEnum {
    
    /**@ Publish all pages. */
    visPublishPageAll(0),    
    /**@ Publish selected pages. */
    visPublishPageSelect(1);

    private final long value;

    VisPublishPages(long value) {
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
