package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdprotectiontype">https://docs.microsoft.com/en-us/office/vba/api/word.wdprotectiontype</a>}
*/
public enum WdProtectionType implements COMEnum {
    
    /**@ Allow only comments to be added to the document. */
    wdAllowOnlyComments(1),    
    /**@ Allow content to be added to the document only through form fields. */
    wdAllowOnlyFormFields(2),    
    /**@ Allow read-only access to the document. */
    wdAllowOnlyReading(3),    
    /**@ Allow only revisions to be made to existing content. */
    wdAllowOnlyRevisions(0),    
    /**@ Do not apply protection to the document. */
    wdNoProtection(-1);

    private final long value;

    WdProtectionType(long value) {
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
