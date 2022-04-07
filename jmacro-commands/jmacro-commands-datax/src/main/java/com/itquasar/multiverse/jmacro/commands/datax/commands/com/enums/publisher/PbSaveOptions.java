package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbsaveoptions">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbsaveoptions</a>}
*/
public enum PbSaveOptions implements COMEnum {
    
    /**@ Close the open publication without saving any changes. */
    pbDoNotSaveChanges(3),    
    /**@ Default. Prompt the user whether to save changes in the open publication. */
    pbPromptToSaveChanges(1),    
    /**@ Save the open publication before closing it. */
    pbSaveChanges(2);

    private final long value;

    PbSaveOptions(long value) {
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
