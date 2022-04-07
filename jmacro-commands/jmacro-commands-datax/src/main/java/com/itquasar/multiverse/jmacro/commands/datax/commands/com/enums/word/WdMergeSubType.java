package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdmergesubtype">https://docs.microsoft.com/en-us/office/vba/api/word.wdmergesubtype</a>}
*/
public enum WdMergeSubType implements COMEnum {
    
    /**@ Microsoft Access. */
    wdMergeSubTypeAccess(1),    
    /**@ Office Address List. */
    wdMergeSubTypeOAL(2),    
    /**@ OLE database. */
    wdMergeSubTypeOLEDBText(5),    
    /**@ OLE database. */
    wdMergeSubTypeOLEDBWord(3),    
    /**@ Other type of data source. */
    wdMergeSubTypeOther(0),    
    /**@ Microsoft Outlook. */
    wdMergeSubTypeOutlook(6),    
    /**@ Microsoft Word. */
    wdMergeSubTypeWord(7),    
    /**@ Microsoft Word 2000. */
    wdMergeSubTypeWord2000(8),    
    /**@ Microsoft Works. */
    wdMergeSubTypeWorks(4);

    private final long value;

    WdMergeSubType(long value) {
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
