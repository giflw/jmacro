package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olformregionmode">https://docs.microsoft.com/en-us/office/vba/api/outlook.olformregionmode</a>}
*/
public enum OlFormRegionMode implements COMEnum {
    
    /**@ The form region is in a compose page of a message or any unsendable item such as a contact item. */
    olFormRegionCompose(1),    
    /**@ The form region is in the Reading Pane. */
    olFormRegionPreview(2),    
    /**@ The form region is in the read page of a received message or a post note. */
    olFormRegionRead(0);

    private final long value;

    OlFormRegionMode(long value) {
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
