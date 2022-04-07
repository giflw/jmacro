package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visdoccleantargets">https://docs.microsoft.com/en-us/office/vba/api/visio.visdoccleantargets</a>}
*/
public enum VisDocCleanTargets implements COMEnum {
    
    /**@ Examine all objects. */
    visDocCleanTargAll(255),    
    /**@ Examine background pages. */
    visDocCleanTargBPages(2),    
    /**@ Examine document sheet. */
    visDocCleanTargDoc(16),    
    /**@ Examine foreground pages. */
    visDocCleanTargFPages(1),    
    /**@ Examine masters. */
    visDocCleanTargMasters(4),    
    /**@ Examine page sheet(s). */
    visDocCleanTargPageSheet(256),    
    /**@ Examine styles. */
    visDocCleanTargStyles(8);

    private final long value;

    VisDocCleanTargets(long value) {
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
