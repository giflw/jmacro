package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visprimarykeysettings">https://docs.microsoft.com/en-us/office/vba/api/visio.visprimarykeysettings</a>}
*/
public enum VisPrimaryKeySettings implements COMEnum {
    
    /**@ Use multiple columns as primary key columns. */
    visKeyComposite(3),    
    /**@ Use row order as the primary key. */
    visKeyRowOrder(1),    
    /**@ Use a single column as the primary key column. */
    visKeySingle(2);

    private final long value;

    VisPrimaryKeySettings(long value) {
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
