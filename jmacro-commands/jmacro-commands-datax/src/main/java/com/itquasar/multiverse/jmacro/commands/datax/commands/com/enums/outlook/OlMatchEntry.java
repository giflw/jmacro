package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olmatchentry">https://docs.microsoft.com/en-us/office/vba/api/outlook.olmatchentry</a>}
*/
public enum OlMatchEntry implements COMEnum {
    
    /**@ Extended matching. As each character is typed, the control searches for an entry matching all characters entered. */
    olMatchEntryComplete(1),    
    /**@ Basic matching: The control searches for the next entry that starts with the character entered. Repeatedly typing the same letter cycles through all entries beginning with that letter. */
    olMatchEntryFirstLetter(0),    
    /**@ No matching is performed. */
    olMatchEntryNone(2);

    private final long value;

    OlMatchEntry(long value) {
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
