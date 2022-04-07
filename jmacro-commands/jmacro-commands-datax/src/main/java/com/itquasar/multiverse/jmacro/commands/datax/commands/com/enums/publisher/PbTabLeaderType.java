package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbtableadertype">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbtableadertype</a>}
*/
public enum PbTabLeaderType implements COMEnum {
    
    /**@ Leader bullet tab */
    pbTabLeaderBullet(5),    
    /**@ Leader dashes tab */
    pbTabLeaderDashes(2),    
    /**@ Leader dot tab */
    pbTabLeaderDot(1),    
    /**@ Tab leader line */
    pbTabLeaderLine(3),    
    /**@ Tab leader none */
    pbTabLeaderNone(0);

    private final long value;

    PbTabLeaderType(long value) {
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
