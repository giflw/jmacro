package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjdialog">https://docs.microsoft.com/en-us/office/vba/api/project.pjdialog</a>}
*/
public enum PjDialog implements COMEnum {
    
    /**@ Resource Assignment dialog box. */
    pjResourceAssignment(4087);

    private final long value;

    PjDialog(long value) {
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
