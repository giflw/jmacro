package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.oldragbehavior">https://docs.microsoft.com/en-us/office/vba/api/outlook.oldragbehavior</a>}
*/
public enum OlDragBehavior implements COMEnum {
    
    /**@ The control does not support drag-and-drop activities. It will always display the "no" cursor when an item is dragged over the control. */
    olDragBehaviorDisabled(0),    
    /**@ The control can support drag-and-drop activities. Use the drag and drop events to control this behavior. */
    olDragBehaviorEnabled(1);

    private final long value;

    OlDragBehavior(long value) {
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
