package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olautodiscoverconnectionmode">https://docs.microsoft.com/en-us/office/vba/api/outlook.olautodiscoverconnectionmode</a>}
*/
public enum OlAutoDiscoverConnectionMode implements COMEnum {
    
    /**@ Connection is over the Internet. */
    olAutoDiscoverConnectionExternal(1),    
    /**@ Connection is over the Intranet. */
    olAutoDiscoverConnectionInternal(2),    
    /**@ Connection is in the same domain over the Intranet. */
    olAutoDiscoverConnectionInternalDomain(3),    
    /**@ Other or unknown connection, or no connection. */
    olAutoDiscoverConnectionUnknown(0);

    private final long value;

    OlAutoDiscoverConnectionMode(long value) {
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
