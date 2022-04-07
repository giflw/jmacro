package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visruletargets">https://docs.microsoft.com/en-us/office/vba/api/visio.visruletargets</a>}
*/
public enum VisRuleTargets implements COMEnum {
    
    /**@ The rule applies to the document itself. */
    visRuleTargetDocument(2),    
    /**@ The rule applies to pages in the document. */
    visRuleTargetPage(1),    
    /**@ The rule applies to shapes in the document. */
    visRuleTargetShape(0);

    private final long value;

    VisRuleTargets(long value) {
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
