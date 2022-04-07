package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdbuiltinproperty">https://docs.microsoft.com/en-us/office/vba/api/word.wdbuiltinproperty</a>}
*/
public enum WdBuiltInProperty implements COMEnum {
    
    /**@ Name of application. */
    wdPropertyAppName(9),    
    /**@ Author. */
    wdPropertyAuthor(3),    
    /**@ Byte count. */
    wdPropertyBytes(22),    
    /**@ Category. */
    wdPropertyCategory(18),    
    /**@ Character count. */
    wdPropertyCharacters(16),    
    /**@ Character count with spaces. */
    wdPropertyCharsWSpaces(30),    
    /**@ Comments. */
    wdPropertyComments(5),    
    /**@ Company. */
    wdPropertyCompany(21),    
    /**@ Not supported. */
    wdPropertyFormat(19),    
    /**@ Not supported. */
    wdPropertyHiddenSlides(27),    
    /**@ Not supported. */
    wdPropertyHyperlinkBase(29),    
    /**@ Keywords. */
    wdPropertyKeywords(4),    
    /**@ Last author. */
    wdPropertyLastAuthor(7),    
    /**@ Line count. */
    wdPropertyLines(23),    
    /**@ Manager. */
    wdPropertyManager(20),    
    /**@ Not supported. */
    wdPropertyMMClips(28),    
    /**@ Notes. */
    wdPropertyNotes(26),    
    /**@ Page count. */
    wdPropertyPages(14),    
    /**@ Paragraph count. */
    wdPropertyParas(24),    
    /**@ Revision number. */
    wdPropertyRevision(8),    
    /**@ Security setting. */
    wdPropertySecurity(17),    
    /**@ Not supported. */
    wdPropertySlides(25),    
    /**@ Subject. */
    wdPropertySubject(2),    
    /**@ Template name. */
    wdPropertyTemplate(6),    
    /**@ Time created. */
    wdPropertyTimeCreated(11),    
    /**@ Time last printed. */
    wdPropertyTimeLastPrinted(10),    
    /**@ Time last saved. */
    wdPropertyTimeLastSaved(12),    
    /**@ Title. */
    wdPropertyTitle(1),    
    /**@ Number of edits to VBA project. */
    wdPropertyVBATotalEdit(13),    
    /**@ Word count. */
    wdPropertyWords(15);

    private final long value;

    WdBuiltInProperty(long value) {
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
