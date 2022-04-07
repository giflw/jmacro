package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.word;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/word.wdcountry">https://docs.microsoft.com/en-us/office/vba/api/word.wdcountry</a>}
*/
public enum WdCountry implements COMEnum {
    
    /**@ Argentina */
    wdArgentina(54),    
    /**@ Brazil */
    wdBrazil(55),    
    /**@ Canada */
    wdCanada(2),    
    /**@ Chile */
    wdChile(56),    
    /**@ China */
    wdChina(86),    
    /**@ Denmark */
    wdDenmark(45),    
    /**@ Finland */
    wdFinland(358),    
    /**@ France */
    wdFrance(33),    
    /**@ Germany */
    wdGermany(49),    
    /**@ Iceland */
    wdIceland(354),    
    /**@ Italy */
    wdItaly(39),    
    /**@ Japan */
    wdJapan(81),    
    /**@ Korea */
    wdKorea(82),    
    /**@ Latin America */
    wdLatinAmerica(3),    
    /**@ Mexico */
    wdMexico(52),    
    /**@ Netherlands */
    wdNetherlands(31),    
    /**@ Norway */
    wdNorway(47),    
    /**@ Peru */
    wdPeru(51),    
    /**@ Spain */
    wdSpain(34),    
    /**@ Sweden */
    wdSweden(46),    
    /**@ Taiwan */
    wdTaiwan(886),    
    /**@ United Kingdom */
    wdUK(44),    
    /**@ United States */
    wdUS(1),    
    /**@ Venezuela */
    wdVenezuela(58);

    private final long value;

    WdCountry(long value) {
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
