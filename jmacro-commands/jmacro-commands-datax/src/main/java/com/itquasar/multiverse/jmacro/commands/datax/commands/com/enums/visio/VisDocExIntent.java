package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visdocexintent">https://docs.microsoft.com/en-us/office/vba/api/visio.visdocexintent</a>}
*/
public enum VisDocExIntent implements COMEnum {
    
    /**@ Intent is to publish online and to print. */
    visDocExIntentPrint(1),    
    /**@ Intent is to publish online. */
    visDocExIntentScreen(0);

    private final long value;

    VisDocExIntent(long value) {
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
