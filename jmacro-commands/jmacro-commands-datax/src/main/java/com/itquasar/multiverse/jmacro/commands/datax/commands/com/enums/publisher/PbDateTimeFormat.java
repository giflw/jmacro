package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbdatetimeformat">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbdatetimeformat</a>}
*/
public enum PbDateTimeFormat implements COMEnum {
    
    /**@ English */
    pbDateEnglish(8),    
    /**@ ISO */
    pbDateISO(4),    
    /**@ Long */
    pbDateLong(2),    
    /**@ Long Day */
    pbDateLongDay(1),    
    /**@ Month or Year */
    pbDateMon_Yr(10),    
    /**@ Month and Year */
    pbDateMonthYr(9),    
    /**@ Short */
    pbDateShort(0),    
    /**@ Short Abb */
    pbDateShortAbb(7),    
    /**@ Short Alt */
    pbDateShortAlt(3),    
    /**@ Short Month */
    pbDateShortMon(5),    
    /**@ Short Slash */
    pbDateShortSlash(6),    
    /**@ East Asia 1 */
    pbDateTimeEastAsia1(17),    
    /**@ East Asia 2 */
    pbDateTimeEastAsia2(18),    
    /**@ East Asia 3 */
    pbDateTimeEastAsia3(19),    
    /**@ East Asia 4 */
    pbDateTimeEastAsia4(20),    
    /**@ East Asia 5 */
    pbDateTimeEastAsia5(21),    
    /**@ 24 hours */
    pbTime24(15),    
    /**@ Date/Time in A.M./P.M. format */
    pbTimeDatePM(11),    
    /**@ Date/Time/Second in A.M./P.M. format */
    pbTimeDateSecPM(12),    
    /**@ Time in A.M./P.M. format */
    pbTimePM(13),    
    /**@ Time in 24-hour format */
    pbTimeSec24(16),    
    /**@ Time including seconds in A.M./P.M. format */
    pbTimeSecPM(14);

    private final long value;

    PbDateTimeFormat(long value) {
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
