package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbwizardpagetype">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbwizardpagetype</a>}
*/
public enum PbWizardPageType implements COMEnum {
    
    /**@ CatalogBlank */
    pbWizardPageTypeCatalogBlank(35),    
    /**@ Calendar */
    pbWizardPageTypeCatalogCalendar(22),    
    /**@ CatalogEightItemsOneColumn */
    pbWizardPageTypeCatalogEightItemsOneColumn(33),    
    /**@ CatalogEightItemsTwoColumns */
    pbWizardPageTypeCatalogEightItemsTwoColumns(34),    
    /**@ CatalogFeaturedItem */
    pbWizardPageTypeCatalogFeaturedItem(24),    
    /**@ Catalog Form */
    pbWizardPageTypeCatalogForm(36),    
    /**@ Catalog Four Items Aligned Pictures */
    pbWizardPageTypeCatalogFourItemsAlignedPictures(30),    
    /**@ Catalog Four Items Offset Pictures */
    pbWizardPageTypeCatalogFourItemsOffsetPictures(31),    
    /**@ Catalog Four Items Squared Pictures */
    pbWizardPageTypeCatalogFourItemsSquaredPictures(32),    
    /**@ Catalog One Column Text */
    pbWizardPageTypeCatalogOneColumnText(18),    
    /**@ Catalog One Column Text Picture */
    pbWizardPageTypeCatalogOneColumnTextPicture(19),    
    /**@ Catalog Table of Contents */
    pbWizardPageTypeCatalogTableOfContents(23),    
    /**@ Three Items Aligned Pictures */
    pbWizardPageTypeCatalogThreeItemsAlignedPictures(27),    
    /**@ Three Items Offset Pictures */
    pbWizardPageTypeCatalogThreeItemsOffsetPictures(28),    
    /**@ Three Items Stacked Pictures */
    pbWizardPageTypeCatalogThreeItemsStackedPictures(29),    
    /**@ Catalog Two Columns Text */
    pbWizardPageTypeCatalogTwoColumnsText(20),    
    /**@ Catalog Two Columns Text Picture */
    pbWizardPageTypeCatalogTwoColumnsTextPicture(21),    
    /**@ Two Items Aligned Pictures */
    pbWizardPageTypeCatalogTwoItemsAlignedPictures(25),    
    /**@ Two Items Offset Pictures */
    pbWizardPageTypeCatalogTwoItemsOffsetPictures(26),    
    /**@ Newsletter3 Stories */
    pbWizardPageTypeNewsletter3Stories(1),    
    /**@ Newsletter Calendar */
    pbWizardPageTypeNewsletterCalendar(2),    
    /**@ Newsletter OrderForm */
    pbWizardPageTypeNewsletterOrderForm(15),    
    /**@ Newsletter Response Form */
    pbWizardPageTypeNewsletterResponseForm(16),    
    /**@ Newsletter Signup Form */
    pbWizardPageTypeNewsletterSignupForm(17),    
    /**@ None */
    pbWizardPageTypeNone(-1),    
    /**@ Web About Us */
    pbWizardPageTypeWebAboutUs(501),    
    /**@ Web Article */
    pbWizardPageTypeWebArticle(512),    
    /**@ Web Blank */
    pbWizardPageTypeWebBlank(524),    
    /**@ Web Calendar Page */
    pbWizardPageTypeWebCalendarPage(504),    
    /**@ Web Calendar With Links */
    pbWizardPageTypeWebCalendarWithLinks(800),    
    /**@ Web Contact Us */
    pbWizardPageTypeWebContactUs(505),    
    /**@ Web Employee */
    pbWizardPageTypeWebEmployee(507),    
    /**@ Web Employee List */
    pbWizardPageTypeWebEmployeeList(506),    
    /**@ Web Employees With Links */
    pbWizardPageTypeWebEmployeesWithLinks(802),    
    /**@ Web FAQ */
    pbWizardPageTypeWebFAQ(508),    
    /**@ Web Home */
    pbWizardPageTypeWebHome(509),    
    /**@ Web Informational */
    pbWizardPageTypeWebInformational(502),    
    /**@ Web Jobs */
    pbWizardPageTypeWebJobs(510),    
    /**@ Web Legal */
    pbWizardPageTypeWebLegal(511),    
    /**@ Web Links */
    pbWizardPageTypeWebLinks(518),    
    /**@ Web List */
    pbWizardPageTypeWebList(503),    
    /**@ Web Order Form */
    pbWizardPageTypeWebOrderForm(525),    
    /**@ Web Photo */
    pbWizardPageTypeWebPhoto(513),    
    /**@ Web Photo Gallery */
    pbWizardPageTypeWebPhotoGallery(514),    
    /**@ Web Photos With Links */
    pbWizardPageTypeWebPhotosWithLinks(805),    
    /**@ Web Product */
    pbWizardPageTypeWebProduct(515),    
    /**@ Web Product List */
    pbWizardPageTypeWebProductList(516),    
    /**@ Web Products With Links */
    pbWizardPageTypeWebProductsWithLinks(801),    
    /**@ Web Project List */
    pbWizardPageTypeWebProjectList(517),    
    /**@ Web Projects With Links */
    pbWizardPageTypeWebProjectsWithLinks(804),    
    /**@ Web Response Form */
    pbWizardPageTypeWebResponseForm(526),    
    /**@ Web Seminar */
    pbWizardPageTypeWebSeminar(519),    
    /**@ Web Service */
    pbWizardPageTypeWebService(521),    
    /**@ Web Service List */
    pbWizardPageTypeWebServiceList(520),    
    /**@ Web Services With Links */
    pbWizardPageTypeWebServicesWithLinks(803),    
    /**@ Web Signup Form */
    pbWizardPageTypeWebSignupForm(527),    
    /**@ Web Special */
    pbWizardPageTypeWebSpecial(522);

    private final long value;

    PbWizardPageType(long value) {
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
