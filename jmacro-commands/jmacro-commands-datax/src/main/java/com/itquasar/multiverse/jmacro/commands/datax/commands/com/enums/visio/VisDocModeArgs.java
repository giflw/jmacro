package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visdocmodeargs">https://docs.microsoft.com/en-us/office/vba/api/visio.visdocmodeargs</a>}
*/
public enum VisDocModeArgs implements COMEnum {
    
    /**@ The document is in design mode. */
    visDocModeDesign(1),    
    /**@ The document is in run mode. */
    visDocModeRun(0),    
    /**@ The document ID is invalid. Document.ID will never return this value for an open document. */
    visInvalDocID(-1);

    private final long value;

    VisDocModeArgs(long value) {
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
