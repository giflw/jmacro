package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbtableautoformattype">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbtableautoformattype</a>}
*/
public enum PbTableAutoFormatType implements COMEnum {
    
    /**@ Checkbook register */
    pbTableAutoFormatCheckbookRegister(0),    
    /**@ Checkerboard */
    pbTableAutoFormatCheckerboard(20),    
    /**@ Default */
    pbTableAutoFormatDefault(-3),    
    /**@ AutoFormatList1 */
    pbTableAutoFormatList1(1),    
    /**@ AutoFormatList2 */
    pbTableAutoFormatList2(2),    
    /**@ AutoFormatList3 */
    pbTableAutoFormatList3(3),    
    /**@ AutoFormatList4 */
    pbTableAutoFormatList4(4),    
    /**@ AutoFormatList5 */
    pbTableAutoFormatList5(5),    
    /**@ AutoFormatList6 */
    pbTableAutoFormatList6(6),    
    /**@ AutoFormatList7 */
    pbTableAutoFormatList7(7),    
    /**@ Auto Format List with Title1 */
    pbTableAutoFormatListWithTitle1(8),    
    /**@ Auto Format List with Title2 */
    pbTableAutoFormatListWithTitle2(9),    
    /**@ Auto Format List with Title3 */
    pbTableAutoFormatListWithTitle3(10),    
    /**@ Auto Format mixed */
    pbTableAutoFormatMixed(-1),    
    /**@ Auto Format none */
    pbTableAutoFormatNone(-2),    
    /**@ Auto Format Numbers1 */
    pbTableAutoFormatNumbers1(11),    
    /**@ Auto Format Numbers2 */
    pbTableAutoFormatNumbers2(12),    
    /**@ Auto Format Numbers3 */
    pbTableAutoFormatNumbers3(13),    
    /**@ Auto Format Numbers4 */
    pbTableAutoFormatNumbers4(14),    
    /**@ Auto Format Numbers5 */
    pbTableAutoFormatNumbers5(15),    
    /**@ Auto Format Numbers6 */
    pbTableAutoFormatNumbers6(16),    
    /**@ Auto Format Table Of Contents1 */
    pbTableAutoFormatTableOfContents1(17),    
    /**@ Auto Format Table Of Contents2 */
    pbTableAutoFormatTableOfContents2(18),    
    /**@ Auto Format Table Of Contents3 */
    pbTableAutoFormatTableOfContents3(19);

    private final long value;

    PbTableAutoFormatType(long value) {
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
