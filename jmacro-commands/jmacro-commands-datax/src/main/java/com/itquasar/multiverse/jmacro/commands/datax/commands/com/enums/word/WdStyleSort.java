package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdstylesort">https://docs.microsoft.com/en-us/office/vba/api/word.wdstylesort</a>}
*/
public enum WdStyleSort implements COMEnum {
    
    /**@ Sorts styles based on the item indicated in the Sort Styles Based On option. */
    wdStyleSortByBasedOn(3),    
    /**@ Sorts styles based on the name of the font used. */
    wdStyleSortByFont(2),    
    /**@ Sorts styles alphabetically based on the name of the style. */
    wdStyleSortByName(0),    
    /**@ Sorts styles based on whether the style is a paragraph style or character style. */
    wdStyleSortByType(4),    
    /**@ Sorts styles based on whether they are recommended for use. */
    wdStyleSortRecommended(1);

    private final long value;

    WdStyleSort(long value) {
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
