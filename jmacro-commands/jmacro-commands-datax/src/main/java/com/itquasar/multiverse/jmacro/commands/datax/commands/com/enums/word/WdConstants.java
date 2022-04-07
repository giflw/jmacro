package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdconstants">https://docs.microsoft.com/en-us/office/vba/api/word.wdconstants</a>}
*/
public enum WdConstants implements COMEnum {
    
    /**@ Represents the Auto value for the specified setting. */
    wdAutoPosition(0),    
    /**@ Indicates that selection will be extended backward using the MoveStartUntil or MoveStartWhile method of the Range or Selection object. */
    wdBackward(-1073741823),    
    /**@ Represents the creator code for objects created by Microsoft Word. */
    wdCreatorCode(1297307460),    
    /**@ Represents the first item in a collection. */
    wdFirst(1),    
    /**@ Indicates that selection will be extended forward using the MoveStartUntil or MoveStartWhile method of the Range or Selection object. */
    wdForward(1073741823),    
    /**@ Toggles a property's value. */
    wdToggle(9999998),    
    /**@ Represents an undefined value. */
    wdUndefined(9999999);

    private final long value;

    WdConstants(long value) {
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
