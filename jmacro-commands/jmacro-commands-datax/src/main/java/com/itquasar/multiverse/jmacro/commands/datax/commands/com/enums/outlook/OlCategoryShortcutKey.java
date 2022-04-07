package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olcategoryshortcutkey">https://docs.microsoft.com/en-us/office/vba/api/outlook.olcategoryshortcutkey</a>}
*/
public enum OlCategoryShortcutKey implements COMEnum {
    
    /**@ CTRL+F10 */
    olCategoryShortcutKeyCtrlF10(10),    
    /**@ CTRL+F11 */
    olCategoryShortcutKeyCtrlF11(11),    
    /**@ CTRL+F12 */
    olCategoryShortcutKeyCtrlF12(12),    
    /**@ CTRL+F2 */
    olCategoryShortcutKeyCtrlF2(2),    
    /**@ CTRL+F3 */
    olCategoryShortcutKeyCtrlF3(3),    
    /**@ CTRL+F4 */
    olCategoryShortcutKeyCtrlF4(4),    
    /**@ CTRL+F5 */
    olCategoryShortcutKeyCtrlF5(5),    
    /**@ CTRL+F6 */
    olCategoryShortcutKeyCtrlF6(6),    
    /**@ CTRL+F7 */
    olCategoryShortcutKeyCtrlF7(7),    
    /**@ CTRL+F8 */
    olCategoryShortcutKeyCtrlF8(8),    
    /**@ CTRL+F9 */
    olCategoryShortcutKeyCtrlF9(9),    
    /**@ No shortcut key specified. */
    olCategoryShortcutKeyNone(0);

    private final long value;

    OlCategoryShortcutKey(long value) {
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
