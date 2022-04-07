package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdwraptype">https://docs.microsoft.com/en-us/office/vba/api/word.wdwraptype</a>}
*/
public enum WdWrapType implements COMEnum {
    
    /**@ Places shapes in line with text. */
    wdWrapInline(7),    
    /**@ Places shape in front of text. See also wdWrapFront. */
    wdWrapNone(3),    
    /**@ Wraps text around the shape. Line continuation is on the opposite side of the shape. */
    wdWrapSquare(0),    
    /**@ Wraps text around the shape. */
    wdWrapThrough(2),    
    /**@ Wraps text close to the shape. */
    wdWrapTight(1),    
    /**@ Places text above and below the shape. */
    wdWrapTopBottom(4),    
    /**@ Places shape behind text. */
    wdWrapBehind(5),    
    /**@ Places shape in front of text. See also wdWrapNone. */
    wdWrapFront(3);

    private final long value;

    WdWrapType(long value) {
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
