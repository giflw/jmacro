package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.accontroltype">https://docs.microsoft.com/en-us/office/vba/api/access.accontroltype</a>}
*/
public enum AcControlType implements COMEnum {
    
    /**@ Attachment control */
    acAttachment(126),    
    /**@ BoundObjectFrame control */
    acBoundObjectFrame(108),    
    /**@ CheckBox control */
    acCheckBox(106),    
    /**@ ComboBox control */
    acComboBox(111),    
    /**@ CommandButton control */
    acCommandButton(104),    
    /**@ ActiveX control */
    acCustomControl(119),    
    /**@ EmptyCell control */
    acEmptyCell(127),    
    /**@ Image control */
    acImage(103),    
    /**@ Label control */
    acLabel(100),    
    /**@ Line control */
    acLine(102),    
    /**@ ListBox control */
    acListBox(110),    
    /**@ NavigationButton control */
    acNavigationButton(130),    
    /**@ NavigationControl control */
    acNavigationControl(129),    
    /**@ Unbound ObjectFrame control */
    acObjectFrame(114),    
    /**@ OptionButton control */
    acOptionButton(105),    
    /**@ OptionGroup control */
    acOptionGroup(107),    
    /**@ Page control */
    acPage(124),    
    /**@ PageBreak control */
    acPageBreak(118),    
    /**@ Rectangle control */
    acRectangle(101),    
    /**@ SubForm control */
    acSubForm(112),    
    /**@ Tab control */
    acTabCtl(123),    
    /**@ TextBox control */
    acTextBox(109),    
    /**@ ToggleButton control */
    acToggleButton(122),    
    /**@ WebBrowserControl control */
    acWebBrowser(128);

    private final long value;

    AcControlType(long value) {
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
