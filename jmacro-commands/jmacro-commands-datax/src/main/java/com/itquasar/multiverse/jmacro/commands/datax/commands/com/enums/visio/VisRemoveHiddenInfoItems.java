package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visremovehiddeninfoitems">https://docs.microsoft.com/en-us/office/vba/api/visio.visremovehiddeninfoitems</a>}
*/
public enum VisRemoveHiddenInfoItems implements COMEnum {
    
    /**@ Data recordsets. */
    visRHIDataRecordsets(16),    
    /**@ Unused masters */
    visRHIMasters(4),    
    /**@ No information. */
    visRHINone(0),    
    /**@ Personal information. */
    visRHIPersonalInfo(1),    
    /**@ Preview thumbnail. */
    visRHIPreview(2),    
    /**@ Unused styles and display formats. */
    visRHIStyles(8),    
    /**@ Validation rules. */
    visRHIValidationRules(32);

    private final long value;

    VisRemoveHiddenInfoItems(long value) {
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
