package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlpivotformattype">https://docs.microsoft.com/en-us/office/vba/api/excel.xlpivotformattype</a>}
*/
public enum XlPivotFormatType implements COMEnum {
    
    /**@ PivotTable classic format. */
    xlPTClassic(20),    
    /**@ Does not apply formatting to the PivotTable report. */
    xlPTNone(21),    
    /**@ Use the xlReport1 formatting for the PivotTable. */
    xlReport1(0),    
    /**@ Use the xlReport10 formatting for the PivotTable. */
    xlReport10(9),    
    /**@ Use the xlReport2 formatting for the PivotTable. */
    xlReport2(1),    
    /**@ Use the xlReport3 formatting for the PivotTable. */
    xlReport3(2),    
    /**@ Use the xlReport4 formatting for the PivotTable. */
    xlReport4(3),    
    /**@ Use the xlReport5 formatting for the PivotTable. */
    xlReport5(4),    
    /**@ Use the xlReport6 formatting for the PivotTable. */
    xlReport6(5),    
    /**@ Use the xlReport7 formatting for the PivotTable. */
    xlReport7(6),    
    /**@ Use the xlReport8 formatting for the PivotTable. */
    xlReport8(7),    
    /**@ Use the xlReport9 formatting for the PivotTable. */
    xlReport9(8),    
    /**@ Use the xlTable1 formatting for the PivotTable. */
    xlTable1(10),    
    /**@ Use the xlTable10 formatting for the PivotTable. */
    xlTable10(19),    
    /**@ Use the xlTable2 formatting for the PivotTable. */
    xlTable2(11),    
    /**@ Use the xlTable3 formatting for the PivotTable. */
    xlTable3(12),    
    /**@ Use the xlTable4 formatting for the PivotTable. */
    xlTable4(13),    
    /**@ Use the xlTable5 formatting for the PivotTable. */
    xlTable5(14),    
    /**@ Use the xlTable6 formatting for the PivotTable. */
    xlTable6(15),    
    /**@ Use the xlTable7 formatting for the PivotTable. */
    xlTable7(16),    
    /**@ Use the xlTable8 formatting for the PivotTable. */
    xlTable8(17),    
    /**@ Use the xlTable9 formatting for the PivotTable. */
    xlTable9(18);

    private final long value;

    XlPivotFormatType(long value) {
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
