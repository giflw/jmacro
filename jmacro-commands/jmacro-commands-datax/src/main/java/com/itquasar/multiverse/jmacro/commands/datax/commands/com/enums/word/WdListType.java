package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdlisttype">https://docs.microsoft.com/en-us/office/vba/api/word.wdlisttype</a>}
*/
public enum WdListType implements COMEnum {
    
    /**@ Bulleted list. */
    wdListBullet(2),    
    /**@ ListNum fields that can be used in the body of a paragraph. */
    wdListListNumOnly(1),    
    /**@ Mixed numeric list. */
    wdListMixedNumbering(5),    
    /**@ List with no bullets, numbering, or outlining. */
    wdListNoNumbering(0),    
    /**@ Outlined list. */
    wdListOutlineNumbering(4),    
    /**@ Picture bulleted list. */
    wdListPictureBullet(6),    
    /**@ Simple numeric list. */
    wdListSimpleNumbering(3);

    private final long value;

    WdListType(long value) {
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
