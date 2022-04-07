package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlfindlookin">https://docs.microsoft.com/en-us/office/vba/api/excel.xlfindlookin</a>}
*/
public enum XlFindLookIn implements COMEnum {
    
    /**@ Comments */
    xlComments(-4144),    
    /**@ Threaded comments */
    xlCommentsThreaded(-4184),    
    /**@ Formulas */
    xlFormulas(-4123),    
    /**@ Values */
    xlValues(-4163);

    private final long value;

    XlFindLookIn(long value) {
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
