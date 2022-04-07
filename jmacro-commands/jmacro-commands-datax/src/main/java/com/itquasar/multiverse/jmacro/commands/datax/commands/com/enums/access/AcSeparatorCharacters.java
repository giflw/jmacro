package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acseparatorcharacters">https://docs.microsoft.com/en-us/office/vba/api/access.acseparatorcharacters</a>}
*/
public enum AcSeparatorCharacters implements COMEnum {
    
    /**@ A comma (,) is used as the separator character. */
    acSeparatorCharactersComma(3),    
    /**@ Each value appears on its own line. */
    acSeparatorCharactersNewLine(1),    
    /**@ A semicolon (;) is used as the separator character. */
    acSeparatorCharactersSemiColon(2),    
    /**@ The List separator setting in the Regional and Language Options in the Windows Control Panel is used as the separator character. */
    acSeparatorCharactersSystemSeparator(0);

    private final long value;

    AcSeparatorCharacters(long value) {
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
