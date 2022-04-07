package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.actransformxmlscriptoption">https://docs.microsoft.com/en-us/office/vba/api/access.actransformxmlscriptoption</a>}
*/
public enum AcTransformXMLScriptOption implements COMEnum {
    
    /**@ The script is disabled. */
    acDisableScript(2),    
    /**@ The script is enabled. */
    acEnableScript(0),    
    /**@ The user is prompted to disable or enable the script. */
    acPromptScript(1);

    private final long value;

    AcTransformXMLScriptOption(long value) {
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
