package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.visio;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/visio.visfieldcodes">https://docs.microsoft.com/en-us/office/vba/api/visio.visfieldcodes</a>}
*/
public enum VisFieldCodes implements COMEnum {
    
    /**@ Angle. */
    visFCodeAngle(2),    
    /**@ Background name. */
    visFCodeBackgroundName(0),    
    /**@ Document category. */
    visFCodeCategory(9),    
    /**@ Document company. */
    visFCodeCompany(8),    
    /**@ Document creation date. */
    visFCodeCreateDate(0),    
    /**@ Document creation time. */
    visFCodeCreateTime(1),    
    /**@ Creator. */
    visFCodeCreator(0),    
    /**@ Current date. */
    visFCodeCurrentDate(2),    
    /**@ Current time. */
    visFCodeCurrentTime(3),    
    /**@ Data1 value. */
    visFCodeData1(0),    
    /**@ Data2 value. */
    visFCodeData2(1),    
    /**@ Data3 value. */
    visFCodeData3(2),    
    /**@ Document description. */
    visFCodeDescription(1),    
    /**@ Directory (folder). */
    visFCodeDirectory(2),    
    /**@ Edit date. */
    visFCodeEditDate(4),    
    /**@ Edit time. */
    visFCodeEditTime(5),    
    /**@ Document file name. */
    visFCodeFileName(3),    
    /**@ Height */
    visFCodeHeight(1),    
    /**@ Hyperlink base. */
    visFCodeHyperlinkBase(10),    
    /**@ Keywords. */
    visFCodeKeyWords(4),    
    /**@ Manager name. */
    visFCodeManager(7),    
    /**@ Master name. */
    visFCodeMasterName(4),    
    /**@ Number of pages. */
    visFCodeNumberOfPages(2),    
    /**@ Object ID. */
    visFCodeObjectID(3),    
    /**@ Object name. */
    visFCodeObjectName(5),    
    /**@ Object type. */
    visFCodeObjectType(6),    
    /**@ Page name. */
    visFCodePageName(1),    
    /**@ Page number. */
    visFCodePageNumber(3),    
    /**@ Date printed. */
    visFCodePrintDate(6),    
    /**@ Time printed. */
    visFCodePrintTime(7),    
    /**@ Document subject. */
    visFCodeSubject(5),    
    /**@ Document title. */
    visFCodeTitle(6),    
    /**@ Width. */
    visFCodeWidth(0);

    private final long value;

    VisFieldCodes(long value) {
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
