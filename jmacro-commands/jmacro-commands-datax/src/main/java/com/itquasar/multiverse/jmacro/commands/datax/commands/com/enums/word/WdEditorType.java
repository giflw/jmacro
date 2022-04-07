package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdeditortype">https://docs.microsoft.com/en-us/office/vba/api/word.wdeditortype</a>}
*/
public enum WdEditorType implements COMEnum {
    
    /**@ Represents the current user of the document. */
    wdEditorCurrent(-6),    
    /**@ Represents the Editors group for documents that use Information Rights Management. */
    wdEditorEditors(-5),    
    /**@ Represents all users who open a document. */
    wdEditorEveryone(-1),    
    /**@ Represents the Owners group for documents that use Information Rights Management. */
    wdEditorOwners(-4);

    private final long value;

    WdEditorType(long value) {
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
