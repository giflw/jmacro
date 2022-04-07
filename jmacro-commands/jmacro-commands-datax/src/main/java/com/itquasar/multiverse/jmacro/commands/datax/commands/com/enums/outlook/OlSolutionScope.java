package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olsolutionscope">https://docs.microsoft.com/en-us/office/vba/api/outlook.olsolutionscope</a>}
*/
public enum OlSolutionScope implements COMEnum {
    
    /**@ The solution root and its subfolders are displayed in the Solutions module and the Folder List. */
    olHideInDefaultModules(0),    
    /**@ The solution root and its subfolders are displayed in the Solutions module and the Folder List, as well as in their respective default modules. */
    olShowInDefaultModules(1);

    private final long value;

    OlSolutionScope(long value) {
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
