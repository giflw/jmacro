package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlthemecolor">https://docs.microsoft.com/en-us/office/vba/api/excel.xlthemecolor</a>}
*/
public enum XlThemeColor implements COMEnum {
    
    /**@ Accent1 */
    xlThemeColorAccent1(5),    
    /**@ Accent2 */
    xlThemeColorAccent2(6),    
    /**@ Accent3 */
    xlThemeColorAccent3(7),    
    /**@ Accent4 */
    xlThemeColorAccent4(8),    
    /**@ Accent5 */
    xlThemeColorAccent5(9),    
    /**@ Accent6 */
    xlThemeColorAccent6(10),    
    /**@ Dark1 */
    xlThemeColorDark1(1),    
    /**@ Dark2 */
    xlThemeColorDark2(3),    
    /**@ Followed hyperlink */
    xlThemeColorFollowedHyperlink(12),    
    /**@ Hyperlink */
    xlThemeColorHyperlink(11),    
    /**@ Light1 */
    xlThemeColorLight1(2),    
    /**@ Light2 */
    xlThemeColorLight2(4);

    private final long value;

    XlThemeColor(long value) {
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
