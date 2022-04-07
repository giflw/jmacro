package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlxmlloadoption">https://docs.microsoft.com/en-us/office/vba/api/excel.xlxmlloadoption</a>}
*/
public enum XlXmlLoadOption implements COMEnum {
    
    /**@ Places the contents of the XML data file in an XML table. */
    xlXmlLoadImportToList(2),    
    /**@ Displays the schema of the XML data file in the XML Structure task pane. */
    xlXmlLoadMapXml(3),    
    /**@ Opens the XML data file. The contents of the file will be flattened. */
    xlXmlLoadOpenXml(1),    
    /**@ Prompts the user to choose how to open the file. */
    xlXmlLoadPromptUser(0);

    private final long value;

    XlXmlLoadOption(long value) {
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
