package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjcopypicturerows">https://docs.microsoft.com/en-us/office/vba/api/project.pjcopypicturerows</a>}
*/
public enum PjCopyPictureRows implements COMEnum {
    
    /**@ Copy all rows that have content. */
    pjCopyOnScreen(0),    
    /**@ Copy only selected rows. */
    pjCopySelected(1);

    private final long value;

    PjCopyPictureRows(long value) {
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
