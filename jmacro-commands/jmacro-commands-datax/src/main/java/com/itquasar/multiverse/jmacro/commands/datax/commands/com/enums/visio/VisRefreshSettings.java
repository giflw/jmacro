package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visrefreshsettings">https://docs.microsoft.com/en-us/office/vba/api/visio.visrefreshsettings</a>}
*/
public enum VisRefreshSettings implements COMEnum {
    
    /**@ Disables display of the Refresh Conflicts task pane in the Microsoft Visio user interface after data is refreshed. */
    visRefreshNoReconcilationUI(2),    
    /**@ When data is refreshed, overwrites all user changes made since the previous refresh operation. */
    visRefreshOverwriteAll(1);

    private final long value;

    VisRefreshSettings(long value) {
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
