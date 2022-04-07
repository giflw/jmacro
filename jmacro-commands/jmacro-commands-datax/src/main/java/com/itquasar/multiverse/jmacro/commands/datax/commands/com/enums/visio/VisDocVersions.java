package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visdocversions">https://docs.microsoft.com/en-us/office/vba/api/visio.visdocversions</a>}
*/
public enum VisDocVersions implements COMEnum {
    
    /**@ Visio version 2000 or 2002 document. */
    visVersion100(393216),    
    /**@ Visio 1.0 document. */
    visVersion10(65571),    
    /**@ Visio 2003, Visio 2007, or Visio 2010 document. */
    visVersion110(720896),    
    /**@ Visio 2003, Visio 2007, or Visio 2010 document. */
    visVersion120(720896),    
    /**@ Visio 2003, Visio 2007, or Visio 2010 document. */
    visVersion140(720896),    
    /**@ Visio document. */
    visVersion150(983040),    
    /**@ Visio 2.0 document. */
    visVersion20(131072),    
    /**@ Visio 3.0 document. */
    visVersion30(196611),    
    /**@ Visio 4.x document. */
    visVersion40(262144),    
    /**@ Visio 5.0 document. */
    visVersion50(327680),    
    /**@ Visio version 2000 or 2002 document. */
    visVersion60(393216),    
    /**@ Visio version number of an unsaved document. */
    visVersionUnsaved(0);

    private final long value;

    VisDocVersions(long value) {
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
