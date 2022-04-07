package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visruntypes">https://docs.microsoft.com/en-us/office/vba/api/visio.visruntypes</a>}
*/
public enum VisRunTypes implements COMEnum {
    
    /**@ Reports runs of characters that have common character properties. Corresponds to a set of characters covered by one row in a shape's Character section. */
    visCharPropRow(1),    
    /**@ Reports runs whose boundaries are between characters that are and aren't the result of the expansion of a text field, or between characters that are the result of the expansion of distinct text fields. */
    visFieldRun(20),    
    /**@ Reports runs of characters that have common paragraph properties. Corresponds to a set of characters covered by one row in the shape's Paragraph section. */
    visParaPropRow(2),    
    /**@ Reports runs whose boundaries are between successive paragraphs in the shape's text. Mimics triple-clicking to select text. */
    visParaRun(11),    
    /**@ Reports runs of characters that have common tab properties. Corresponds to a set of characters that are covered by one row in shape's Tabs section. */
    visTabPropRow(3),    
    /**@ Reports runs whose boundaries are between successive words in a shape's text. Mimics double-clicking to select text. */
    visWordRun(10);

    private final long value;

    VisRunTypes(long value) {
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
