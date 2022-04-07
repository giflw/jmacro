package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlreferencetype">https://docs.microsoft.com/en-us/office/vba/api/excel.xlreferencetype</a>}
*/
public enum XlReferenceType implements COMEnum {
    
    /**@ Convert to absolute row and column style. */
    xlAbsolute(1),    
    /**@ Convert to absolute row and relative column style. */
    xlAbsRowRelColumn(2),    
    /**@ Convert to relative row and column style. */
    xlRelative(4),    
    /**@ Convert to relative row and absolute column style. */
    xlRelRowAbsColumn(3);

    private final long value;

    XlReferenceType(long value) {
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
