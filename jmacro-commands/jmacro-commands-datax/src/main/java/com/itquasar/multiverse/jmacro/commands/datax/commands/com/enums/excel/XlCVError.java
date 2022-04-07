package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlcverror">https://docs.microsoft.com/en-us/office/vba/api/excel.xlcverror</a>}
*/
public enum XlCVError implements COMEnum {
    
    /**@ Error number: 2007 */
    xlErrDiv0(2007),    
    /**@ Error number: 2042 */
    xlErrNA(2042),    
    /**@ Error number: 2029 */
    xlErrName(2029),    
    /**@ Error number: 2000 */
    xlErrNull(2000),    
    /**@ Error number: 2036 */
    xlErrNum(2036),    
    /**@ Error number: 2023 */
    xlErrRef(2023),    
    /**@ Error number: 2015 */
    xlErrValue(2015);

    private final long value;

    XlCVError(long value) {
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
