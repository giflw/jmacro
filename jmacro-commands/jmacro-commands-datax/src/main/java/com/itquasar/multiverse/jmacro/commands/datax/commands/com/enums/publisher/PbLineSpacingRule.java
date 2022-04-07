package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pblinespacingrule">https://docs.microsoft.com/en-us/office/vba/api/publisher.pblinespacingrule</a>}
*/
public enum PbLineSpacingRule implements COMEnum {
    
    /**@ Sets the spacing for specified paragraphs to one-and-a-half lines. */
    pbLineSpacing1pt5(1),    
    /**@ Double-spaces the specified paragraphs (sets paragraph line spacing to two lines). */
    pbLineSpacingDouble(2),    
    /**@ Sets the line spacing to exactly the value specified in the Spacing argument, even if a larger font is used within the paragraph. */
    pbLineSpacingExactly(4),    
    /**@ A return value for the LineSpacing property that indicates that line spacing is a combination of values for the specified paragraphs. */
    pbLineSpacingMixed(-9999999),    
    /**@ Sets the line spacing to the value specified in the Spacing argument. */
    pbLineSpacingMultiple(5),    
    /**@ Single spaces the specified paragraphs (sets paragraph line spacing to one space). */
    pbLineSpacingSingle(0);

    private final long value;

    PbLineSpacingRule(long value) {
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
