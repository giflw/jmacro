package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.powerpoint;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppsaveasfiletype">https://docs.microsoft.com/en-us/office/vba/api/powerpoint.ppsaveasfiletype</a>}
*/
public enum PpSaveAsFileType implements COMEnum {
    
    /**@ No description provided */
    ppSaveAsAddIn(8),    
    /**@ No description provided */
    ppSaveAsAnimatedGIF(40),    
    /**@ No description provided */
    ppSaveAsBMP(19),    
    /**@ No description provided */
    ppSaveAsDefault(11),    
    /**@ No description provided */
    ppSaveAsEMF(23),    
    /**@ No description provided */
    ppSaveAsExternalConverter(64000),    
    /**@ No description provided */
    ppSaveAsGIF(16),    
    /**@ No description provided */
    ppSaveAsJPG(17),    
    /**@ No description provided */
    ppSaveAsMetaFile(15),    
    /**@ No description provided */
    ppSaveAsMP4(39),    
    /**@ No description provided */
    ppSaveAsOpenDocumentPresentation(35),    
    /**@ No description provided */
    ppSaveAsOpenXMLAddin(30),    
    /**@ No description provided */
    ppSaveAsOpenXMLPicturePresentation(36),    
    /**@ No description provided */
    ppSaveAsOpenXMLPresentation(24),    
    /**@ No description provided */
    ppSaveAsOpenXMLPresentationMacroEnabled(25),    
    /**@ No description provided */
    ppSaveAsOpenXMLShow(28),    
    /**@ No description provided */
    ppSaveAsOpenXMLShowMacroEnabled(29),    
    /**@ No description provided */
    ppSaveAsOpenXMLTemplate(26),    
    /**@ No description provided */
    ppSaveAsOpenXMLTemplateMacroEnabled(27),    
    /**@ No description provided */
    ppSaveAsOpenXMLTheme(31),    
    /**@ No description provided */
    ppSaveAsPDF(32),    
    /**@ No description provided */
    ppSaveAsPNG(18),    
    /**@ No description provided */
    ppSaveAsPresentation(1),    
    /**@ No description provided */
    ppSaveAsRTF(6),    
    /**@ No description provided */
    ppSaveAsShow(7),    
    /**@ No description provided */
    ppSaveAsStrictOpenXMLPresentation(38),    
    /**@ No description provided */
    ppSaveAsTemplate(5),    
    /**@ No description provided */
    ppSaveAsTIF(21),    
    /**@ No description provided */
    ppSaveAsWMV(37),    
    /**@ No description provided */
    ppSaveAsXMLPresentation(34),    
    /**@ No description provided */
    ppSaveAsXPS(33);

    private final long value;

    PpSaveAsFileType(long value) {
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
