package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olinspectorclose">https://docs.microsoft.com/en-us/office/vba/api/outlook.olinspectorclose</a>}
*/
public enum OlInspectorClose implements COMEnum {
    
    /**@ Changes to the document are discarded. */
    olDiscard(1),    
    /**@ User is prompted to save documents. */
    olPromptForSave(2),    
    /**@ Documents are saved. */
    olSave(0);

    private final long value;

    OlInspectorClose(long value) {
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
