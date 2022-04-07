package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olautopreview">https://docs.microsoft.com/en-us/office/vba/api/outlook.olautopreview</a>}
*/
public enum OlAutoPreview implements COMEnum {
    
    /**@ All items are automatically previewed. */
    olAutoPreviewAll(0),    
    /**@ No items are automatically previewed. */
    olAutoPreviewNone(2),    
    /**@ Only unread items are automatically previewed. */
    olAutoPreviewUnread(1);

    private final long value;

    OlAutoPreview(long value) {
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
