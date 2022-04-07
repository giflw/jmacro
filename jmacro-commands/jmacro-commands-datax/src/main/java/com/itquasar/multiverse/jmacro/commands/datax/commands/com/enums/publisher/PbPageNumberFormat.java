package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbpagenumberformat">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbpagenumberformat</a>}
*/
public enum PbPageNumberFormat implements COMEnum {
    
    /**@ Aiueo */
    pbPageNumberFormatAiueo(12),    
    /**@ Arabic */
    pbPageNumberFormatArabic(0),    
    /**@ Arabic1 */
    pbPageNumberFormatArabic1(46),    
    /**@ Arabic2 */
    pbPageNumberFormatArabic2(48),    
    /**@ ArabicLZ */
    pbPageNumberFormatArabicLZ(22),    
    /**@ Cardtext */
    pbPageNumberFormatCardtext(6),    
    /**@ ChnDbNum2 */
    pbPageNumberFormatChnDbNum2(38),    
    /**@ ChnDbNum3 */
    pbPageNumberFormatChnDbNum3(39),    
    /**@ Chosung */
    pbPageNumberFormatChosung(25),    
    /**@ Circlenum */
    pbPageNumberFormatCirclenum(18),    
    /**@ DAiueo */
    pbPageNumberFormatDAiueo(20),    
    /**@ DbChar */
    pbPageNumberFormatDbChar(14),    
    /**@ DbNum1 */
    pbPageNumberFormatDbNum1(10),    
    /**@ DbNum2 */
    pbPageNumberFormatDbNum2(11),    
    /**@ DbNum3 */
    pbPageNumberFormatDbNum3(16),    
    /**@ DIroha */
    pbPageNumberFormatDIroha(21),    
    /**@ Ganada */
    pbPageNumberFormatGanada(24),    
    /**@ Hebrew1 */
    pbPageNumberFormatHebrew1(45),    
    /**@ Hebrew2 */
    pbPageNumberFormatHebrew2(47),    
    /**@ Hindi1 */
    pbPageNumberFormatHindi1(49),    
    /**@ Hindi2 */
    pbPageNumberFormatHindi2(50),    
    /**@ Hindi3 */
    pbPageNumberFormatHindi3(51),    
    /**@ Hindi4 */
    pbPageNumberFormatHindi4(52),    
    /**@ Iroha */
    pbPageNumberFormatIroha(13),    
    /**@ KorDbNum1 */
    pbPageNumberFormatKorDbNum1(41),    
    /**@ KorDbNum2 */
    pbPageNumberFormatKorDbNum2(42),    
    /**@ KorDbNum3 */
    pbPageNumberFormatKorDbNum3(43),    
    /**@ KorDbNum4 */
    pbPageNumberFormatKorDbNum4(44),    
    /**@ LC Letter */
    pbPageNumberFormatLCLetter(4),    
    /**@ LC Roman */
    pbPageNumberFormatLCRoman(2),    
    /**@ LC Rus */
    pbPageNumberFormatLCRus(58),    
    /**@ Ordinal */
    pbPageNumberFormatOrdinal(5),    
    /**@ Ordtext */
    pbPageNumberFormatOrdtext(7),    
    /**@ Thai1 */
    pbPageNumberFormatThai1(53),    
    /**@ Thai2 */
    pbPageNumberFormatThai2(54),    
    /**@ Thai3 */
    pbPageNumberFormatThai3(55),    
    /**@ TpeDbNum2 */
    pbPageNumberFormatTpeDbNum2(34),    
    /**@ TpeDbNum3 */
    pbPageNumberFormatTpeDbNum3(35),    
    /**@ UC Letter */
    pbPageNumberFormatUCLetter(3),    
    /**@ UC Roman */
    pbPageNumberFormatUCRoman(1),    
    /**@ UC Rus */
    pbPageNumberFormatUCRus(59),    
    /**@ Viet 1 */
    pbPageNumberFormatViet1(56),    
    /**@ Zodiac1 */
    pbPageNumberFormatZodiac1(30),    
    /**@ Zodiac2 */
    pbPageNumberFormatZodiac2(31);

    private final long value;

    PbPageNumberFormat(long value) {
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
