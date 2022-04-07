package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olactioncopylike">https://docs.microsoft.com/en-us/office/vba/api/outlook.olactioncopylike</a>}
*/
public enum OlActionCopyLike implements COMEnum {
    
    /**@ Properties of the new item will be set such that the new item is a forward of the original item. If creating a new MailItem, the value of the To and CC properties in the new item will be empty and the Subject property of the new item will be the original Subject with a prefix such as "FW:" (see Prefix property) added. The attachments on the original item will be copied to the new item. */
    olForward(2),    
    /**@ Properties of the new item will be set such that the new item is a reply to the original item. If creating a new MailItem, the value of the original To field will be copied to the SenderEmailAddress property of the new item, the CC field will be blank and the Subject field of the new item will be the original Subject with a prefix such as "RE:" (see Prefix property) added. */
    olReply(0),    
    /**@ Properties of the new item will be set such that the new item is a reply to all of the senders of the original item. If creating a new MailItem, the value of the SenderEmailAddress and CC properties will be copied to the To property of the new item and the Subject property of the new item will be the Subject of the original item with a prefix such as "RE:" (see Prefix property) added. */
    olReplyAll(1),    
    /**@ If creating a new PostItem based on an old one, the Post To property of the new item will contain the active folder address, the Subject property of the original item will be copied to the ConversationTopic property of the new item, and the Subject property of the new item will be empty. */
    olReplyFolder(3),    
    /**@ Used exclusively for voting button actions. */
    olRespond(4);

    private final long value;

    OlActionCopyLike(long value) {
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
