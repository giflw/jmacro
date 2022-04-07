package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olmousepointer">https://docs.microsoft.com/en-us/office/vba/api/outlook.olmousepointer</a>}
*/
public enum OlMousePointer implements COMEnum {
    
    /**@ The cursor is the arrow and the hourglass, representing that the application is starting. */
    olMousePointerAppStarting(13),    
    /**@ The cursor is the standard arrow. */
    olMousePointerArrow(1),    
    /**@ The cursor is the cross. */
    olMousePointerCross(2),    
    /**@ The cursor is represented by the custom cursor bitmap. */
    olMousePointerCustom(99),    
    /**@ The default cursor. */
    olMousePointerDefault(0),    
    /**@ The cursor is the What's This help cursor. */
    olMousePointerHelp(14),    
    /**@ The cursor is the hourglass, representing that the application is busy. */
    olMousePointerHourGlass(11),    
    /**@ The cursor is the I-beam text entry cursor. */
    olMousePointerIBeam(3),    
    /**@ The cursor is the no-drop cursor. */
    olMousePointerNoDrop(12),    
    /**@ Resize cursor in all directions. */
    olMousePointerSizeAll(15),    
    /**@ Resize cursor from Northeast to Southwest. */
    olMousePointerSizeNESW(6),    
    /**@ Resize cursor from North to South. */
    olMousePointerSizeNS(7),    
    /**@ Resize cursor from Northwest to Southeast. */
    olMousePointerSizeNWSE(8),    
    /**@ Resize cursor from West to East. */
    olMousePointerSizeWE(9),    
    /**@ The cursor is the vertical arrow. */
    olMousePointerUpArrow(10);

    private final long value;

    OlMousePointer(long value) {
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
