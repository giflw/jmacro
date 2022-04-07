package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olsharingmsgtype">https://docs.microsoft.com/en-us/office/vba/api/outlook.olsharingmsgtype</a>}
*/
public enum OlSharingMsgType implements COMEnum {
    
    /**@ Represents a sharing invitation. */
    olSharingMsgTypeInvite(2),    
    /**@ Represents both a sharing invitation and a sharing request. */
    olSharingMsgTypeInviteAndRequest(3),    
    /**@ Represents a sharing request. */
    olSharingMsgTypeRequest(1),    
    /**@ Represents a sharing response, which indicates that a sharing request or sharing invitation has been allowed. */
    olSharingMsgTypeResponseAllow(4),    
    /**@ Represents a sharing response, which indicates that a sharing request or sharing invitation has been denied. */
    olSharingMsgTypeResponseDeny(5),    
    /**@ Represents an unknown type of sharing message. */
    olSharingMsgTypeUnknown(0);

    private final long value;

    OlSharingMsgType(long value) {
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
