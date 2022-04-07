package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbwizardtag">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbwizardtag</a>}
*/
public enum PbWizardTag implements COMEnum {
    
    /**@ Address */
    pbWizardTagAddress(10),    
    /**@ Address Group */
    pbWizardTagAddressGroup(117),    
    /**@ Description Caption */
    pbWizardTagBriefDescriptionCaption(1361),    
    /**@ Description Graphic */
    pbWizardTagBriefDescriptionGraphic(1359),    
    /**@ Description Summary */
    pbWizardTagBriefDescriptionSummary(1353),    
    /**@ Description Summary Primary */
    pbWizardTagBriefDescriptionSummaryPrimary(1365),    
    /**@ Brief Description Title */
    pbWizardTagBriefDescriptionTitle(1364),    
    /**@ Business Description */
    pbWizardTagBusinessDescription(685),    
    /**@ Customer Mailing Address */
    pbWizardTagCustomerMailingAddress(560),    
    /**@ Tag Date */
    pbWizardTagDate(1835),    
    /**@ EA Postal Code Box */
    pbWizardTagEAPostalCodeBox(2151),    
    /**@ EA Postal Code Group */
    pbWizardTagEAPostalCodeGroup(2150),    
    /**@ EA Postal Code Line */
    pbWizardTagEAPostalCodeLine(2152),    
    /**@ Floating Graphic Caption */
    pbWizardTagFloatingGraphicCaption(1362),    
    /**@ Hour Time Date Information */
    pbWizardTagHourTimeDateInformation(684),    
    /**@ Job Title */
    pbWizardTagJobTitle(115),    
    /**@ Linked Primary Story */
    pbWizardTagLinkedStoryPrimary(1354),    
    /**@ Secondary Story */
    pbWizardTagLinkedStorySecondary(1355),    
    /**@ Linked Story Tertiary */
    pbWizardTagLinkedStoryTertiary(1356),    
    /**@ List */
    pbWizardTagList(1837),    
    /**@ Location */
    pbWizardTagLocation(488),    
    /**@ Logo Group */
    pbWizardTagLogoGroup(5),    
    /**@ Main Floating Graphic */
    pbWizardTagMainFloatingGraphic(1357),    
    /**@ Main Graphic */
    pbWizardTagMainGraphic(1833),    
    /**@ Title */
    pbWizardTagMainTitle(1832),    
    /**@ Picture */
    pbWizardTagMapPicture(489),    
    /**@ Masthead */
    pbWizardTagMasthead(1831),    
    /**@ Newsletter Title */
    pbWizardTagNewsletterTitle(1344),    
    /**@ Organization Name */
    pbWizardTagOrganizationName(7),    
    /**@ Organization Name Group */
    pbWizardTagOrganizationNameGroup(118),    
    /**@ Page Number */
    pbWizardTagPageNumber(1346),    
    /**@ Personal Name */
    pbWizardTagPersonalName(8),    
    /**@ Personal Name Group */
    pbWizardTagPersonalNameGroup(116),    
    /**@ Phone/Fax/Email */
    pbWizardTagPhoneFaxEmail(113),    
    /**@ Phone/Fax/Email Group */
    pbWizardTagPhoneFaxEmailGroup(120),    
    /**@ Phone Number */
    pbWizardTagPhoneNumber(114),    
    /**@ Photo Placeholder Frame */
    pbWizardTagPhotoPlaceholderFrame(1134),    
    /**@ Photo Placeholder Text */
    pbWizardTagPhotoPlaceholderText(1135),    
    /**@ Publication Date */
    pbWizardTagPublicationDate(1341),    
    /**@ Quick Pub Content */
    pbWizardTagQuickPubContent(2143),    
    /**@ Quick Pub Heading */
    pbWizardTagQuickPubHeading(2140),    
    /**@ Quick Pub Message */
    pbWizardTagQuickPubMessage(2141),    
    /**@ Quick Pub Picture */
    pbWizardTagQuickPubPicture(2142),    
    /**@ Return Address Lines */
    pbWizardTagReturnAddressLines(793),    
    /**@ Stamp Box */
    pbWizardTagStampBox(887),    
    /**@ Stamp Box Outline */
    pbWizardTagStampBoxOutline(794),    
    /**@ Story */
    pbWizardTagStory(1349),    
    /**@ Caption Primary */
    pbWizardTagStoryCaptionPrimary(1351),    
    /**@ Caption Secondary */
    pbWizardTagStoryCaptionSecondary(1373),    
    /**@ Graphic Primary */
    pbWizardTagStoryGraphicPrimary(1350),    
    /**@ Graphic Secondary */
    pbWizardTagStoryGraphicSecondary(1360),    
    /**@ Story Title */
    pbWizardTagStoryTitle(1348),    
    /**@ Table of Contents */
    pbWizardTagTableOfContents(1343),    
    /**@ Table of Contents Title */
    pbWizardTagTableOfContentsTitle(1342),    
    /**@ Tag Line */
    pbWizardTagTagLine(112),    
    /**@ Tag Line Group */
    pbWizardTagTagLineGroup(119),    
    /**@ Tag Time */
    pbWizardTagTime(1836);

    private final long value;

    PbWizardTag(long value) {
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
