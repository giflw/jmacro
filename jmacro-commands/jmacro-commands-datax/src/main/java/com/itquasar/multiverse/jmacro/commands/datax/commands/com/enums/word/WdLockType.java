package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdlocktype">https://docs.microsoft.com/en-us/office/vba/api/word.wdlocktype</a>}
*/
public enum WdLockType implements COMEnum {
    
    /**@ Specifies a placeholder lock. A placeholder lock indicates that another user has removed their lock from the range, but the current user has not updated their view of the document by saving. */
    wdLockChanged(3),    
    /**@ Specifies an ephemeral lock. Word implicitly places an ephemeral lock on a range when a user begins editing a range in a document with coauthoring enabled. */
    wdLockEphemeral(2),    
    /**@ Reserved for future use. */
    wdLockNone(0),    
    /**@ Specifies a reservation lock. A reservation lock is explicitly created by a user through the Block Authors button on the Review tab in Word. */
    wdLockReservation(1);

    private final long value;

    WdLockType(long value) {
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
