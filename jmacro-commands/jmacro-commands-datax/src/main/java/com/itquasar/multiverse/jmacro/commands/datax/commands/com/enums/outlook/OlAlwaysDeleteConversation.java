package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olalwaysdeleteconversation">https://docs.microsoft.com/en-us/office/vba/api/outlook.olalwaysdeleteconversation</a>}
*/
public enum OlAlwaysDeleteConversation implements COMEnum {
    
    /**@ New items of the conversation are always moved to the Deleted Items folder for the store that contains the items */
    olAlwaysDelete(1),    
    /**@ The specified store does not support the action of always moving items to the Deleted Items folder of that store. */
    olAlwaysDeleteUnsupported(2),    
    /**@ New items joining the conversation are not moved to the Deleted Items folder on the specified delivery store, and existing conversation items in the Deleted Items folder are moved to the Inbox. */
    olDoNotDelete(0);

    private final long value;

    OlAlwaysDeleteConversation(long value) {
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
