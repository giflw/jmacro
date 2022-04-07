package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdcontentcontroldatestorageformat">https://docs.microsoft.com/en-us/office/vba/api/word.wdcontentcontroldatestorageformat</a>}
*/
public enum WdContentControlDateStorageFormat implements COMEnum {
    
    /**@ Specifies to store or retrieve the date value for a date content control as a date in the standard XML Schema DateTime format. */
    wdContentControlDateStorageDate(1),    
    /**@ Specifies to store or retrieve the date value for a date content control as a time in the standard XML Schema DateTime format. */
    wdContentControlDateStorageDateTime(2),    
    /**@ Specifies to store or retrieve the date value for a date content control as text. */
    wdContentControlDateStorageText(0);

    private final long value;

    WdContentControlDateStorageFormat(long value) {
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
