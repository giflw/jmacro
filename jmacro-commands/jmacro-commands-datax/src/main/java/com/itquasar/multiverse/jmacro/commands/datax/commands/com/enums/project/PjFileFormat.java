package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjfileformat">https://docs.microsoft.com/en-us/office/vba/api/project.pjfileformat</a>}
*/
public enum PjFileFormat implements COMEnum {
    
    /**@ Comma separated value (CSV) file. */
    pjCSV(4),    
    /**@ Project or Project file. */
    pjMPP(0),    
    /**@ Office Project 2007 */
    pjMPP12(23),    
    /**@ Project 98, Project 2000, Project 2002, or Office Project 2003 file. */
    pjMPP9(22),    
    /**@ Project template. */
    pjMPT(11),    
    /**@ Text file. */
    pjTXT(3),    
    /**@ Excel workbook. */
    pjXLS(5),    
    /**@ Excel binary file. */
    pjXLSB(21),    
    /**@ Excel OpenXML format file. */
    pjXLSX(20);

    private final long value;

    PjFileFormat(long value) {
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
