package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acquitoption">https://docs.microsoft.com/en-us/office/vba/api/access.acquitoption</a>}
*/
public enum AcQuitOption implements COMEnum {
    
    /**@ Displays a dialog box that asks whether you want to save any database objects that have been changed but not saved. */
    acQuitPrompt(0),    
    /**@ (Default) Saves all objects without displaying a dialog box. */
    acQuitSaveAll(1),    
    /**@ Quits Microsoft Access without saving any objects. */
    acQuitSaveNone(2);

    private final long value;

    AcQuitOption(long value) {
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
