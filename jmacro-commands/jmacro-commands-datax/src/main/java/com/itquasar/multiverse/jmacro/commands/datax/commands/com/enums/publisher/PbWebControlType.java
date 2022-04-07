package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbwebcontroltype">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbwebcontroltype</a>}
*/
public enum PbWebControlType implements COMEnum {
    
    /**@ Adds a check box. */
    pbWebControlCheckBox(100),    
    /**@ Adds a command button. */
    pbWebControlCommandButton(101),    
    /**@ Adds a hot spot. */
    pbWebControlHotSpot(110),    
    /**@ Adds an HTML fragment. */
    pbWebControlHTMLFragment(107),    
    /**@ Adds a list box. */
    pbWebControlListBox(102),    
    /**@ Adds a multiple-line text area. */
    pbWebControlMultiLineTextBox(103),    
    /**@ Adds an option button. */
    pbWebControlOptionButton(104),    
    /**@ Adds a single-line text box. */
    pbWebControlSingleLineTextBox(105),    
    /**@ Adds a single-line Web component. */
    pbWebControlWebComponent(106);

    private final long value;

    PbWebControlType(long value) {
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
