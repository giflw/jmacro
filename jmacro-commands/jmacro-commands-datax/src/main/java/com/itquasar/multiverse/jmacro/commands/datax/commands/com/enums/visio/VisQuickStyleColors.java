package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visquickstylecolors">https://docs.microsoft.com/en-us/office/vba/api/visio.visquickstylecolors</a>}
*/
public enum VisQuickStyleColors implements COMEnum {
    
    /**@ Color accent 1 */
    visQuickStyleColorAccent1(2),    
    /**@ Color accent 2 */
    visQuickStyleColorAccent2(3),    
    /**@ Color accent 3 */
    visQuickStyleColorAccent3(4),    
    /**@ Color accent 4 */
    visQuickStyleColorAccent4(5),    
    /**@ Color accent 5 */
    visQuickStyleColorAccent5(6),    
    /**@ Color accent 6 */
    visQuickStyleColorAccent6(7),    
    /**@ Background color */
    visQuickStyleColorBackground(8),    
    /**@ Dark color */
    visQuickStyleColorDark(0),    
    /**@ Light color */
    visQuickStyleColorLight(1),    
    /**@ Color variant 1 */
    visQuickStyleColorVariant1(100),    
    /**@ Color variant 2 */
    visQuickStyleColorVariant2(101),    
    /**@ Color variant 3 */
    visQuickStyleColorVariant3(102),    
    /**@ Color variant 4 */
    visQuickStyleColorVariant4(103),    
    /**@ Color variant 5 */
    visQuickStyleColorVariant5(104),    
    /**@ Color variant 6 */
    visQuickStyleColorVariant6(105),    
    /**@ Color variant 7 */
    visQuickStyleColorVariant7(106);

    private final long value;

    VisQuickStyleColors(long value) {
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
