package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbwizard">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbwizard</a>}
*/
public enum PbWizard implements COMEnum {
    
    /**@ Creates advertisements */
    pbWizardAdvertisements(12),    
    /**@ Creates airplanes */
    pbWizardAirplanes(23),    
    /**@ Creates banners */
    pbWizardBanners(21),    
    /**@ Creates brochures */
    pbWizardBrochures(8),    
    /**@ Creates business cards */
    pbWizardBusinessCards(3),    
    /**@ Creates business forms */
    pbWizardBusinessForms(20),    
    /**@ Creates calendars */
    pbWizardCalendars(13),    
    /**@ Creates catalogs */
    pbWizardCatalogs(161),    
    /**@ Creates certificates */
    pbWizardCertificates(62),    
    /**@ Creates email activity events */
    pbWizardEmailActivityEvent(302),    
    /**@ Creates email messages automatically */
    pbWizardEmailAutomatic(305),    
    /**@ Creates email messages for featured products */
    pbWizardEmailFeaturedProduct(304),    
    /**@ Creates email letters */
    pbWizardEmailLetter(300),    
    /**@ Creates email newsletters */
    pbWizardEmailNewsletter(39),    
    /**@ Creates email product lists */
    pbWizardEmailProductList(303),    
    /**@ Creates email speaker event */
    pbWizardEmailSpeakerEvent(301),    
    /**@ Creates envelopes */
    pbWizardEnvelopes(7),    
    /**@ Creates flyers */
    pbWizardFlyers(16),    
    /**@ Creates gift certificates */
    pbWizardGiftCertificates(63),    
    /**@ Creates greeting cards */
    pbWizardGreetingCard(40),    
    /**@ Creates invitations */
    pbWizardInvitation(41),    
    /**@ Creates Japanese advertisements */
    pbWizardJapaneseAdvertisements(165),    
    /**@ Creates Japanese airplanes */
    pbWizardJapaneseAirplanes(164),    
    /**@ Creates Japanese banners */
    pbWizardJapaneseBanners(121),    
    /**@ Creates Japanese brochures */
    pbWizardJapaneseBrochures(92),    
    /**@ Creates Japanese business cards */
    pbWizardJapaneseBusinessCards(91),    
    /**@ Creates Japanese business forms */
    pbWizardJapaneseBusinessForms(123),    
    /**@ Creates Japanese calendars */
    pbWizardJapaneseCalendars(82),    
    /**@ Creates Japanese catalogs */
    pbWizardJapaneseCatalogs(177),    
    /**@ Creates Japanese certificates */
    pbWizardJapaneseCertificates(119),    
    /**@ Creates Japanese envelopes */
    pbWizardJapaneseEnvelopes(93),    
    /**@ Creates Japanese flyers */
    pbWizardJapaneseFlyers(94),    
    /**@ Creates Japanese gift certificates */
    pbWizardJapaneseGiftCertificates(122),    
    /**@ Creates Japanese greeting cards */
    pbWizardJapaneseGreetingCards(80),    
    /**@ Creates Japanese invitations */
    pbWizardJapaneseInvitations(81),    
    /**@ Creates Japanese labels */
    pbWizardJapaneseLabels(118),    
    /**@ Creates Japanese letterheads */
    pbWizardJapaneseLetterheads(95),    
    /**@ Creates Japanese menus */
    pbWizardJapaneseMenus(116),    
    /**@ Creates Japanese newsletters */
    pbWizardJapaneseNewsletters(117),    
    /**@ Creates Japanese Origami */
    pbWizardJapaneseOrigami(163),    
    /**@ Creates Japanese postcards */
    pbWizardJapanesePostcards(78),    
    /**@ Creates Japanese programs */
    pbWizardJapanesePrograms(115),    
    /**@ Creates Japanese signs */
    pbWizardJapaneseSigns(149),    
    /**@ Creates Japanese websites */
    pbWizardJapaneseWebSites(120),    
    /**@ Creates labels */
    pbWizardLabels(19),    
    /**@ Creates letterheads */
    pbWizardLetterheads(6),    
    /**@ Creates menus */
    pbWizardMenus(59),    
    /**@ Creates newsletters */
    pbWizardNewsletters(9),    
    /**@ Default */
    pbWizardNone(0),    
    /**@ Creates Origami */
    pbWizardOrigami(22),    
    /**@ Creates postcards */
    pbWizardPostcards(10),    
    /**@ Creates programs */
    pbWizardPrograms(76),    
    /**@ Creates QuickPublications */
    pbWizardQuickPublications(179),    
    /**@ Creates resumes */
    pbWizardResumes(18),    
    /**@ Creates signs */
    pbWizardSigns(17),    
    /**@ Creates a blank website */
    pbWizardWebSiteBlank(203),    
    /**@ Creates a home page for a website */
    pbWizardWebSiteHomePage(5),    
    /**@ Creates a product sales website */
    pbWizardWebSiteProductSales(201),    
    /**@ Creates a services website */
    pbWizardWebSiteServices(202),    
    /**@ Creates a three-page website */
    pbWizardWebSiteThreePage(200),    
    /**@ Creates with compliments cards */
    pbWizardWithComplimentsCards(73),    
    /**@ Creates a Microsoft Office Word document */
    pbWizardWordDocument(189);

    private final long value;

    PbWizard(long value) {
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
