package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbparagraphalignmenttype">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbparagraphalignmenttype</a>}
*/
public enum PbParagraphAlignmentType implements COMEnum {
    
    /**@ Center alignment */
    pbParagraphAlignmentCenter(1),    
    /**@ Distribute alignment */
    pbParagraphAlignmentDistribute(4),    
    /**@ Distribute all */
    pbParagraphAlignmentDistributeAll(9),    
    /**@ Distribute center last */
    pbParagraphAlignmentDistributeCenterLast(10),    
    /**@ Distribute East Asia */
    pbParagraphAlignmentDistributeEastAsia(5),    
    /**@ Inter Cluster */
    pbParagraphAlignmentInterCluster(8),    
    /**@ Inter Ideograph */
    pbParagraphAlignmentInterIdeograph(7),    
    /**@ Inter Word */
    pbParagraphAlignmentInterWord(3),    
    /**@ Justified */
    pbParagraphAlignmentJustified(6),    
    /**@ Kashida */
    pbParagraphAlignmentKashida(11),    
    /**@ Left alignment */
    pbParagraphAlignmentLeft(0),    
    /**@ Mixed alignment */
    pbParagraphAlignmentMixed(-9999999),    
    /**@ Right alignment */
    pbParagraphAlignmentRight(2);

    private final long value;

    PbParagraphAlignmentType(long value) {
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
