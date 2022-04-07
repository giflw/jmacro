package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olruletype">https://docs.microsoft.com/en-us/office/vba/api/outlook.olruletype</a>}
*/
public enum OlRuleType implements COMEnum {
    
    /**@ Indicates that the rule is applied to messages that are being received. */
    olRuleReceive(0),    
    /**@ Indicates that the rule is being applied to messages being sent. */
    olRuleSend(1);

    private final long value;

    OlRuleType(long value) {
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
