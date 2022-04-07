package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjcompareversioncolumns">https://docs.microsoft.com/en-us/office/vba/api/project.pjcompareversioncolumns</a>}
*/
public enum PjCompareVersionColumns implements COMEnum {
    
    /**@ Show both column differences and column data. */
    pjCompareVersionColumnsDataAndDifferences(0),    
    /**@ Show only column data. */
    pjCompareVersionColumnsDataOnly(1),    
    /**@ Show only column differences. */
    pjCompareVersionColumnsDifferencesOnly(2);

    private final long value;

    PjCompareVersionColumns(long value) {
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
