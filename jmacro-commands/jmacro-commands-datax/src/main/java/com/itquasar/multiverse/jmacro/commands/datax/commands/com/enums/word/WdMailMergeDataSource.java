package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdmailmergedatasource">https://docs.microsoft.com/en-us/office/vba/api/word.wdmailmergedatasource</a>}
*/
public enum WdMailMergeDataSource implements COMEnum {
    
    /**@ From Microsoft Access using Dynamic Data Exchange (DDE). */
    wdMergeInfoFromAccessDDE(1),    
    /**@ From Microsoft Excel using DDE. */
    wdMergeInfoFromExcelDDE(2),    
    /**@ From MSQuery using DDE. */
    wdMergeInfoFromMSQueryDDE(3),    
    /**@ From an Open Database Connectivity (ODBC) connection. */
    wdMergeInfoFromODBC(4),    
    /**@ From an Office Data Source Object (ODSO). */
    wdMergeInfoFromODSO(5),    
    /**@ From Microsoft Word. */
    wdMergeInfoFromWord(0),    
    /**@ No merge information provided. */
    wdNoMergeInfo(-1);

    private final long value;

    WdMailMergeDataSource(long value) {
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
