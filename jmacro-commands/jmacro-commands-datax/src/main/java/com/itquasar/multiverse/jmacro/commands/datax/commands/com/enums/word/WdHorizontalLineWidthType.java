package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdhorizontallinewidthtype">https://docs.microsoft.com/en-us/office/vba/api/word.wdhorizontallinewidthtype</a>}
*/
public enum WdHorizontalLineWidthType implements COMEnum {
    
    /**@ Microsoft Word interprets the width (length) of the specified horizontal line as a fixed value (in points). This is the default value for horizontal lines added with the AddHorizontalLine method. Setting the Width property for the InlineShape object associated with a horizontal line sets the WidthType property to this value. */
    wdHorizontalLineFixedWidth(-2),    
    /**@ Word interprets the width (length) of the specified horizontal line as a percentage of the screen width. This is the default value for horizontal lines added with the AddHorizontalLineStandard method. Setting the PercentWidth property on a horizontal line sets the WidthType property to this value. */
    wdHorizontalLinePercentWidth(-1);

    private final long value;

    WdHorizontalLineWidthType(long value) {
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
