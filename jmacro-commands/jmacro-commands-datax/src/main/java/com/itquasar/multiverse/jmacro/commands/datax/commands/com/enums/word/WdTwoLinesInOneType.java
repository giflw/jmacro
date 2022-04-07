package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdtwolinesinonetype">https://docs.microsoft.com/en-us/office/vba/api/word.wdtwolinesinonetype</a>}
*/
public enum WdTwoLinesInOneType implements COMEnum {
    
    /**@ Enclose the lines using angle brackets. */
    wdTwoLinesInOneAngleBrackets(4),    
    /**@ Enclose the lines using curly brackets. */
    wdTwoLinesInOneCurlyBrackets(5),    
    /**@ Use no enclosing character. */
    wdTwoLinesInOneNoBrackets(1),    
    /**@ Restore the two lines of text written into one to two separate lines. */
    wdTwoLinesInOneNone(0),    
    /**@ Enclose the lines using parentheses. */
    wdTwoLinesInOneParentheses(2),    
    /**@ Enclose the lines using square brackets. */
    wdTwoLinesInOneSquareBrackets(3);

    private final long value;

    WdTwoLinesInOneType(long value) {
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
