package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdcontentcontroltype">https://docs.microsoft.com/en-us/office/vba/api/word.wdcontentcontroltype</a>}
*/
public enum WdContentControlType implements COMEnum {
    
    /**@ Specifies a building block gallery content control. */
    wdContentControlBuildingBlockGallery(5),    
    /**@ Specifies a checkbox content control. */
    wdContentControlCheckbox(8),    
    /**@ Specifies a combo box content control. */
    wdContentControlComboBox(3),    
    /**@ Specifies a date content control. */
    wdContentControlDate(6),    
    /**@ Specifies a group content control. */
    wdContentControlGroup(7),    
    /**@ Specifies a drop-down list content control. */
    wdContentControlDropdownList(4),    
    /**@ Specifies a picture content control. */
    wdContentControlPicture(2),    
    /**@ Specifies a repeating section content control. */
    wdContentControlRepeatingSection(9),    
    /**@ Specifies a rich-text content control. */
    wdContentControlRichText(0),    
    /**@ Specifies a text content control */
    wdContentControlText(1);

    private final long value;

    WdContentControlType(long value) {
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
