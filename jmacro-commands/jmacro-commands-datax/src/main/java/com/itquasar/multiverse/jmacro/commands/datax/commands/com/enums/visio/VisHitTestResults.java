package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.vishittestresults">https://docs.microsoft.com/en-us/office/vba/api/visio.vishittestresults</a>}
*/
public enum VisHitTestResults implements COMEnum {
    
    /**@ Hit position is inside shape boundary. */
    visHitInside(2),    
    /**@ Hit position is on shape boundary. */
    visHitOnBoundary(1),    
    /**@ Hit position is outside shape boundary. */
    visHitOutside(0);

    private final long value;

    VisHitTestResults(long value) {
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
