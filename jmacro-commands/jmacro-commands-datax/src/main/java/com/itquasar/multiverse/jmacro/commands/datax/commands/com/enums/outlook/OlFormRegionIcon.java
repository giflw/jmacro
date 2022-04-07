package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olformregionicon">https://docs.microsoft.com/en-us/office/vba/api/outlook.olformregionicon</a>}
*/
public enum OlFormRegionIcon implements COMEnum {
    
    /**@ The default icon for an item. */
    olFormRegionIconDefault(1),    
    /**@ The icon to display when an item has been encrypted. */
    olFormRegionIconEncrypted(9),    
    /**@ The icon to display when an item has been forwarded. */
    olFormRegionIconForwarded(5),    
    /**@ The icon to display in the ribbon for the replacement form region. */
    olFormRegionIconPage(11),    
    /**@ The icon to display when an item has been read. */
    olFormRegionIconRead(3),    
    /**@ The icon to display when an item is a recurring appointment, meeting, or task. */
    olFormRegionIconRecurring(12),    
    /**@ The icon to display when an item has been replied to. */
    olFormRegionIconReplied(4),    
    /**@ The icon to display when an item has been signed with a digital signature. */
    olFormRegionIconSigned(8),    
    /**@ The icon to display when an item has been sent. */
    olFormRegionIconSubmitted(7),    
    /**@ The icon to display when an item has not been read. */
    olFormRegionIconUnread(2),    
    /**@ The icon to display when an item has not been sent. */
    olFormRegionIconUnsent(6),    
    /**@ The icon to display on the Inspector when an item has been opened. */
    olFormRegionIconWindow(10);

    private final long value;

    OlFormRegionIcon(long value) {
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
