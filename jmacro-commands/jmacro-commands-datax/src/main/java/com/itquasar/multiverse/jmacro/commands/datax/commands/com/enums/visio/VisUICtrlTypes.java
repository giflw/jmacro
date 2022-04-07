package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visuictrltypes">https://docs.microsoft.com/en-us/office/vba/api/visio.visuictrltypes</a>}
*/
public enum VisUICtrlTypes implements COMEnum {
    
    /**@ Owner-draw push button. */
    visCtrlTypeBUTTON_OWNERDRAW(33),    
    /**@ Push button. */
    visCtrlTypeBUTTON(2),    
    /**@ Combo box. */
    visCtrlTypeCOMBOBOX(128),    
    /**@ Drop-down combo box. */
    visCtrlTypeDROPDOWN(272),    
    /**@ Text box. */
    visCtrlTypeEDITBOX(64),    
    /**@ Label. */
    visCtrlTypeLABEL(2048),    
    /**@ Split button, with MRU color behavior. */
    visCtrlTypeSPLITBUTTON_MRU_COLOR(16),    
    /**@ Split button, with MRU command behavior. */
    visCtrlTypeSPLITBUTTON_MRU_COMMAND(18),    
    /**@ Split button. */
    visCtrlTypeSPLITBUTTON(17);

    private final long value;

    VisUICtrlTypes(long value) {
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
