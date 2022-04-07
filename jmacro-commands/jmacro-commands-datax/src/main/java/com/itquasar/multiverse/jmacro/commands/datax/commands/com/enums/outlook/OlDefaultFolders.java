package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.oldefaultfolders">https://docs.microsoft.com/en-us/office/vba/api/outlook.oldefaultfolders</a>}
*/
public enum OlDefaultFolders implements COMEnum {
    
    /**@ The Calendar folder. */
    olFolderCalendar(9),    
    /**@ The Conflicts folder (subfolder of the Sync Issues folder). Only available for an Exchange account. */
    olFolderConflicts(19),    
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
    /**@ The Junk E-Mail folder. */
    olFolderJunk(23),    
    /**@ The Local Failures folder (subfolder of the Sync Issues folder). Only available for an Exchange account. */
    olFolderLocalFailures(21),    
    /**@ The top-level folder in the Managed Folders group. For more information on Managed Folders, see the Help in Microsoft Outlook. Only available for an Exchange account. */
    olFolderManagedEmail(29),    
    /**@ The Notes folder. */
    olFolderNotes(12),    
    /**@ The Outbox folder. */
    olFolderOutbox(4),    
    /**@ The Sent Mail folder. */
    olFolderSentMail(5),    
    /**@ The Server Failures folder (subfolder of the Sync Issues folder). Only available for an Exchange account. */
    olFolderServerFailures(22),    
    /**@ The Suggested Contacts folder. */
    olFolderSuggestedContacts(30),    
    /**@ The Sync Issues folder. Only available for an Exchange account. */
    olFolderSyncIssues(20),    
    /**@ The Tasks folder. */
    olFolderTasks(13),    
    /**@ The To Do folder. */
    olFolderToDo(28),    
    /**@ The All Public Folders folder in the Exchange Public Folders store. Only available for an Exchange account. */
    olPublicFoldersAllPublicFolders(18),    
    /**@ The RSS Feeds folder. */
    olFolderRssFeeds(25);

    private final long value;

    OlDefaultFolders(long value) {
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
