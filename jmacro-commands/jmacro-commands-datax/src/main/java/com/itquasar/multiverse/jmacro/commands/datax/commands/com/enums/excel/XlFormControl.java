package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlformcontrol">https://docs.microsoft.com/en-us/office/vba/api/excel.xlformcontrol</a>}
*/
public enum XlFormControl implements COMEnum {
    
    /**@ Button. */
    xlButtonControl(0),    
    /**@ Check box. */
    xlCheckBox(1),    
    /**@ Combo box. */
    xlDropDown(2),    
    /**@ Text box. */
    xlEditBox(3),    
    /**@ Group box. */
    xlGroupBox(4),    
    /**@ Label. */
    xlLabel(5),    
    /**@ List box. */
    xlListBox(6),    
    /**@ Option button. */
    xlOptionButton(7),    
    /**@ Scroll bar. */
    xlScrollBar(8),    
    /**@ Spinner. */
    xlSpinner(9);

    private final long value;

    XlFormControl(long value) {
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
