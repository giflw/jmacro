package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbwizardgroup">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbwizardgroup</a>}
*/
public enum PbWizardGroup implements COMEnum {
    
    /**@ Accent Box */
    pbWizardGroupAccentBox(151),    
    /**@ Accessory Bar */
    pbWizardGroupAccessoryBar(154),    
    /**@ Advertisements */
    pbWizardGroupAdvertisements(68),    
    /**@ Attention Getter */
    pbWizardGroupAttentionGetter(61),    
    /**@ Barbells */
    pbWizardGroupBarbells(52),    
    /**@ Borders */
    pbWizardGroupBorders(155),    
    /**@ Boxes */
    pbWizardGroupBoxes(50),    
    /**@ Calendars */
    pbWizardGroupCalendars(77),    
    /**@ Checkerboards */
    pbWizardGroupCheckerboards(53),    
    /**@ Coupon */
    pbWizardGroupCoupon(60),    
    /**@ Dots */
    pbWizardGroupDots(49),    
    /**@ EastAsia ZipCode */
    pbWizardGroupEastAsiaZipCode(181),    
    /**@ Japanese Accent Box */
    pbWizardGroupJapaneseAccentBox(168),    
    /**@ Japanese Accessory Bar */
    pbWizardGroupJapaneseAccessoryBar(171),    
    /**@ Japanese Attention Getters */
    pbWizardGroupJapaneseAttentionGetters(97),    
    /**@ Japanese Borders */
    pbWizardGroupJapaneseBorders(172),    
    /**@ Japanese Calendar */
    pbWizardGroupJapaneseCalendar(83),    
    /**@ Japanese Coupons */
    pbWizardGroupJapaneseCoupons(99),    
    /**@ Japanese Linear Accent */
    pbWizardGroupJapaneseLinearAccent(170),    
    /**@ Japanese Marquees */
    pbWizardGroupJapaneseMarquees(167),    
    /**@ Japanese Mastheads */
    pbWizardGroupJapaneseMastheads(141),    
    /**@ Japanese Pull Quotes */
    pbWizardGroupJapanesePullQuotes(144),    
    /**@ Japanese Reply Forms */
    pbWizardGroupJapaneseReplyForms(137),    
    /**@ Japanese Sidebars */
    pbWizardGroupJapaneseSidebars(143),    
    /**@ Japanese Table Of Contents */
    pbWizardGroupJapaneseTableOfContents(142),    
    /**@ Japanese Web Button Email */
    pbWizardGroupJapaneseWebButtonEmail(182),    
    /**@ Japanese Web Button Home */
    pbWizardGroupJapaneseWebButtonHome(183),    
    /**@ Japanese Web Button Link */
    pbWizardGroupJapaneseWebButtonLink(184),    
    /**@ Japanese Web Mastheads */
    pbWizardGroupJapaneseWebMastheads(138),    
    /**@ Japanese Web Navigation Bars */
    pbWizardGroupJapaneseWebNavigationBars(148),    
    /**@ Japanese Web Pull Quotes */
    pbWizardGroupJapaneseWebPullQuotes(139),    
    /**@ Japanese Web Sidebars */
    pbWizardGroupJapaneseWebSidebars(140),    
    /**@ Linear Accent */
    pbWizardGroupLinearAccent(153),    
    /**@ Logo */
    pbWizardGroupLogo(4),    
    /**@ Marquee */
    pbWizardGroupMarquee(150),    
    /**@ Mastheads */
    pbWizardGroupMastheads(105),    
    /**@ Phone Tearoff */
    pbWizardGroupPhoneTearoff(66),    
    /**@ Picture Captions */
    pbWizardGroupPictureCaptions(109),    
    /**@ Pull Quotes */
    pbWizardGroupPullQuotes(108),    
    /**@ Punctuation */
    pbWizardGroupPunctuation(152),    
    /**@ Reply Forms */
    pbWizardGroupReplyForms(79),    
    /**@ Sidebars */
    pbWizardGroupSidebars(107),    
    /**@ Table of Contents */
    pbWizardGroupTableOfContents(106),    
    /**@ Web Buttons Email */
    pbWizardGroupWebButtonsEmail(133),    
    /**@ Web Buttons Home */
    pbWizardGroupWebButtonsHome(134),    
    /**@ Web Buttons Link */
    pbWizardGroupWebButtonsLink(136),    
    /**@ Web Calendars */
    pbWizardGroupWebCalendars(35),    
    /**@ Web Mastheads */
    pbWizardGroupWebMastheads(102),    
    /**@ Web Navigation Bars */
    pbWizardGroupWebNavigationBars(75),    
    /**@ Group Web Sidebars */
    pbWizardGroupWebSidebars(104),    
    /**@ Group Well Pull Quotes */
    pbWizardGroupWellPullQuotes(103);

    private final long value;

    PbWizardGroup(long value) {
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
