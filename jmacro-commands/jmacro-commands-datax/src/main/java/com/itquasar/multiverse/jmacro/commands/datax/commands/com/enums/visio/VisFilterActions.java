package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visfilteractions">https://docs.microsoft.com/en-us/office/vba/api/visio.visfilteractions</a>}
*/
public enum VisFilterActions implements COMEnum {
    
    /**@ Filter the DragBegin extension of the MouseMove event. */
    visFilterMouseMoveDragBegin(1),    
    /**@ Filter the DragDrop extension of the MouseMove event. */
    visFilterMouseMoveDragDrop(5),    
    /**@ Filter the DragEnter extension of the MouseMove event. */
    visFilterMouseMoveDragEnter(2),    
    /**@ Filter the DragLeave extension of the MouseMove event. */
    visFilterMouseMoveDragLeave(4),    
    /**@ Filter the DragOver extension of the MouseMove event. */
    visFilterMouseMoveDragOver(3),    
    /**@ Do not filter any extensions of the MouseMove event. */
    visFilterMouseMoveNoDrag(0);

    private final long value;

    VisFilterActions(long value) {
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
