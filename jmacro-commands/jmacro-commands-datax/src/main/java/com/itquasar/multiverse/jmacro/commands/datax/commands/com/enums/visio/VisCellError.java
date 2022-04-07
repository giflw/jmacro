package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.viscellerror">https://docs.microsoft.com/en-us/office/vba/api/visio.viscellerror</a>}
*/
public enum VisCellError implements COMEnum {
    
    /**@ Division by zero. */
    visErrorDivideByZero(39),    
    /**@ Invalid name in cell formula. */
    visErrorName(61),    
    /**@ Unknown error. */
    visErrorNotAvailable(74),    
    /**@ Invalid number in cell formula. */
    visErrorNumber(68),    
    /**@ Invalid reference in cell formula. */
    visErrorReference(55),    
    /**@ No error. */
    visErrorSuccess(0),    
    /**@ Invalid value in cell formula. */
    visErrorValue(47);

    private final long value;

    VisCellError(long value) {
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
