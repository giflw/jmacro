package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.outlook;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/outlook.olexchangeconnectionmode">https://docs.microsoft.com/en-us/office/vba/api/outlook.olexchangeconnectionmode</a>}
*/
public enum OlExchangeConnectionMode implements COMEnum {
    
    /**@ The account is using cached Exchange mode such that headers are downloaded first, followed by the bodies and attachments of full items. */
    olCachedConnectedDrizzle(600),    
    /**@ The account is using cached Exchange mode on a Local Area Network or a fast connection with the Exchange server. The user can also select this state manually, disabling auto-detect logic and always downloading full items regardless of connection speed. */
    olCachedConnectedFull(700),    
    /**@ The account is using cached Exchange mode on a dial-up or slow connection with the Exchange server, such that only headers are downloaded. Full item bodies and attachments remain on the server. The user can also select this state manually regardless of connection speed. */
    olCachedConnectedHeaders(500),    
    /**@ The account is using cached Exchange mode with a disconnected connection to the Exchange server. */
    olCachedDisconnected(400),    
    /**@ The account is using cached Exchange mode and the user has selected Work Offline from the File menu. */
    olCachedOffline(200),    
    /**@ The account has a disconnected connection to the Exchange server. */
    olDisconnected(300),    
    /**@ The account does not use an Exchange server. */
    olNoExchange(0),    
    /**@ The account is not connected to an Exchange server and is in the classic offline mode. This also occurs when the user selects Work Offline from the File menu. */
    olOffline(100),    
    /**@ The account is connected to an Exchange server and is in the classic online mode. */
    olOnline(800);

    private final long value;

    OlExchangeConnectionMode(long value) {
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
