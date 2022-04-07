package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdtableformat">https://docs.microsoft.com/en-us/office/vba/api/word.wdtableformat</a>}
*/
public enum WdTableFormat implements COMEnum {
    
    /**@ 3D effects format number 1. */
    wdTableFormat3DEffects1(32),    
    /**@ 3D effects format number 2. */
    wdTableFormat3DEffects2(33),    
    /**@ 3D effects format number 3. */
    wdTableFormat3DEffects3(34),    
    /**@ Classic format number 1. */
    wdTableFormatClassic1(4),    
    /**@ Classic format number 2. */
    wdTableFormatClassic2(5),    
    /**@ Classic format number 3. */
    wdTableFormatClassic3(6),    
    /**@ Classic format number 4. */
    wdTableFormatClassic4(7),    
    /**@ Colorful format number 1. */
    wdTableFormatColorful1(8),    
    /**@ Colorful format number 2. */
    wdTableFormatColorful2(9),    
    /**@ Colorful format number 3. */
    wdTableFormatColorful3(10),    
    /**@ Columns format number 1. */
    wdTableFormatColumns1(11),    
    /**@ Columns format number 2. */
    wdTableFormatColumns2(12),    
    /**@ Columns format number 3. */
    wdTableFormatColumns3(13),    
    /**@ Columns format number 4. */
    wdTableFormatColumns4(14),    
    /**@ Columns format number 5. */
    wdTableFormatColumns5(15),    
    /**@ Contemporary format. */
    wdTableFormatContemporary(35),    
    /**@ Elegant format. */
    wdTableFormatElegant(36),    
    /**@ Grid format number 1. */
    wdTableFormatGrid1(16),    
    /**@ Grid format number 2. */
    wdTableFormatGrid2(17),    
    /**@ Grid format number 3. */
    wdTableFormatGrid3(18),    
    /**@ Grid format number 4. */
    wdTableFormatGrid4(19),    
    /**@ Grid format number 5. */
    wdTableFormatGrid5(20),    
    /**@ Grid format number 6. */
    wdTableFormatGrid6(21),    
    /**@ Grid format number 7. */
    wdTableFormatGrid7(22),    
    /**@ Grid format number 8. */
    wdTableFormatGrid8(23),    
    /**@ List format number 1. */
    wdTableFormatList1(24),    
    /**@ List format number 2. */
    wdTableFormatList2(25),    
    /**@ List format number 3. */
    wdTableFormatList3(26),    
    /**@ List format number 4. */
    wdTableFormatList4(27),    
    /**@ List format number 5. */
    wdTableFormatList5(28),    
    /**@ List format number 6. */
    wdTableFormatList6(29),    
    /**@ List format number 7. */
    wdTableFormatList7(30),    
    /**@ List format number 8. */
    wdTableFormatList8(31),    
    /**@ No formatting. */
    wdTableFormatNone(0),    
    /**@ Professional format. */
    wdTableFormatProfessional(37),    
    /**@ Simple format number 1. */
    wdTableFormatSimple1(1),    
    /**@ Simple format number 2. */
    wdTableFormatSimple2(2),    
    /**@ Simple format number 3. */
    wdTableFormatSimple3(3),    
    /**@ Subtle format number 1. */
    wdTableFormatSubtle1(38),    
    /**@ Subtle format number 2. */
    wdTableFormatSubtle2(39),    
    /**@ Web format number 1. */
    wdTableFormatWeb1(40),    
    /**@ Web format number 2. */
    wdTableFormatWeb2(41),    
    /**@ Web format number 3. */
    wdTableFormatWeb3(42);

    private final long value;

    WdTableFormat(long value) {
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
