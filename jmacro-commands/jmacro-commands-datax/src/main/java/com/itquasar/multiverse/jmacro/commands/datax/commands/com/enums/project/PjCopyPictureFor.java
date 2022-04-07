package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjcopypicturefor">https://docs.microsoft.com/en-us/office/vba/api/project.pjcopypicturefor</a>}
*/
public enum PjCopyPictureFor implements COMEnum {
    
    /**@ For a Graphics Interchange Format (GIF) image. */
    pjGIF(2),    
    /**@ For a printer. */
    pjPrinter(1),    
    /**@ For a screen. */
    pjScreen(0);

    private final long value;

    PjCopyPictureFor(long value) {
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
