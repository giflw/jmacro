package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.vischarsbias">https://docs.microsoft.com/en-us/office/vba/api/visio.vischarsbias</a>}
*/
public enum VisCharsBias implements COMEnum {
    
    /**@ Specifies the ShapeSheet row that covers character formatting for the character to the left of the insertion point. */
    visBiasLeft(1),    
    /**@ Specifies that Microsoft Visio decide the kind of character formatting to apply based on certain rules. See the Characters.CharPropsRow property topic for more information. */
    visBiasLetVisioChoose(0),    
    /**@ Specifies the ShapeSheet row that covers character formatting for the character to the right of the insertion point. */
    visBiasRight(2);

    private final long value;

    VisCharsBias(long value) {
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
