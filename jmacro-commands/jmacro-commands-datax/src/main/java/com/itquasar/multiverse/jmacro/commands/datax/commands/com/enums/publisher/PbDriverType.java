package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbdrivertype">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbdrivertype</a>}
*/
public enum PbDriverType implements COMEnum {
    
    /**@ Non PostScript */
    pbDriverTypeNonPostScript(1),    
    /**@ PostScript 1 */
    pbDriverTypePostScript1(2),    
    /**@ PostScript 2 */
    pbDriverTypePostScript2(3),    
    /**@ PostScript 3 */
    pbDriverTypePostScript3(4);

    private final long value;

    PbDriverType(long value) {
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
