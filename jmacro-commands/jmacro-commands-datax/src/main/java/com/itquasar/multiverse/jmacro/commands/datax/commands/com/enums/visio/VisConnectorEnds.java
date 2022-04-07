package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visconnectorends">https://docs.microsoft.com/en-us/office/vba/api/visio.visconnectorends</a>}
*/
public enum VisConnectorEnds implements COMEnum {
    
    /**@ The begin point of the connector. */
    visConnectorBeginpoint(0),    
    /**@ The end point of the connector. */
    visConnectorEndPoint(1),    
    /**@ Both the begin point and the end point of the connector. */
    visConnectorBothEnds(2);

    private final long value;

    VisConnectorEnds(long value) {
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
