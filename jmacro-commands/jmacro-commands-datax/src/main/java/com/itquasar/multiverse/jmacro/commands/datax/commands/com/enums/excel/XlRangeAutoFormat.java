package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlrangeautoformat">https://docs.microsoft.com/en-us/office/vba/api/excel.xlrangeautoformat</a>}
*/
public enum XlRangeAutoFormat implements COMEnum {
    
    /**@ 3D effects 1. */
    xlRangeAutoFormat3DEffects1(13),    
    /**@ 3D effects 2. */
    xlRangeAutoFormat3DEffects2(14),    
    /**@ Accounting 1. */
    xlRangeAutoFormatAccounting1(4),    
    /**@ Accounting 2. */
    xlRangeAutoFormatAccounting2(5),    
    /**@ Accounting 3. */
    xlRangeAutoFormatAccounting3(6),    
    /**@ Accounting 4. */
    xlRangeAutoFormatAccounting4(17),    
    /**@ Classic 1. */
    xlRangeAutoFormatClassic1(1),    
    /**@ Classic 2. */
    xlRangeAutoFormatClassic2(2),    
    /**@ Classic 3. */
    xlRangeAutoFormatClassic3(3),    
    /**@ Classic PivotTable. */
    xlRangeAutoFormatClassicPivotTable(31),    
    /**@ Color 1. */
    xlRangeAutoFormatColor1(7),    
    /**@ Color 2. */
    xlRangeAutoFormatColor2(8),    
    /**@ Color 3. */
    xlRangeAutoFormatColor3(9),    
    /**@ List 1. */
    xlRangeAutoFormatList1(10),    
    /**@ List 2. */
    xlRangeAutoFormatList2(11),    
    /**@ List 3. */
    xlRangeAutoFormatList3(12),    
    /**@ Local Format 1. */
    xlRangeAutoFormatLocalFormat1(15),    
    /**@ Local Format 2. */
    xlRangeAutoFormatLocalFormat2(16),    
    /**@ Local Format 3. */
    xlRangeAutoFormatLocalFormat3(19),    
    /**@ Local Format 4. */
    xlRangeAutoFormatLocalFormat4(20),    
    /**@ No specified format. */
    xlRangeAutoFormatNone(-4142),    
    /**@ No specified PivotTable format. */
    xlRangeAutoFormatPTNone(42),    
    /**@ Report 1. */
    xlRangeAutoFormatReport1(21),    
    /**@ Report 10. */
    xlRangeAutoFormatReport10(30),    
    /**@ Report 2. */
    xlRangeAutoFormatReport2(22),    
    /**@ Report 3. */
    xlRangeAutoFormatReport3(23),    
    /**@ Report 4. */
    xlRangeAutoFormatReport4(24),    
    /**@ Report 5. */
    xlRangeAutoFormatReport5(25),    
    /**@ Report 6. */
    xlRangeAutoFormatReport6(26),    
    /**@ Report 7. */
    xlRangeAutoFormatReport7(27),    
    /**@ Report 8. */
    xlRangeAutoFormatReport8(28),    
    /**@ Report 9. */
    xlRangeAutoFormatReport9(29),    
    /**@ Simple. */
    xlRangeAutoFormatSimple(-4154),    
    /**@ Table 1. */
    xlRangeAutoFormatTable1(32),    
    /**@ Table 10. */
    xlRangeAutoFormatTable10(41),    
    /**@ Table 2. */
    xlRangeAutoFormatTable2(33),    
    /**@ Table 3. */
    xlRangeAutoFormatTable3(34),    
    /**@ Table 4. */
    xlRangeAutoFormatTable4(35),    
    /**@ Table 5. */
    xlRangeAutoFormatTable5(36),    
    /**@ Table 6. */
    xlRangeAutoFormatTable6(37),    
    /**@ Table 7. */
    xlRangeAutoFormatTable7(38),    
    /**@ Table 8. */
    xlRangeAutoFormatTable8(39),    
    /**@ Table 9. */
    xlRangeAutoFormatTable9(40);

    private final long value;

    XlRangeAutoFormat(long value) {
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
