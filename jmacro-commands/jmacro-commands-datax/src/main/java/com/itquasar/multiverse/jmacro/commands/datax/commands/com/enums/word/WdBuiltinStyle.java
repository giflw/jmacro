package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdbuiltinstyle">https://docs.microsoft.com/en-us/office/vba/api/word.wdbuiltinstyle</a>}
*/
public enum WdBuiltinStyle implements COMEnum {
    
    /**@ Block Text. */
    wdStyleBlockQuotation(-85),    
    /**@ Body Text. */
    wdStyleBodyText(-67),    
    /**@ Body Text 2. */
    wdStyleBodyText2(-81),    
    /**@ Body Text 3. */
    wdStyleBodyText3(-82),    
    /**@ Body Text First Indent. */
    wdStyleBodyTextFirstIndent(-78),    
    /**@ Body Text First Indent 2. */
    wdStyleBodyTextFirstIndent2(-79),    
    /**@ Body Text Indent. */
    wdStyleBodyTextIndent(-68),    
    /**@ Body Text Indent 2. */
    wdStyleBodyTextIndent2(-83),    
    /**@ Body Text Indent 3. */
    wdStyleBodyTextIndent3(-84),    
    /**@ Book Title. */
    wdStyleBookTitle(-265),    
    /**@ Caption. */
    wdStyleCaption(-35),    
    /**@ Closing. */
    wdStyleClosing(-64),    
    /**@ Comment Reference. */
    wdStyleCommentReference(-40),    
    /**@ Comment Text. */
    wdStyleCommentText(-31),    
    /**@ Date. */
    wdStyleDate(-77),    
    /**@ Default Paragraph Font. */
    wdStyleDefaultParagraphFont(-66),    
    /**@ Emphasis. */
    wdStyleEmphasis(-89),    
    /**@ Endnote Reference. */
    wdStyleEndnoteReference(-43),    
    /**@ Endnote Text. */
    wdStyleEndnoteText(-44),    
    /**@ Envelope Address. */
    wdStyleEnvelopeAddress(-37),    
    /**@ Envelope Return. */
    wdStyleEnvelopeReturn(-38),    
    /**@ Footer. */
    wdStyleFooter(-33),    
    /**@ Footnote Reference. */
    wdStyleFootnoteReference(-39),    
    /**@ Footnote Text. */
    wdStyleFootnoteText(-30),    
    /**@ Header. */
    wdStyleHeader(-32),    
    /**@ Heading 1. */
    wdStyleHeading1(-2),    
    /**@ Heading 2. */
    wdStyleHeading2(-3),    
    /**@ Heading 3. */
    wdStyleHeading3(-4),    
    /**@ Heading 4. */
    wdStyleHeading4(-5),    
    /**@ Heading 5. */
    wdStyleHeading5(-6),    
    /**@ Heading 6. */
    wdStyleHeading6(-7),    
    /**@ Heading 7. */
    wdStyleHeading7(-8),    
    /**@ Heading 8. */
    wdStyleHeading8(-9),    
    /**@ Heading 9. */
    wdStyleHeading9(-10),    
    /**@ HTML Acronym. */
    wdStyleHtmlAcronym(-96),    
    /**@ HTML Address. */
    wdStyleHtmlAddress(-97),    
    /**@ HTML Cite. */
    wdStyleHtmlCite(-98),    
    /**@ HTML Code. */
    wdStyleHtmlCode(-99),    
    /**@ HTML Definition. */
    wdStyleHtmlDfn(-100),    
    /**@ HTML Keyboard. */
    wdStyleHtmlKbd(-101),    
    /**@ Normal (Web). */
    wdStyleHtmlNormal(-95),    
    /**@ HTML Preformatted. */
    wdStyleHtmlPre(-102),    
    /**@ HTML Sample. */
    wdStyleHtmlSamp(-103),    
    /**@ HTML Typewriter. */
    wdStyleHtmlTt(-104),    
    /**@ HTML Variable. */
    wdStyleHtmlVar(-105),    
    /**@ Hyperlink. */
    wdStyleHyperlink(-86),    
    /**@ Followed Hyperlink. */
    wdStyleHyperlinkFollowed(-87),    
    /**@ Index 1. */
    wdStyleIndex1(-11),    
    /**@ Index 2. */
    wdStyleIndex2(-12),    
    /**@ Index 3. */
    wdStyleIndex3(-13),    
    /**@ Index 4. */
    wdStyleIndex4(-14),    
    /**@ Index 5. */
    wdStyleIndex5(-15),    
    /**@ Index 6. */
    wdStyleIndex6(-16),    
    /**@ Index 7. */
    wdStyleIndex7(-17),    
    /**@ Index 8. */
    wdStyleIndex8(-18),    
    /**@ Index 9. */
    wdStyleIndex9(-19),    
    /**@ Index Heading. */
    wdStyleIndexHeading(-34),    
    /**@ Intense Emphasis. */
    wdStyleIntenseEmphasis(-262),    
    /**@ Intense Quote. */
    wdStyleIntenseQuote(-182),    
    /**@ Intense Reference. */
    wdStyleIntenseReference(-264),    
    /**@ Line Number. */
    wdStyleLineNumber(-41),    
    /**@ List. */
    wdStyleList(-48),    
    /**@ List 2. */
    wdStyleList2(-51),    
    /**@ List 3. */
    wdStyleList3(-52),    
    /**@ List 4. */
    wdStyleList4(-53),    
    /**@ List 5. */
    wdStyleList5(-54),    
    /**@ List Bullet. */
    wdStyleListBullet(-49),    
    /**@ List Bullet 2. */
    wdStyleListBullet2(-55),    
    /**@ List Bullet 3. */
    wdStyleListBullet3(-56),    
    /**@ List Bullet 4. */
    wdStyleListBullet4(-57),    
    /**@ List Bullet 5. */
    wdStyleListBullet5(-58),    
    /**@ List Continue. */
    wdStyleListContinue(-69),    
    /**@ List Continue 2. */
    wdStyleListContinue2(-70),    
    /**@ List Continue 3. */
    wdStyleListContinue3(-71),    
    /**@ List Continue 4. */
    wdStyleListContinue4(-72),    
    /**@ List Continue 5. */
    wdStyleListContinue5(-73),    
    /**@ List Number. */
    wdStyleListNumber(-50),    
    /**@ List Number 2. */
    wdStyleListNumber2(-59),    
    /**@ List Number 3. */
    wdStyleListNumber3(-60),    
    /**@ List Number 4. */
    wdStyleListNumber4(-61),    
    /**@ List Number 5. */
    wdStyleListNumber5(-62),    
    /**@ List Paragraph. */
    wdStyleListParagraph(-180),    
    /**@ Macro Text. */
    wdStyleMacroText(-46),    
    /**@ Message Header. */
    wdStyleMessageHeader(-74),    
    /**@ Document Map. */
    wdStyleNavPane(-90),    
    /**@ Normal. */
    wdStyleNormal(-1),    
    /**@ Normal Indent. */
    wdStyleNormalIndent(-29),    
    /**@ Normal (applied to an object). */
    wdStyleNormalObject(-158),    
    /**@ Normal (applied within a table). */
    wdStyleNormalTable(-106),    
    /**@ Note Heading. */
    wdStyleNoteHeading(-80),    
    /**@ Page Number. */
    wdStylePageNumber(-42),    
    /**@ Plain Text. */
    wdStylePlainText(-91),    
    /**@ Quote. */
    wdStyleQuote(-181),    
    /**@ Salutation. */
    wdStyleSalutation(-76),    
    /**@ Signature. */
    wdStyleSignature(-65),    
    /**@ Strong. */
    wdStyleStrong(-88),    
    /**@ Subtitle. */
    wdStyleSubtitle(-75),    
    /**@ Subtle Emphasis. */
    wdStyleSubtleEmphasis(-261),    
    /**@ Subtle Reference. */
    wdStyleSubtleReference(-263),    
    /**@ Colorful Grid. */
    wdStyleTableColorfulGrid(-172),    
    /**@ Colorful List. */
    wdStyleTableColorfulList(-171),    
    /**@ Colorful Shading. */
    wdStyleTableColorfulShading(-170),    
    /**@ Dark List. */
    wdStyleTableDarkList(-169),    
    /**@ Light Grid. */
    wdStyleTableLightGrid(-161),    
    /**@ Light Grid Accent 1. */
    wdStyleTableLightGridAccent1(-175),    
    /**@ Light List. */
    wdStyleTableLightList(-160),    
    /**@ Light List Accent 1. */
    wdStyleTableLightListAccent1(-174),    
    /**@ Light Shading. */
    wdStyleTableLightShading(-159),    
    /**@ Light Shading Accent 1. */
    wdStyleTableLightShadingAccent1(-173),    
    /**@ Medium Grid 1. */
    wdStyleTableMediumGrid1(-166),    
    /**@ Medium Grid 2. */
    wdStyleTableMediumGrid2(-167),    
    /**@ Medium Grid 3. */
    wdStyleTableMediumGrid3(-168),    
    /**@ Medium List 1. */
    wdStyleTableMediumList1(-164),    
    /**@ Medium List 1 Accent 1. */
    wdStyleTableMediumList1Accent1(-178),    
    /**@ Medium List 2. */
    wdStyleTableMediumList2(-165),    
    /**@ Medium Shading 1. */
    wdStyleTableMediumShading1(-162),    
    /**@ Medium Shading 1 Accent 1. */
    wdStyleTableMediumShading1Accent1(-176),    
    /**@ Medium Shading 2. */
    wdStyleTableMediumShading2(-163),    
    /**@ Medium Shading 2 Accent 1. */
    wdStyleTableMediumShading2Accent1(-177),    
    /**@ Table of Authorities. */
    wdStyleTableOfAuthorities(-45),    
    /**@ Table of Figures. */
    wdStyleTableOfFigures(-36),    
    /**@ Title. */
    wdStyleTitle(-63),    
    /**@ TOA Heading. */
    wdStyleTOAHeading(-47),    
    /**@ TOC 1. */
    wdStyleTOC1(-20),    
    /**@ TOC 2. */
    wdStyleTOC2(-21),    
    /**@ TOC 3. */
    wdStyleTOC3(-22),    
    /**@ TOC 4. */
    wdStyleTOC4(-23),    
    /**@ TOC 5. */
    wdStyleTOC5(-24),    
    /**@ TOC 6. */
    wdStyleTOC6(-25),    
    /**@ TOC 7. */
    wdStyleTOC7(-26),    
    /**@ TOC 8. */
    wdStyleTOC8(-27),    
    /**@ TOC 9. */
    wdStyleTOC9(-28);

    private final long value;

    WdBuiltinStyle(long value) {
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
