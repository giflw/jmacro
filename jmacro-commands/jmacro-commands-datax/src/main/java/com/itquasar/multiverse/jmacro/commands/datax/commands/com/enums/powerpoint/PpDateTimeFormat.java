package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppdatetimeformat">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppdatetimeformat</a>}
*/
public enum PpDateTimeFormat implements COMEnum {
    
    /**@ ddddMMMMddyyyy */
    ppDateTimeddddMMMMddyyyy(2),    
    /**@ dMMMMyyyy */
    ppDateTimedMMMMyyyy(3),    
    /**@ dMMMyy */
    ppDateTimedMMMyy(5),    
    /**@ Figure Out */
    ppDateTimeFigureOut(14),    
    /**@ Mixed Format */
    ppDateTimeFormatMixed(-2),    
    /**@ Hmm */
    ppDateTimeHmm(10),    
    /**@ hmmAMPM */
    ppDateTimehmmAMPM(12),    
    /**@ Hmmss */
    ppDateTimeHmmss(11),    
    /**@ hmmssAMPM */
    ppDateTimehmmssAMPM(13),    
    /**@ Mdyy */
    ppDateTimeMdyy(1),    
    /**@ MMddyyHmm */
    ppDateTimeMMddyyHmm(8),    
    /**@ MMddyyhmmAMPM */
    ppDateTimeMMddyyhmmAMPM(9),    
    /**@ MMMMdyyyy */
    ppDateTimeMMMMdyyyy(4),    
    /**@ MMMMyy */
    ppDateTimeMMMMyy(6),    
    /**@ MMyy */
    ppDateTimeMMyy(7);

    private final long value;

    PpDateTimeFormat(long value) {
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
