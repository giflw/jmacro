package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.viscontainerflags">https://docs.microsoft.com/en-us/office/vba/api/visio.viscontainerflags</a>}
*/
public enum VisContainerFlags implements COMEnum {
    
    /**@ Returns all shape types and includes items in nested containers. */
    visContainerFlagsDefault(0),    
    /**@ Excludes member shapes that are containers. */
    visContainerFlagsExcludeContainers(1),    
    /**@ Excludes member shapes that are connectors. */
    visContainerFlagsExcludeConnectors(2),    
    /**@ Excludes member shapes that are callouts. */
    visContainerFlagsExcludeCallouts(4),    
    /**@ Excludes member shapes that are not containers, connectors, or callouts. */
    visContainerFlagsExcludeElements(8),    
    /**@ Excludes any member shapes that are members of containers nested within the container. */
    visContainerFlagsExcludeNested(16),    
    /**@ Excludes members of a list container that are explicitly members of the list. Does not exclude other shapes in the list container. */
    visContainerFlagsExcludeListMembers(32);

    private final long value;

    VisContainerFlags(long value) {
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
