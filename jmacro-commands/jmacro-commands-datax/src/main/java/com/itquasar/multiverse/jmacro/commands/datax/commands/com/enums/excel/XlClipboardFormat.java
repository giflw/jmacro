package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xlclipboardformat">https://docs.microsoft.com/en-us/office/vba/api/excel.xlclipboardformat</a>}
*/
public enum XlClipboardFormat implements COMEnum {
    
    /**@ Binary Interchange file format for Excel version 2.x */
    xlClipboardFormatBIFF(8),    
    /**@ Binary Interchange file format 12 */
    xlClipboardFormatBIFF12(63),    
    /**@ Binary Interchange file format 2 */
    xlClipboardFormatBIFF2(18),    
    /**@ Binary Interchange file format 3 */
    xlClipboardFormatBIFF3(20),    
    /**@ Binary Interchange file format 4 */
    xlClipboardFormatBIFF4(30),    
    /**@ Binary format */
    xlClipboardFormatBinary(15),    
    /**@ Bitmap format */
    xlClipboardFormatBitmap(9),    
    /**@ CGM format */
    xlClipboardFormatCGM(13),    
    /**@ CSV format */
    xlClipboardFormatCSV(5),    
    /**@ DIF format */
    xlClipboardFormatDIF(4),    
    /**@ Dsp Text format */
    xlClipboardFormatDspText(12),    
    /**@ Embedded Object */
    xlClipboardFormatEmbeddedObject(21),    
    /**@ Embedded Source */
    xlClipboardFormatEmbedSource(22),    
    /**@ Link */
    xlClipboardFormatLink(11),    
    /**@ Link to the source file */
    xlClipboardFormatLinkSource(23),    
    /**@ Link to the source description */
    xlClipboardFormatLinkSourceDesc(32),    
    /**@ Movie */
    xlClipboardFormatMovie(24),    
    /**@ Native */
    xlClipboardFormatNative(14),    
    /**@ Object description */
    xlClipboardFormatObjectDesc(31),    
    /**@ Object link */
    xlClipboardFormatObjectLink(19),    
    /**@ Link to the owner */
    xlClipboardFormatOwnerLink(17),    
    /**@ Picture */
    xlClipboardFormatPICT(2),    
    /**@ Print picture */
    xlClipboardFormatPrintPICT(3),    
    /**@ RTF format */
    xlClipboardFormatRTF(7),    
    /**@ Screen Picture */
    xlClipboardFormatScreenPICT(29),    
    /**@ Standard Font */
    xlClipboardFormatStandardFont(28),    
    /**@ Standard Scale */
    xlClipboardFormatStandardScale(27),    
    /**@ SYLK */
    xlClipboardFormatSYLK(6),    
    /**@ Table */
    xlClipboardFormatTable(16),    
    /**@ Text */
    xlClipboardFormatText(0),    
    /**@ Tool Face */
    xlClipboardFormatToolFace(25),    
    /**@ Tool Face Picture */
    xlClipboardFormatToolFacePICT(26),    
    /**@ Value */
    xlClipboardFormatVALU(1),    
    /**@ Workbook */
    xlClipboardFormatWK1(10);

    private final long value;

    XlClipboardFormat(long value) {
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
