package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olnavigationmoduletype">https://docs.microsoft.com/en-us/office/vba/api/outlook.olnavigationmoduletype</a>}
*/
public enum OlNavigationModuleType implements COMEnum {
    
    /**@ A CalendarModule object that represents the Calendar navigation module. */
    olModuleCalendar(1),    
    /**@ A ContactsModule object that represents the Contacts navigation module. */
    olModuleContacts(2),    
    /**@ A NavigationModule object that represents the Folders List navigation module. */
    olModuleFolderList(6),    
    /**@ A JournalModule object that represents the Journal navigation module. */
    olModuleJournal(4),    
    /**@ A MailModule object that represents the Mail navigation module. */
    olModuleMail(0),    
    /**@ A NotesModule object that represents the Notes navigation module. */
    olModuleNotes(5),    
    /**@ A NavigationModule object that represents the Shortcuts navigation module. */
    olModuleShortcuts(7),    
    /**@ A SolutionsModule object that represents the Solutions navigation module. */
    olModuleSolutions(8),    
    /**@ A TasksModule object that represents the Tasks navigation module. */
    olModuleTasks(3);

    private final long value;

    OlNavigationModuleType(long value) {
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
