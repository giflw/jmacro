package com.itquasar.multiverse.jmacro.commands.browser.command.browser;

import com.itquasar.multiverse.jmacro.core.Constants;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.service.DriverService;

import java.util.List;
import java.util.Map;

/**
 * Gecko/Firefox
 */
public class ChromiumBrowserDriverFactory implements BrowserDriverFactory, Constants {

    @Override
    public List<String> browserNames() {
        return List.of(CHROMIUM, CHROME, EDGE);
    }

    @Override
    public RemoteWebDriver create(Map<String, ?> config) {
        checkVendor(config);
        switch ((String) config.get("vendor")) {
            case EDGE: {
                Tuple<EdgeDriverService, EdgeOptions> tuple = this.chromium(config, new EdgeOptions(), new EdgeDriverService.Builder());
                return new EdgeDriver(tuple.first(), tuple.second());
            }
            case CHROME:
            case CHROMIUM:
            default: {
                Tuple<ChromeDriverService, ChromeOptions> tuple = this.chromium(config, new ChromeOptions(), new ChromeDriverService.Builder());
                return new ChromeDriver(tuple.first(), tuple.second());
            }
        }
    }

    private <CO extends ChromiumOptions, DSB extends DriverService.Builder, DS extends DriverService> Tuple<DS, CO> chromium(Map<String, ?> config, CO options, DSB builder) {
        if (!(boolean) config.get("visible")) {
            options.setHeadless(true);
        }
        DriverService service = builder
            .usingPort((int) config.get("port"))
            .build();
        return new Tuple<DS, CO>((DS) service, options);
    }

    record Tuple<T1, T2>(T1 first, T2 second) {
    }
}
