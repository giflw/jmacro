package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdkey">https://docs.microsoft.com/en-us/office/vba/api/word.wdkey</a>}
*/
public enum WdKey implements COMEnum {
    
    /**@ The 0 key. */
    wdKey0(48),    
    /**@ The 1 key. */
    wdKey1(49),    
    /**@ The 2 key. */
    wdKey2(50),    
    /**@ The 3 key. */
    wdKey3(51),    
    /**@ The 4 key. */
    wdKey4(52),    
    /**@ The 5 key. */
    wdKey5(53),    
    /**@ The 6 key. */
    wdKey6(54),    
    /**@ The 7 key. */
    wdKey7(55),    
    /**@ The 8 key. */
    wdKey8(56),    
    /**@ The 9 key. */
    wdKey9(57),    
    /**@ The A key. */
    wdKeyA(65),    
    /**@ The ALT key. */
    wdKeyAlt(1024),    
    /**@ The B key. */
    wdKeyB(66),    
    /**@ The ` key. */
    wdKeyBackSingleQuote(192),    
    /**@ The \ key. */
    wdKeyBackSlash(220),    
    /**@ The BACKSPACE key. */
    wdKeyBackspace(8),    
    /**@ The C key. */
    wdKeyC(67),    
    /**@ The ] key. */
    wdKeyCloseSquareBrace(221),    
    /**@ The , key. */
    wdKeyComma(188),    
    /**@ The Windows command key or Macintosh COMMAND key. */
    wdKeyCommand(512),    
    /**@ The CTRL key. */
    wdKeyControl(512),    
    /**@ The D key. */
    wdKeyD(68),    
    /**@ The DELETE key. */
    wdKeyDelete(46),    
    /**@ The E key. */
    wdKeyE(69),    
    /**@ The END key. */
    wdKeyEnd(35),    
    /**@ The = key. */
    wdKeyEquals(187),    
    /**@ The ESC key. */
    wdKeyEsc(27),    
    /**@ The F key. */
    wdKeyF(70),    
    /**@ The F1 key. */
    wdKeyF1(112),    
    /**@ The F10 key. */
    wdKeyF10(121),    
    /**@ The F11 key. */
    wdKeyF11(122),    
    /**@ The F12 key. */
    wdKeyF12(123),    
    /**@ The F13 key. */
    wdKeyF13(124),    
    /**@ The F14 key. */
    wdKeyF14(125),    
    /**@ The F15 key. */
    wdKeyF15(126),    
    /**@ The F16 key. */
    wdKeyF16(127),    
    /**@ The F2 key. */
    wdKeyF2(113),    
    /**@ The F3 key. */
    wdKeyF3(114),    
    /**@ The F4 key. */
    wdKeyF4(115),    
    /**@ The F5 key. */
    wdKeyF5(116),    
    /**@ The F6 key. */
    wdKeyF6(117),    
    /**@ The F7 key. */
    wdKeyF7(118),    
    /**@ The F8 key. */
    wdKeyF8(119),    
    /**@ The F9 key. */
    wdKeyF9(120),    
    /**@ The G key. */
    wdKeyG(71),    
    /**@ The H key. */
    wdKeyH(72),    
    /**@ The HOME key. */
    wdKeyHome(36),    
    /**@ The - key. */
    wdKeyHyphen(189),    
    /**@ The I key. */
    wdKeyI(73),    
    /**@ The INSERT key. */
    wdKeyInsert(45),    
    /**@ The J key. */
    wdKeyJ(74),    
    /**@ The K key. */
    wdKeyK(75),    
    /**@ The L key. */
    wdKeyL(76),    
    /**@ The M key. */
    wdKeyM(77),    
    /**@ The N key. */
    wdKeyN(78),    
    /**@ The 0 key. */
    wdKeyNumeric0(96),    
    /**@ The 1 key. */
    wdKeyNumeric1(97),    
    /**@ The 2 key. */
    wdKeyNumeric2(98),    
    /**@ The 3 key. */
    wdKeyNumeric3(99),    
    /**@ The 4 key. */
    wdKeyNumeric4(100),    
    /**@ The 5 key. */
    wdKeyNumeric5(101),    
    /**@ . */
    wdKeyNumeric5Special(12),    
    /**@ The 6 key. */
    wdKeyNumeric6(102),    
    /**@ The 7 key. */
    wdKeyNumeric7(103),    
    /**@ The 8 key. */
    wdKeyNumeric8(104),    
    /**@ The 9 key. */
    wdKeyNumeric9(105),    
    /**@ The + key on the numeric keypad. */
    wdKeyNumericAdd(107),    
    /**@ The . key on the numeric keypad. */
    wdKeyNumericDecimal(110),    
    /**@ The / key on the numeric keypad. */
    wdKeyNumericDivide(111),    
    /**@ The * key on the numeric keypad. */
    wdKeyNumericMultiply(106),    
    /**@ The - key on the numeric keypad. */
    wdKeyNumericSubtract(109),    
    /**@ The O key. */
    wdKeyO(79),    
    /**@ The [ key. */
    wdKeyOpenSquareBrace(219),    
    /**@ The mouse option key or Macintosh OPTION key. */
    wdKeyOption(1024),    
    /**@ The P key. */
    wdKeyP(80),    
    /**@ The PAGE DOWN key. */
    wdKeyPageDown(34),    
    /**@ The PAGE UP key. */
    wdKeyPageUp(33),    
    /**@ The PAUSE key. */
    wdKeyPause(19),    
    /**@ The . key. */
    wdKeyPeriod(190),    
    /**@ The Q key. */
    wdKeyQ(81),    
    /**@ The R key. */
    wdKeyR(82),    
    /**@ The ENTER or RETURN key. */
    wdKeyReturn(13),    
    /**@ The S key. */
    wdKeyS(83),    
    /**@ The SCROLL LOCK key. */
    wdKeyScrollLock(145),    
    /**@ The ; key. */
    wdKeySemiColon(186),    
    /**@ The SHIFT key. */
    wdKeyShift(256),    
    /**@ The ' key. */
    wdKeySingleQuote(222),    
    /**@ The / key. */
    wdKeySlash(191),    
    /**@ The SPACEBAR key. */
    wdKeySpacebar(32),    
    /**@ The T key. */
    wdKeyT(84),    
    /**@ The TAB key. */
    wdKeyTab(9),    
    /**@ The U key. */
    wdKeyU(85),    
    /**@ The V key. */
    wdKeyV(86),    
    /**@ The W key. */
    wdKeyW(87),    
    /**@ The X key. */
    wdKeyX(88),    
    /**@ The Y key. */
    wdKeyY(89),    
    /**@ The Z key. */
    wdKeyZ(90),    
    /**@ No key. */
    wdNoKey(255);

    private final long value;

    WdKey(long value) {
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
