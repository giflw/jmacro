package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.vismousemovedragstates">https://docs.microsoft.com/en-us/office/vba/api/visio.vismousemovedragstates</a>}
*/
public enum VisMouseMoveDragStates implements COMEnum {
    
    /**@ User is beginning to drag an object with the mouse. */
    visMouseMoveDragStatesBegin(1),    
    /**@ User dropped the dragged object in the drop-target window. */
    visMouseMoveDragStatesDrop(5),    
    /**@ User is dragging an object into the drop-target window with the mouse. */
    visMouseMoveDragStatesEnter(2),    
    /**@ User is moving the mouse out of the drop-target window. */
    visMouseMoveDragStatesLeave(4),    
    /**@ Either not a mouse movement or a mouse movement that is not a drag operation. */
    visMouseMoveDragStatesNone(0),    
    /**@ User is moving the dragged object within the drop-target window with the mouse. */
    visMouseMoveDragStatesOver(3);

    private final long value;

    VisMouseMoveDragStates(long value) {
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
