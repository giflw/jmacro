package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olmultiselect">https://docs.microsoft.com/en-us/office/vba/api/outlook.olmultiselect</a>}
*/
public enum OlMultiSelect implements COMEnum {
    
    /**@ Supports SHIFT and CTRL to select one or more items at a time. Pressing SHIFT and clicking the mouse, or pressing SHIFT and one of the arrow keys, extends the selection from the previously selected item to the current item. Pressing CTRL and clicking the mouse toggles the selection of an item. */
    olMultiSelectExtended(2),    
    /**@ Supports selection of one or more items at a time. Pressing SPACEBAR or clicking the mouse toggles the selection of an item in the list. */
    olMultiSelectMulti(1),    
    /**@ Supports selection of only one item at a time. */
    olMultiSelectSingle(0);

    private final long value;

    OlMultiSelect(long value) {
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
