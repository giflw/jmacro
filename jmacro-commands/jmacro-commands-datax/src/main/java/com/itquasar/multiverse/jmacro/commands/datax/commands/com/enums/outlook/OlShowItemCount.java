package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olshowitemcount">https://docs.microsoft.com/en-us/office/vba/api/outlook.olshowitemcount</a>}
*/
public enum OlShowItemCount implements COMEnum {
    
    /**@ No item count displayed. */
    olNoItemCount(0),    
    /**@ Shows count of total number of items. */
    olShowTotalItemCount(2),    
    /**@ Shows count of unread items. */
    olShowUnreadItemCount(1);

    private final long value;

    OlShowItemCount(long value) {
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
