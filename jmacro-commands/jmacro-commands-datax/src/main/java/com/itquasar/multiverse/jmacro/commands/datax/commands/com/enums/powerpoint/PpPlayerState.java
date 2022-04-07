package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppplayerstate">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppplayerstate</a>}
*/
public enum PpPlayerState implements COMEnum {
    
    /**@ Playing */
    ppPlaying(0),    
    /**@ Paused */
    ppPaused(1),    
    /**@ Stopped */
    ppStopped(2),    
    /**@ Not ready */
    ppNotReady(3);

    private final long value;

    PpPlayerState(long value) {
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
