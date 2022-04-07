package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.vistraceflags">https://docs.microsoft.com/en-us/office/vba/api/visio.vistraceflags</a>}
*/
public enum VisTraceFlags implements COMEnum {
    
    /**@ Add-on invocations. */
    visTraceAddonInvokes(4),    
    /**@ Outgoing advise calls. */
    visTraceAdvises(2),    
    /**@ Microsoft Visual Basic for Applications (VBA) invocations. */
    visTraceCallsToVBA(8),    
    /**@ Event occurrences. */
    visTraceEvents(1);

    private final long value;

    VisTraceFlags(long value) {
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
