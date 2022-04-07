package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjdateformat">https://docs.microsoft.com/en-us/office/vba/api/project.pjdateformat</a>}
*/
public enum PjDateFormat implements COMEnum {
    
    /**@ 30 */
    pjDate_dd(13),    
    /**@ Tue 30 */
    pjDate_ddd_dd(17),    
    /**@ Tue 12:33 PM */
    pjDate_ddd_hh_mmAM(11),    
    /**@ Tue 9/30 */
    pjDate_ddd_mm_dd(16),    
    /**@ Tue 9/30/02 */
    pjDate_ddd_mm_dd_yy(9),    
    /**@ Tue 9/30/02 12:33 PM */
    pjDate_ddd_mm_dd_yy_hh_mmAM(8),    
    /**@ Tue Sep 30 */
    pjDate_ddd_mmm_dd(15),    
    /**@ Tue Sep 30, '02 */
    pjDate_ddd_mmm_dd_yyy(10),    
    /**@ 12:33 PM */
    pjDate_hh_mmAM(14),    
    /**@ 9/30 */
    pjDate_mm_dd(12),    
    /**@ 9/30/02 */
    pjDate_mm_dd_yy(1),    
    /**@ 9/30/02 12:33 PM */
    pjDate_mm_dd_yy_hh_mmAM(0),    
    /**@ 9/30/2002 */
    pjDate_mm_dd_yyyy(20),    
    /**@ Sep 30 */
    pjDate_mmm_dd(7),    
    /**@ Sep 30 12:33 PM */
    pjDate_mmm_dd_hh_mmAM(4),    
    /**@ Sep 30, '02 */
    pjDate_mmm_dd_yyy(5),    
    /**@ September 30 */
    pjDate_mmmm_dd(6),    
    /**@ September 30, 2002 */
    pjDate_mmmm_dd_yyyy(3),    
    /**@ September 30, 2002 12:33 PM */
    pjDate_mmmm_dd_yyyy_hh_mmAM(2),    
    /**@ W41/2 */
    pjDate_Www_dd(18),    
    /**@ W41/2/02 12:33 PM */
    pjDate_Www_dd_yy_hh_mmAM(19),    
    /**@ The default format, as specified on the View tab of the Options dialog box. (To open the Options dialog box, click Options on the Tools menu.) */
    pjDateDefault(255);

    private final long value;

    PjDateFormat(long value) {
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
