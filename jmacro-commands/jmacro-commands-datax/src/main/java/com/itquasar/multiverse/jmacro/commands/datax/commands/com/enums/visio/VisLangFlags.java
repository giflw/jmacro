package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.vislangflags">https://docs.microsoft.com/en-us/office/vba/api/visio.vislangflags</a>}
*/
public enum VisLangFlags implements COMEnum {
    
    /**@ The page name is a local name. */
    visLangLocal(0),    
    /**@ The page name is a universal name. */
    visLangUniversal(1);

    private final long value;

    VisLangFlags(long value) {
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
