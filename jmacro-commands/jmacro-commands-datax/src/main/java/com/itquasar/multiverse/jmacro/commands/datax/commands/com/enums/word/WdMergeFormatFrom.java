package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdmergeformatfrom">https://docs.microsoft.com/en-us/office/vba/api/word.wdmergeformatfrom</a>}
*/
public enum WdMergeFormatFrom implements COMEnum {
    
    /**@ Retains formatting from the original document. */
    wdMergeFormatFromOriginal(0),    
    /**@ Prompt the user for the document to use for formatting. */
    wdMergeFormatFromPrompt(2),    
    /**@ Retains formatting from the revised document. */
    wdMergeFormatFromRevised(1);

    private final long value;

    WdMergeFormatFrom(long value) {
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
