package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olenterfieldbehavior">https://docs.microsoft.com/en-us/office/vba/api/outlook.olenterfieldbehavior</a>}
*/
public enum OlEnterFieldBehavior implements COMEnum {
    
    /**@ The previous selection is displayed. */
    olEnterFieldBehaviorRecallSelection(1),    
    /**@ The contents of the control are selected and any previous selection is ignored. */
    olEnterFieldBehaviorSelectAll(0);

    private final long value;

    OlEnterFieldBehavior(long value) {
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
