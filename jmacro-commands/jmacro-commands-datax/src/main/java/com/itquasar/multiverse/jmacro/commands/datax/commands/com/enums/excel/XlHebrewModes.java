package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlhebrewmodes">https://docs.microsoft.com/en-us/office/vba/api/excel.xlhebrewmodes</a>}
*/
public enum XlHebrewModes implements COMEnum {
    
    /**@ The conventional script type as required by the Hebrew Language Academy when writing text without diacritics. */
    xlHebrewFullScript(0),    
    /**@ The Hebrew traditional script. */
    xlHebrewMixedAuthorizedScript(3),    
    /**@ In this mode the speller accepts any word recognized as Hebrew, whether in Full Script, Partial Script, or any unconventional spelling variation that is known to the speller. */
    xlHebrewMixedScript(2),    
    /**@ In this mode the speller accepts words both in Full Script and Partial Script. Some words will be flagged since this spelling is not authorized in either Full script or Partial script. */
    xlHebrewPartialScript(1);

    private final long value;

    XlHebrewModes(long value) {
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
