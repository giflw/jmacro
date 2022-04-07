package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olspecialfolders">https://docs.microsoft.com/en-us/office/vba/api/outlook.olspecialfolders</a>}
*/
public enum OlSpecialFolders implements COMEnum {
    
    /**@ Specifies the All Tasks search folder for a store. */
    olSpecialFolderAllTasks(0),    
    /**@ Specifies the Reminders search folder for a store. */
    olSpecialFolderReminders(1);

    private final long value;

    OlSpecialFolders(long value) {
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
