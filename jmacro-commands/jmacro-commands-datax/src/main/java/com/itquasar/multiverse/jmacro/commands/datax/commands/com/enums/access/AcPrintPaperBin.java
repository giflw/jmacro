package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.access;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/access.acprintpaperbin">https://docs.microsoft.com/en-us/office/vba/api/access.acprintpaperbin</a>}
*/
public enum AcPrintPaperBin implements COMEnum {
    
    /**@ (Default) Use paper from the current default bin. */
    acPRBNAuto(7),    
    /**@ Use paper from the attached cassette cartridge. */
    acPRBNCassette(14),    
    /**@ Use envelopes from the envelope feeder. */
    acPRBNEnvelope(5),    
    /**@ Use envelopes from the envelope feeder, but wait for manual insertion. */
    acPRBNEnvManual(6),    
    /**@ Use paper from the forms bin. */
    acPRBNFormSource(15),    
    /**@ Use paper from the large capacity feeder. */
    acPRBNLargeCapacity(11),    
    /**@ Use paper from the large paper bin. */
    acPRBNLargeFmt(10),    
    /**@ Use paper from the lower bin. */
    acPRBNLower(2),    
    /**@ Wait for manual insertion of each sheet of paper. */
    acPRBNManual(4),    
    /**@ Use paper from the middle bin. */
    acPRBNMiddle(3),    
    /**@ Use paper from the small paper feeder. */
    acPRBNSmallFmt(9),    
    /**@ Use paper from the tractor feeder. */
    acPRBNTractor(8),    
    /**@ Use paper from the upper bin. */
    acPRBNUpper(1);

    private final long value;

    AcPrintPaperBin(long value) {
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
