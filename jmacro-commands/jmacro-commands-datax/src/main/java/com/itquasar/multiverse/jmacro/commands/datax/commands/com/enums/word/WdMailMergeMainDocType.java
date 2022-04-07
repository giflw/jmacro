package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdmailmergemaindoctype">https://docs.microsoft.com/en-us/office/vba/api/word.wdmailmergemaindoctype</a>}
*/
public enum WdMailMergeMainDocType implements COMEnum {
    
    /**@ Catalog. */
    wdCatalog(3),    
    /**@ Directory. */
    wdDirectory(3),    
    /**@ Email message. */
    wdEMail(4),    
    /**@ Envelope. */
    wdEnvelopes(2),    
    /**@ Fax. */
    wdFax(5),    
    /**@ Form letter. */
    wdFormLetters(0),    
    /**@ Mailing label. */
    wdMailingLabels(1),    
    /**@ Not a merge document. */
    wdNotAMergeDocument(-1);

    private final long value;

    WdMailMergeMainDocType(long value) {
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
