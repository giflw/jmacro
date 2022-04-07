package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visconnectedshapesflags">https://docs.microsoft.com/en-us/office/vba/api/visio.visconnectedshapesflags</a>}
*/
public enum VisConnectedShapesFlags implements COMEnum {
    
    /**@ The shapes that are connected by using either incoming or outgoing connections. */
    visConnectedShapesAllNodes(0),    
    /**@ The shapes that are connected by using incoming connections. */
    visConnectedShapesIncomingNodes(1),    
    /**@ The shapes that are connected by using outgoing connections. */
    visConnectedShapesOutgoingNodes(2);

    private final long value;

    VisConnectedShapesFlags(long value) {
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
