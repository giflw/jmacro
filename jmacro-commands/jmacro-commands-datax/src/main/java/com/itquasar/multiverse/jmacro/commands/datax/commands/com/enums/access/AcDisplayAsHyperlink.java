package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acdisplayashyperlink">https://docs.microsoft.com/en-us/office/vba/api/access.acdisplayashyperlink</a>}
*/
public enum AcDisplayAsHyperlink implements COMEnum {
    
    /**@ Always display the contents of the control as a hyperlink. */
    acDisplayAsHyperlinkAlways(1),    
    /**@ Display the contents of the control as a hyperlink only when its contents are in the form of a Uniform Resource Locator (URL). */
    acDisplayAsHyperlinkIfHlink(0),    
    /**@ Display the contents of the control as a hyperlink only on the screen. */
    acDisplayAsHyperlinkOnScreenOnly(2);

    private final long value;

    AcDisplayAsHyperlink(long value) {
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
