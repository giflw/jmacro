package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdstyletype">https://docs.microsoft.com/en-us/office/vba/api/word.wdstyletype</a>}
*/
public enum WdStyleType implements COMEnum {
    
    /**@ Body character style. */
    wdStyleTypeCharacter(2),    
    /**@ List style. */
    wdStyleTypeList(4),    
    /**@ Paragraph style. */
    wdStyleTypeParagraph(1),    
    /**@ Table style. */
    wdStyleTypeTable(3);

    private final long value;

    WdStyleType(long value) {
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
