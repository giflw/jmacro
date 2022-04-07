package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbligaturepresettype">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbligaturepresettype</a>}
*/
public enum PbLigaturePresetType implements COMEnum {
    
    /**@ Ligature applied to all characters */
    pbLigatureAll(3),    
    /**@ Ligature applied to some characters, but not others */
    pbLigatureMixed(-1),    
    /**@ No ligature applied */
    pbLigatureNone(4),    
    /**@ Standard ligature applied */
    pbLigatureStandard(0),    
    /**@ Standard historical ligature applied */
    pbLigatureStandardHistorical(2),    
    /**@ Standard optional ligature applied */
    pbLigatureStandardOptional(1);

    private final long value;

    PbLigaturePresetType(long value) {
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
