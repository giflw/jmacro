package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdmailmergestate">https://docs.microsoft.com/en-us/office/vba/api/word.wdmailmergestate</a>}
*/
public enum WdMailMergeState implements COMEnum {
    
    /**@ A data source with no main document. */
    wdDataSource(5),    
    /**@ A main document with an attached data source. */
    wdMainAndDataSource(2),    
    /**@ A main document with an attached header source. */
    wdMainAndHeader(3),    
    /**@ A main document with attached data source and header source. */
    wdMainAndSourceAndHeader(4),    
    /**@ A main document with no data attached. */
    wdMainDocumentOnly(1),    
    /**@ Document is not involved in a mail merge operation. */
    wdNormalDocument(0);

    private final long value;

    WdMailMergeState(long value) {
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
