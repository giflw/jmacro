package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbhelptype">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbhelptype</a>}
*/
public enum PbHelpType implements COMEnum {
    
    /**@ Displays the Help Topics dialog box. */
    pbHelp(1),    
    /**@ Displays Help describing the command associated with the active view or pane. */
    pbHelpActiveWindow(2),    
    /**@ Displays product support information. */
    pbHelpPSSHelp(3);

    private final long value;

    PbHelpType(long value) {
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
