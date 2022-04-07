package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.excel;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/excel.xliconset">https://docs.microsoft.com/en-us/office/vba/api/excel.xliconset</a>}
*/
public enum XlIconSet implements COMEnum {
    
    /**@ 3 Arrows */
    xl3Arrows(1),    
    /**@ 3 Arrows Gray */
    xl3ArrowsGray(2),    
    /**@ 3 Flags */
    xl3Flags(3),    
    /**@ 3 Signs */
    xl3Signs(6),    
    /**@ 3 Symbols */
    xl3Symbols(7),    
    /**@ 3 Traffic Lights 1 */
    xl3TrafficLights1(4),    
    /**@ 3 Traffic Lights 2 */
    xl3TrafficLights2(5),    
    /**@ 4 Arrows */
    xl4Arrows(8),    
    /**@ 4 Arrows Gray */
    xl4ArrowsGray(9),    
    /**@ 4 CRV */
    xl4CRV(11),    
    /**@ 4 Red To Black */
    xl4RedToBlack(10),    
    /**@ 4 Traffic Lights */
    xl4TrafficLights(12),    
    /**@ 5 Arrows */
    xl5Arrows(13),    
    /**@ 5 Arrows Gray */
    xl5ArrowsGray(14),    
    /**@ 5 CRV */
    xl5CRV(15),    
    /**@ 5 Quarters */
    xl5Quarters(16);

    private final long value;

    XlIconSet(long value) {
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
