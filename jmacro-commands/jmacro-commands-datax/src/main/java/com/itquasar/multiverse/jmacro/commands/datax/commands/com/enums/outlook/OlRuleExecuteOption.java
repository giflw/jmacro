package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olruleexecuteoption">https://docs.microsoft.com/en-us/office/vba/api/outlook.olruleexecuteoption</a>}
*/
public enum OlRuleExecuteOption implements COMEnum {
    
    /**@ Executes a rule against all messages in the specified folder or folders. */
    olRuleExecuteAllMessages(0),    
    /**@ Executes a rule against messages that have been read in the specified folder or folders. */
    olRuleExecuteReadMessages(1),    
    /**@ Executes a rule against messages that have not been read in the specified folder or folders. */
    olRuleExecuteUnreadMessages(2);

    private final long value;

    OlRuleExecuteOption(long value) {
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
