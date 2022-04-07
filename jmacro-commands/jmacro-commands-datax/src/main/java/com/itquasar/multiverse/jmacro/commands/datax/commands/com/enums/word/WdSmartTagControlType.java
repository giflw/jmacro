package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdsmarttagcontroltype">https://docs.microsoft.com/en-us/office/vba/api/word.wdsmarttagcontroltype</a>}
*/
public enum WdSmartTagControlType implements COMEnum {
    
    /**@ ActiveX control. */
    wdControlActiveX(13),    
    /**@ Button. */
    wdControlButton(6),    
    /**@ Check box. */
    wdControlCheckbox(9),    
    /**@ Combo box. */
    wdControlCombo(12),    
    /**@ Document fragment. */
    wdControlDocumentFragment(14),    
    /**@ Document fragment URL. */
    wdControlDocumentFragmentURL(15),    
    /**@ Help. */
    wdControlHelp(3),    
    /**@ Help URL. */
    wdControlHelpURL(4),    
    /**@ Image. */
    wdControlImage(8),    
    /**@ Label. */
    wdControlLabel(7),    
    /**@ Link. */
    wdControlLink(2),    
    /**@ List box. */
    wdControlListbox(11),    
    /**@ Radio group. */
    wdControlRadioGroup(16),    
    /**@ Separator. */
    wdControlSeparator(5),    
    /**@ Smart tag. */
    wdControlSmartTag(1),    
    /**@ Text box. */
    wdControlTextbox(10);

    private final long value;

    WdSmartTagControlType(long value) {
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
