package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjpoolopen">https://docs.microsoft.com/en-us/office/vba/api/project.pjpoolopen</a>}
*/
public enum PjPoolOpen implements COMEnum {
    
    /**@ Do not open the pool. */
    pjDoNotOpenPool(4),    
    /**@ Open pool and sharers. */
    pjPoolAndSharers(3),    
    /**@ Open pool as read-only. */
    pjPoolReadOnly(1),    
    /**@ Open pool as read/write. */
    pjPoolReadWrite(2),    
    /**@ Prompt the user before opening the pool. */
    pjPromptPool(0);

    private final long value;

    PjPoolOpen(long value) {
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
