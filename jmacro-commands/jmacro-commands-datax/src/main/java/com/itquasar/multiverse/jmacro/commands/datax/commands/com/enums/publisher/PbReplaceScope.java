package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbreplacescope">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbreplacescope</a>}
*/
public enum PbReplaceScope implements COMEnum {
    
    /**@ All need to be replaced. */
    pbReplaceScopeAll(2),    
    /**@ None need to be replaced. */
    pbReplaceScopeNone(0),    
    /**@ One needs to be replaced. */
    pbReplaceScopeOne(1);

    private final long value;

    PbReplaceScope(long value) {
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
