package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pblisttype">https://docs.microsoft.com/en-us/office/vba/api/publisher.pblisttype</a>}
*/
public enum PbListType implements COMEnum {
    
    /**@ Aiueo */
    pbListTypeAiueo(12),    
    /**@ Arabic */
    pbListTypeArabic(0),    
    /**@ Arabic1 */
    pbListTypeArabic1(46),    
    /**@ Arabic2 */
    pbListTypeArabic2(48),    
    /**@ Arabic Leading Zero */
    pbListTypeArabicLeadingZero(22),    
    /**@ Bullet */
    pbListTypeBullet(23),    
    /**@ Cardinal Text */
    pbListTypeCardinalText(6),    
    /**@ ChnDbNum2 */
    pbListTypeChnDbNum2(38),    
    /**@ ChnDbNum3 */
    pbListTypeChnDbNum3(39),    
    /**@ Chosung */
    pbListTypeChosung(25),    
    /**@ Circle num */
    pbListTypeCirclenum(18),    
    /**@ DAiueo */
    pbListTypeDAiueo(20),    
    /**@ DbChar */
    pbListTypeDbChar(14),    
    /**@ DbNum1 */
    pbListTypeDbNum1(10),    
    /**@ DbNum2 */
    pbListTypeDbNum2(11),    
    /**@ DbNum3 */
    pbListTypeDbNum3(16),    
    /**@ DbNum4 */
    pbListTypeDbNum4(17),    
    /**@ DIroha */
    pbListTypeDIroha(21),    
    /**@ Ganada */
    pbListTypeGanada(24),    
    /**@ Hebrew1 */
    pbListTypeHebrew1(45),    
    /**@ Hebrew2 */
    pbListTypeHebrew2(47),    
    /**@ Hindi1 */
    pbListTypeHindi1(49),    
    /**@ Hindi2 */
    pbListTypeHindi2(50),    
    /**@ Hindi3 */
    pbListTypeHindi3(51),    
    /**@ Hindi4 */
    pbListTypeHindi4(52),    
    /**@ Iroha */
    pbListTypeIroha(13),    
    /**@ KorDbNum1 */
    pbListTypeKorDbNum1(41),    
    /**@ KorDbNum2 */
    pbListTypeKorDbNum2(42),    
    /**@ KorDbNum3 */
    pbListTypeKorDbNum3(43),    
    /**@ KorDbNum4 */
    pbListTypeKorDbNum4(44),    
    /**@ Lowercase Letter */
    pbListTypeLowerCaseLetter(4),    
    /**@ Lowercase Roman */
    pbListTypeLowerCaseRoman(2),    
    /**@ Lowercase Russian */
    pbListTypeLowerCaseRussian(58),    
    /**@ None */
    pbListTypeNone(255),    
    /**@ Ordinal */
    pbListTypeOrdinal(5),    
    /**@ OrdinalText */
    pbListTypeOrdinalText(7),    
    /**@ Thai1 */
    pbListTypeThai1(53),    
    /**@ Thai2 */
    pbListTypeThai2(54),    
    /**@ Thai3 */
    pbListTypeThai3(55),    
    /**@ DbNum2 */
    pbListTypeTpeDbNum2(34),    
    /**@ DbNum3 */
    pbListTypeTpeDbNum3(35),    
    /**@ Uppercase Letter */
    pbListTypeUpperCaseLetter(3),    
    /**@ Uppercase Roman */
    pbListTypeUpperCaseRoman(1),    
    /**@ Uppercase Russian */
    pbListTypeUpperCaseRussian(59),    
    /**@ Vietnamese1 */
    pbListTypeVietnamese1(56),    
    /**@ Zodiac1 */
    pbListTypeZodiac1(30),    
    /**@ Zodiac2 */
    pbListTypeZodiac2(31);

    private final long value;

    PbListType(long value) {
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
