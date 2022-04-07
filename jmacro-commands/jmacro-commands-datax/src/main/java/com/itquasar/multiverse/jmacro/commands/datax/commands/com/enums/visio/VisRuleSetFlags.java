package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visrulesetflags">https://docs.microsoft.com/en-us/office/vba/api/visio.visrulesetflags</a>}
*/
public enum VisRuleSetFlags implements COMEnum {
    
    /**@ The default rule-set property. The rule set appears in the Rules to Check list (click the Check Diagram arrow on the Process tab). */
    visRuleSetDefault(0),    
    /**@ The rule set does not appear in the Rules to Check list. */
    visRuleSetHidden(1);

    private final long value;

    VisRuleSetFlags(long value) {
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
