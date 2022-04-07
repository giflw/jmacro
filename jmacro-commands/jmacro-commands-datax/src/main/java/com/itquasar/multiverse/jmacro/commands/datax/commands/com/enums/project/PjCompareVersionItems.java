package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjcompareversionitems">https://docs.microsoft.com/en-us/office/vba/api/project.pjcompareversionitems</a>}
*/
public enum PjCompareVersionItems implements COMEnum {
    
    /**@ Show all differences. */
    pjCompareVersionItemsAllDifferences(0),    
    /**@ Show all items. */
    pjCompareVersionItemsAllItems(6),    
    /**@ Show only changed items. */
    pjCompareVersionItemsChangedItems(1),    
    /**@ Show common items. */
    pjCompareVersionItemsCommonItems(3),    
    /**@ Show unchanged items. */
    pjCompareVersionItemsUnchangedItems(2),    
    /**@ Show unique items in the first version. */
    pjCompareVersionItemsUniqueItemsOfVersion1(4),    
    /**@ Show unique items in the second version. */
    pjCompareVersionItemsUniqueItemsOfVersion2(5);

    private final long value;

    PjCompareVersionItems(long value) {
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
