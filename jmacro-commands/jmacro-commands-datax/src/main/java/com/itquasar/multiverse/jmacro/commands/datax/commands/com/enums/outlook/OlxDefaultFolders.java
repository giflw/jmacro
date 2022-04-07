package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olxdefaultfolde">https://docs.microsoft.com/en-us/office/vba/api/outlook.olxdefaultfolde</a>}
*/
public enum OlxDefaultFolders implements COMEnum {
    
    /**@ The Calendar folder. */
    olFolderCalendar(9),    
    /**@ The Contacts folder. */
    olFolderContacts(10),    
    /**@ The Deleted Items folder. */
    olFolderDeletedItems(3),    
    /**@ The Drafts folder. */
    olFolderDrafts(16),    
    /**@ The Inbox folder. */
    olFolderInbox(6),    
    /**@ The Journal folder. */
    olFolderJournal(11),    
    /**@ The Notes folder. */
    olFolderNotes(12),    
    /**@ The Outbox folder. */
    olFolderOutbox(4),    
    /**@ The Sent Mail folder. */
    olFolderSentMail(5),    
    /**@ The Tasks folder. */
    olFolderTasks(13);

    private final long value;

    OlxDefaultFolders(long value) {
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
