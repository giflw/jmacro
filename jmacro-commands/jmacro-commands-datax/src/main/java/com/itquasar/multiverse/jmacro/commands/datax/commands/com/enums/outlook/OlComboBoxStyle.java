package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olcomboboxstyle">https://docs.microsoft.com/en-us/office/vba/api/outlook.olcomboboxstyle</a>}
*/
public enum OlComboBoxStyle implements COMEnum {
    
    /**@ Indicates that the combo box behaves like a traditional combo box in which the user can type a value in the edit box or select a value from the drop-down list. */
    olComboBoxStyleCombo(0),    
    /**@ Indicates that the combo box behaves like a drop-down list from which the user can only select a value. */
    olComboBoxStyleList(1);

    private final long value;

    OlComboBoxStyle(long value) {
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
