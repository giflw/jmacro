package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visuniqueidargs">https://docs.microsoft.com/en-us/office/vba/api/visio.visuniqueidargs</a>}
*/
public enum VisUniqueIDArgs implements COMEnum {
    
    /**@ Clear the unique ID of a shape and return a zero-length string (""). */
    visDeleteGUID(2),    
    /**@ Clear the unique ID of a shape and return a zero-length string (""). Undoable. */
    visDeleteGUIDWithUndo(4),    
    /**@ Return the unique ID string only if the shape already has a unique ID. */
    visGetGUID(0),    
    /**@ Return the unique ID string of the shape. If the shape does not already have a unique ID, assign one to the shape and return the new ID. */
    visGetOrMakeGUID(1),    
    /**@ Return the unique ID string of the shape. If the shape does not already have a unique ID, assign one to the shape and return the new ID. Undoable. */
    visGetOrMakeGUIDWithUndo(3);

    private final long value;

    VisUniqueIDArgs(long value) {
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
