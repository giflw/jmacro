package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppsoundformattype">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppsoundformattype</a>}
*/
public enum PpSoundFormatType implements COMEnum {
    
    /**@ CD Audio format */
    ppSoundFormatCDAudio(3),    
    /**@ MIDI format */
    ppSoundFormatMIDI(2),    
    /**@ Mixed format */
    ppSoundFormatMixed(-2),    
    /**@ No format */
    ppSoundFormatNone(0),    
    /**@ WAV format */
    ppSoundFormatWAV(1);

    private final long value;

    PpSoundFormatType(long value) {
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
