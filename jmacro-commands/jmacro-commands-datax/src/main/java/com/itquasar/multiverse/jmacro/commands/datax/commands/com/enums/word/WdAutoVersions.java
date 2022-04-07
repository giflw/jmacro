package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdautoversions">https://docs.microsoft.com/en-us/office/vba/api/word.wdautoversions</a>}
*/
public enum WdAutoVersions implements COMEnum {
    
    /**@ No document version is saved. */
    wdAutoVersionOff(0),    
    /**@ A document version is saved automatically when the document is closed. */
    wdAutoVersionOnClose(1);

    private final long value;

    WdAutoVersions(long value) {
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
