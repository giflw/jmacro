package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acdefview">https://docs.microsoft.com/en-us/office/vba/api/access.acdefview</a>}
*/
public enum AcDefView implements COMEnum {
    
    /**@ The form displays multiple records (as many as will fit in the current window), each in its own copy of the form's detail section. */
    acDefViewContinuous(1),    
    /**@ Displays the form fields arranged in rows and columns like a spreadsheet. */
    acDefViewDatasheet(2),    
    /**@ Displays the form as a PivotChart. */
    acDefViewPivotChart(4),    
    /**@ Displays the form as a PivotTable. */
    acDefViewPivotTable(3),    
    /**@ (Default) Displays one record at a time. */
    acDefViewSingle(0),    
    /**@ Displays the form in Split Form view. */
    acDefViewSplitForm(5);

    private final long value;

    AcDefView(long value) {
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
