package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjcopypicturescaleoption">https://docs.microsoft.com/en-us/office/vba/api/project.pjcopypicturescaleoption</a>}
*/
public enum PjCopyPictureScaleOption implements COMEnum {
    
    /**@ Maintains the selection, regardless of size. If the picture exceeds the amount of available memory, it is cropped to the maximum available size. */
    pjCopyPictureKeepRange(1),    
    /**@ Scales the picture to MaxImageWidth by MaxImageHeight MeasurementUnits without maintaining the aspect ratio. */
    pjCopyPictureScale(2),    
    /**@ Scales the picture to MaxImageWidth by MaxImageHeight MeasurementUnits and maintains the aspect ratio. */
    pjCopyPictureScaleWRatio(3),    
    /**@ Displays the Copy Picture Options dialog box. */
    pjCopyPictureShowOptions(0),    
    /**@ Adjusts the timescale (zooms out) so that the picture fits MaxImageWidth by MaxImageHeight MeasurementUnits. */
    pjCopyPictureTimescale(4),    
    /**@ Truncates any portion of the picture that exceeds the boundaries of MaxImageWidth by MaxImageHeight MeasurementUnits. */
    pjCopyPictureTruncate(5);

    private final long value;

    PjCopyPictureScaleOption(long value) {
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
