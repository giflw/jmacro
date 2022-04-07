package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visquickstylematrixindices">https://docs.microsoft.com/en-us/office/vba/api/visio.visquickstylematrixindices</a>}
*/
public enum VisQuickStyleMatrixIndices implements COMEnum {
    
    /**@ No matrix theme */
    visQuickStyleMatrixNone(0),    
    /**@ Matrix theme 1 */
    visQuickStyleMatrixTheme1(1),    
    /**@ Matrix theme 2 */
    visQuickStyleMatrixTheme2(2),    
    /**@ Matrix theme 3 */
    visQuickStyleMatrixTheme3(3),    
    /**@ Matrix theme 4 */
    visQuickStyleMatrixTheme4(4),    
    /**@ Matrix theme 5 */
    visQuickStyleMatrixTheme5(5),    
    /**@ Matrix theme 6 */
    visQuickStyleMatrixTheme6(6),    
    /**@ Matrix variant 1 */
    visQuickStyleMatrixVariant1(100),    
    /**@ Matrix variant 2 */
    visQuickStyleMatrixVariant2(101),    
    /**@ Matrix variant 3 */
    visQuickStyleMatrixVariant3(102),    
    /**@ Matrix variant 4 */
    visQuickStyleMatrixVariant4(103);

    private final long value;

    VisQuickStyleMatrixIndices(long value) {
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
