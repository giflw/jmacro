package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.publisher;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/publisher.pbpresetwordart">https://docs.microsoft.com/en-us/office/vba/api/publisher.pbpresetwordart</a>}
*/
public enum PbPresetWordArt implements COMEnum {
    
    /**@ Style 1 */
    pbPresetWordArt1(0),    
    /**@ Style 2 */
    pbPresetWordArt2(1),    
    /**@ Style 3 */
    pbPresetWordArt3(2),    
    /**@ Style 4 */
    pbPresetWordArt4(3),    
    /**@ Style 5 */
    pbPresetWordArt5(4),    
    /**@ Style 6 */
    pbPresetWordArt6(5),    
    /**@ Style 7 */
    pbPresetWordArt7(6),    
    /**@ Style 8 */
    pbPresetWordArt8(7),    
    /**@ Style 9 */
    pbPresetWordArt9(8),    
    /**@ Style 10 */
    pbPresetWordArt10(9),    
    /**@ Style 11 */
    pbPresetWordArt11(10),    
    /**@ Style 12 */
    pbPresetWordArt12(11),    
    /**@ Style 13 */
    pbPresetWordArt13(12),    
    /**@ Style 14 */
    pbPresetWordArt14(13),    
    /**@ Style 15 */
    pbPresetWordArt15(14),    
    /**@ Style 16 */
    pbPresetWordArt16(15),    
    /**@ Style 17 */
    pbPresetWordArt17(16),    
    /**@ Style 18 */
    pbPresetWordArt18(17),    
    /**@ Style 19 */
    pbPresetWordArt19(18),    
    /**@ Style 20 */
    pbPresetWordArt20(19),    
    /**@ Style 21 */
    pbPresetWordArt21(20),    
    /**@ Style 22 */
    pbPresetWordArt22(21),    
    /**@ Style 23 */
    pbPresetWordArt23(22),    
    /**@ Style 24 */
    pbPresetWordArt24(23),    
    /**@ Style 25 */
    pbPresetWordArt25(24),    
    /**@ Style 26 */
    pbPresetWordArt26(25),    
    /**@ Style 27 */
    pbPresetWordArt27(26),    
    /**@ Style 28 */
    pbPresetWordArt28(27),    
    /**@ Style 29 */
    pbPresetWordArt29(28),    
    /**@ Style 30 */
    pbPresetWordArt30(29),    
    /**@ Style 31 */
    pbPresetWordArt31(30),    
    /**@ Style 32 */
    pbPresetWordArt32(31),    
    /**@ Style 33 */
    pbPresetWordArt33(32),    
    /**@ Style 34 */
    pbPresetWordArt34(33),    
    /**@ Style 35 */
    pbPresetWordArt35(34),    
    /**@ Style 36 */
    pbPresetWordArt36(35),    
    /**@ Style 37 */
    pbPresetWordArt37(36),    
    /**@ Style 38 */
    pbPresetWordArt38(37),    
    /**@ Style 39 */
    pbPresetWordArt39(38),    
    /**@ Style 40 */
    pbPresetWordArt40(39),    
    /**@ Style 41 */
    pbPresetWordArt41(40),    
    /**@ Style 42 */
    pbPresetWordArt42(41),    
    /**@ Style 43 */
    pbPresetWordArt43(42),    
    /**@ Style 44 */
    pbPresetWordArt44(43),    
    /**@ Style 45 */
    pbPresetWordArt45(44),    
    /**@ Style 46 */
    pbPresetWordArt46(45),    
    /**@ Style 47 */
    pbPresetWordArt47(46),    
    /**@ Style 48 */
    pbPresetWordArt48(47),    
    /**@ Style 49 */
    pbPresetWordArt49(48),    
    /**@ Style 50 */
    pbPresetWordArt50(49),    
    /**@ Style 51 */
    pbPresetWordArt51(50),    
    /**@ Style 52 */
    pbPresetWordArt52(51),    
    /**@ Style 53 */
    pbPresetWordArt53(52),    
    /**@ Style 54 */
    pbPresetWordArt54(53),    
    /**@ Style 55 */
    pbPresetWordArt55(54),    
    /**@ Style 56 */
    pbPresetWordArt56(55),    
    /**@ Style 57 */
    pbPresetWordArt57(56),    
    /**@ Style 58 */
    pbPresetWordArt58(57),    
    /**@ Style 59 */
    pbPresetWordArt59(58),    
    /**@ Style 60 */
    pbPresetWordArt60(59),    
    /**@ A combination of styles */
    pbPresetWordArtMixed(-2);

    private final long value;

    PbPresetWordArt(long value) {
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
