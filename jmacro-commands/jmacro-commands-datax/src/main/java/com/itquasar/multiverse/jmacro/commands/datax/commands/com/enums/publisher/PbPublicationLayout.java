package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbpublicationlayout">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbpublicationlayout</a>}
*/
public enum PbPublicationLayout implements COMEnum {
    
    /**@ No description provided */
    pbLayout4x6BaePan(10),    
    /**@ No description provided */
    pbLayout4x6BanPan(12),    
    /**@ No description provided */
    pbLayout4x6Pan(11),    
    /**@ No description provided */
    pbLayoutAdvertisement(36),    
    /**@ No description provided */
    pbLayoutAwardCertificate(37),    
    /**@ No description provided */
    pbLayoutBanner(38),    
    /**@ No description provided */
    pbLayoutBannerCustom(27),    
    /**@ No description provided */
    pbLayoutBannerLarge(26),    
    /**@ No description provided */
    pbLayoutBannerMedium(25),    
    /**@ No description provided */
    pbLayoutBannerSmall(24),    
    /**@ No description provided */
    pbLayoutBook(2),    
    /**@ No description provided */
    pbLayoutBrochure(39),    
    /**@ No description provided */
    pbLayoutBusinessCard(40),    
    /**@ No description provided */
    pbLayoutBusinessCardEurope(18),    
    /**@ No description provided */
    pbLayoutBusinessCardFE(19),    
    /**@ No description provided */
    pbLayoutBusinessCardLocal(20),    
    /**@ No description provided */
    pbLayoutBusinessCardUS(17),    
    /**@ No description provided */
    pbLayoutBusinessForm(41),    
    /**@ No description provided */
    pbLayoutCalendar(42),    
    /**@ No description provided */
    pbLayoutCatalog(43),    
    /**@ No description provided */
    pbLayoutCrownPan(13),    
    /**@ No description provided */
    pbLayoutCustom(23),    
    /**@ No description provided */
    pbLayoutEmail(44),    
    /**@ No description provided */
    pbLayoutEnvelope(33),    
    /**@ No description provided */
    pbLayoutFlyer(45),    
    /**@ No description provided */
    pbLayoutFoldCard(3),    
    /**@ No description provided */
    pbLayoutFullPage(1),    
    /**@ No description provided */
    pbLayoutGiftCertificate(46),    
    /**@ No description provided */
    pbLayoutGreetingCard(47),    
    /**@ No description provided */
    pbLayoutGreetingCardL(4),    
    /**@ No description provided */
    pbLayoutGreetingCardT(5),    
    /**@ No description provided */
    pbLayoutIndexCard(16),    
    /**@ No description provided */
    pbLayoutInvitationCard(49),    
    /**@ No description provided */
    pbLayoutJang4x6Pan(15),    
    /**@ No description provided */
    pbLayoutKookBaePan(6),    
    /**@ No description provided */
    pbLayoutKookBanPan(9),    
    /**@ No description provided */
    pbLayoutKookPan(7),    
    /**@ No description provided */
    pbLayoutLabel(32),    
    /**@ No description provided */
    pbLayoutLetterhead(50),    
    /**@ No description provided */
    pbLayoutMenu(51),    
    /**@ No description provided */
    pbLayoutNewsletter(52),    
    /**@ No description provided */
    pbLayoutPaperFoldingProject(53),    
    /**@ No description provided */
    pbLayoutPostcard(54),    
    /**@ No description provided */
    pbLayoutPostcardA4(30),    
    /**@ No description provided */
    pbLayoutPostcardHalfLetter(29),    
    /**@ No description provided */
    pbLayoutPostcardJapan(31),    
    /**@ No description provided */
    pbLayoutPostcardUS(28),    
    /**@ No description provided */
    pbLayoutPosterLarge(22),    
    /**@ No description provided */
    pbLayoutPosterSmall(21),    
    /**@ No description provided */
    pbLayoutProgram(55),    
    /**@ No description provided */
    pbLayoutQuickPublication(60),    
    /**@ No description provided */
    pbLayoutResume(56),    
    /**@ No description provided */
    pbLayoutShinKookPan(8),    
    /**@ No description provided */
    pbLayoutShinSeoPan(14),    
    /**@ No description provided */
    pbLayoutSign(57),    
    /**@ No description provided */
    pbLayoutWebPageLarge(35),    
    /**@ No description provided */
    pbLayoutWebPageSmall(34),    
    /**@ No description provided */
    pbLayoutWebSite(59),    
    /**@ No description provided */
    pbLayoutWithComplimentsCard(58),    
    /**@ No description provided */
    pbLayoutWordImport(48);

    private final long value;

    PbPublicationLayout(long value) {
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
