package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdshowsourcedocuments">https://docs.microsoft.com/en-us/office/vba/api/word.wdshowsourcedocuments</a>}
*/
public enum WdShowSourceDocuments implements COMEnum {
    
    /**@ Shows both original and revised documents. */
    wdShowSourceDocumentsBoth(3),    
    /**@ Shows neither the original nor the revised documents for the source document used in a Compare function. */
    wdShowSourceDocumentsNone(0),    
    /**@ Shows the original document only. */
    wdShowSourceDocumentsOriginal(1),    
    /**@ Shows the revised document only. */
    wdShowSourceDocumentsRevised(2);

    private final long value;

    WdShowSourceDocuments(long value) {
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
