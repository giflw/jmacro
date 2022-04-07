package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdalertlevel">https://docs.microsoft.com/en-us/office/vba/api/word.wdalertlevel</a>}
*/
public enum WdAlertLevel implements COMEnum {
    
    /**@ All message boxes and alerts are displayed; errors are returned to the macro. */
    wdAlertsAll(-1),    
    /**@ Only message boxes are displayed; errors are trapped and returned to the macro. */
    wdAlertsMessageBox(-2),    
    /**@ No alerts or message boxes are displayed. If a macro encounters a message box, the default value is chosen and the macro continues. */
    wdAlertsNone(0);

    private final long value;

    WdAlertLevel(long value) {
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
