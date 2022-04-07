package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdoleverb">https://docs.microsoft.com/en-us/office/vba/api/word.wdoleverb</a>}
*/
public enum WdOLEVerb implements COMEnum {
    
    /**@ Forces the object to discard any undo state that it might be maintaining; note that the object remains active, however. */
    wdOLEVerbDiscardUndoState(-6),    
    /**@ Removes the object's user interface from view. */
    wdOLEVerbHide(-3),    
    /**@ Runs the object and installs its window, but doesn't install any user-interface tools. */
    wdOLEVerbInPlaceActivate(-5),    
    /**@ Opens the object in a separate window. */
    wdOLEVerbOpen(-2),    
    /**@ Performs the verb that is invoked when the user double-clicks the object. */
    wdOLEVerbPrimary(0),    
    /**@ Shows the object to the user for editing or viewing. Use it to show a newly inserted object for initial editing. */
    wdOLEVerbShow(-1),    
    /**@ Activates the object in place and displays any user-interface tools that the object needs, such as menus or toolbars. */
    wdOLEVerbUIActivate(-4);

    private final long value;

    WdOLEVerb(long value) {
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
