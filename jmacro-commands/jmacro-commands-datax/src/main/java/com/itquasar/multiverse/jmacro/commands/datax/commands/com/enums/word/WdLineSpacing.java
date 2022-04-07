package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdlinespacing">https://docs.microsoft.com/en-us/office/vba/api/word.wdlinespacing</a>}
*/
public enum WdLineSpacing implements COMEnum {
    
    /**@ Space-and-a-half line spacing. Spacing is equivalent to the current font size plus 6 points. */
    wdLineSpace1pt5(1),    
    /**@ Line spacing is always at least a specified amount. The amount is specified separately. */
    wdLineSpaceAtLeast(3),    
    /**@ Double spaced. */
    wdLineSpaceDouble(2),    
    /**@ Line spacing is only the exact maximum amount of space required. This setting commonly uses less space than single spacing. */
    wdLineSpaceExactly(4),    
    /**@ Line spacing determined by the number of lines indicated. */
    wdLineSpaceMultiple(5),    
    /**@ Single spaced. default */
    wdLineSpaceSingle(0);

    private final long value;

    WdLineSpacing(long value) {
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
