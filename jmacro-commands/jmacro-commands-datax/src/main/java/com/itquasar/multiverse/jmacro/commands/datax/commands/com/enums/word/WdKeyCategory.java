package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdkeycategory">https://docs.microsoft.com/en-us/office/vba/api/word.wdkeycategory</a>}
*/
public enum WdKeyCategory implements COMEnum {
    
    /**@ Key is assigned to autotext. */
    wdKeyCategoryAutoText(4),    
    /**@ Key is assigned to a command. */
    wdKeyCategoryCommand(1),    
    /**@ Key is disabled. */
    wdKeyCategoryDisable(0),    
    /**@ Key is assigned to a font. */
    wdKeyCategoryFont(3),    
    /**@ Key is assigned to a macro. */
    wdKeyCategoryMacro(2),    
    /**@ Key is not assigned. */
    wdKeyCategoryNil(-1),    
    /**@ Key is assigned to a prefix. */
    wdKeyCategoryPrefix(7),    
    /**@ Key is assigned to a style. */
    wdKeyCategoryStyle(5),    
    /**@ Key is assigned to a symbol. */
    wdKeyCategorySymbol(6);

    private final long value;

    WdKeyCategory(long value) {
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
