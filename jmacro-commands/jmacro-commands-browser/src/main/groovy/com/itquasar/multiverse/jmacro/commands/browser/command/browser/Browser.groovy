package com.itquasar.multiverse.jmacro.commands.browser.command.browser

class Browser {

    static final Map<String, ?> UTILS = [
        by: (Object) By
    ]

    RemoteWebDriver driver
    BrowserDevTools _devTools
    BrowserWait wait
    Map<String, Object> elements = [:] as Map<String, Object>

    Map<String, ?> config = [
        vendor : CHROMIUM,
        visible: false, //  true -> visible;  false -> headless
        driver : null, // driver binary path
        binary : null, // browser binary path or path#version
        version: null, // browser binary version
        debug  : false // driver debug
    ]

    BrowserDevTools getDevtools() {
        if (this._devTools == null) {
            this._devTools = new BrowserDevTools(bindings, this)
        }
        return this._devTools
    }

    BrowserDevTools devtools() {
        return this.getDevTools()
    }


    @CompileDynamic
    private void postConfig() {
        if (this.config.binary?.contains('#')) {
            Collection parts = this.config.binary.split('#')
            this.config.binary = parts[0]
            this.config.version = parts[1]
        }
        this.config.visible = this.config.visible ?: false
    }

    Browser start() {
        if (driver == null || driver.sessionId == null) {
            this.postConfig()
            Capabilities capabilities = null
            switch (config.vendor) {
                case FIREFOX:
                    capabilities = new FirefoxOptions()
                    if (!config.visible) {
                        capabilities.addArguments("-headless")
                    }
                    if (config.binary != null) {
                        capabilities.setBinary(config.binary.toString())
                    }
                    break
                case CHROMIUM:
                case CHROME:
                case EDGE:
                    if (config.debug) {
                        System.setProperty("webdriver.chrome.verboseLogging", "true")
                    }
                    capabilities = EDGE == config.vendor ? new EdgeOptions() : new ChromeOptions()
                    if (!config.visible) {
                        capabilities.addArguments("--headless=new")
                    }
                    if (config.binary != null) {
                        capabilities.setBinary(config.binary.toString())
                    }
                    //capabilities.addArguments("--disable-extensions")
                    break
            }
            //capabilities.addArguments("--ignore-certificate-errors")

            logger.warn("Starting browser ${config.vendor.toString().capitalize()}")
            this.config.forEach { key, value ->
                logger.warn("Browser config ${key}=${value}")
            }

            this.driver = (RemoteWebDriver) getWebDriverManager(capabilities).create()

            getLogger().warn("Web driver instance ${this.driver} with ${capabilities.asMap()}")
            if (this.driver == null) {
                throw new JMacroException("Unsupported browser vendor: ${config.vendor}")
            }
            this.wait = new BrowserWait(this)
            // driver.manage().window().maximize()
            logger.warn("Browser ${config.vendor.toString().capitalize()} started")
        }
        return this
    }

    Browser configure(Map<String, Object> config) {
        this.config.putAll(config)
        this.postConfig()
        return this
    }

    Browser configure(ConfigObject config) {
        this.config.putAll(config.spread())
        this.postConfig()
        return this
    }

    @CompileDynamic
    Browser configure(def configuration) {
        return configure(configuration.contains('browser') ? configuration.browser : configuration.configs)
    }

    def wait(String cssSelector) {
        return this.wait.call(this, cssSelector)
    }

    def wait(String cssSelector, BigDecimal timeout) {
        return this.wait.call(this, cssSelector, timeout)
    }

    def wait(WebElementWrapper element) {
        return this.wait.call(this, element)
    }

    def wait(WebElementWrapper element, BigDecimal timeout) {
        return this.wait.call(this, element, timeout)
    }

    Browser open(String url) {
        try {
            start()
            driver.get(url)
        } catch (Exception ex) {
            throw new JMacroException(this, "Could not start/open ${config.vendor.toString().capitalize()}.", ex)
        }
    }


    BrowserCommand elements(Closure closure) {
        touch()
        BrowserElements fields = new BrowserElements(this)
        closure.delegate = fields
        closure.resolveStrategy = Closure.DELEGATE_ONLY
        closure()
        return this
    }

    def el(String name) {
        touch()
        if (!this.elements.containsKey(name)) {
            By by = By.cssSelector(name)
            def elements = this.driver.findElements(by)
            return new WebElementWrapper(by, elements ? elements.first() : null)
        }
        return this.elements[name]
    }

    def el(element) {
        touch()
        return element
    }

    def els(String name) {
        touch()
        if (!this.elements.containsKey(name)) {
            By by = By.cssSelector(name)
            return this.driver.findElements(by).collect { new WebElementWrapper(by, it) }
        }
        return this.elements[name]
    }

    def els(elements) {
        touch()
        return elements
    }

    @CompileDynamic
    def check(String element, Closure checkLogic) {
        touch()
        def elements = this.els(element)?.first()
        if (elements) {
            return checkLogic(elements)
        }
    }

    def checks(String element, Closure checkLogic) {
        touch()
        def elements = this.els(element)
        if (elements) {
            return checkLogic(elements)
        }
    }


    @CompileDynamic
    def propertyMissing(String name) {
        touch()
        if (this.elements.containsKey(name)) {
            return this.elements[name]
        }
        if (this.bindings.containsKey(name)) {
            return this.bindings."$name"
        }
        if (BrowserWait.EXPECTED_CONDITIONS.containsKey(name)) {
            return name
        }
        if (UTILS.containsKey(name)) {
            return UTILS.get(name)
        }
        try {
            return Keys."$name"
        } catch (Exception ex) {
            // FIXME ADD debug logger
            try {
                Command.propertyMissingOn(context, name)
            } catch (Exception ex2) {
                // FIXME ADD debug logger
                return name
            }
        }
    }


    @CompileDynamic
    def methodMissing(String name, def args) {
        touch()
        if (driver.respondsTo(name, args)) {
            return driver."${name}"(*args)
        }
        return methodMissingOn(context, name, args)
    }

    JFile screenshot(Path destinationFile) {
        touch()
        return screenshot(destinationFile.toString())
    }

    JFile screenshot(String destinationFile) {
        touch()
        JFile scrFile = driver.getScreenshotAs(OutputType.FILE)
        JFile destFile = new JFile(destinationFile)
        this.logger.info("Screenshot: $destFile")
        FileUtils.copyFile(scrFile, destFile)
        return destFile
    }

    JFile fullpage(Path destinationFile) {
        touch()
        return fullpage(destinationFile.toString())
    }

    JFile fullpage(String destinationFile) {
        touch()
        Screenshot screenshot = new AShot()
            .shootingStrategy(ShootingStrategies.viewportPasting(1000))
            .takeScreenshot(driver)
        JFile destFile = new JFile(destinationFile)
        this.logger.info("FullPage screenshot: $destFile")
        ImageIO.write(screenshot.getImage(), 'PNG', destFile)
        return destFile
    }

    Dimension windowSize(int width, int height) {
        touch()
        Dimension dimension = new Dimension(width, height)
        driver.manage().window().setSize(dimension)
        return dimension
    }

    void maximize() {
        touch()
        driver.manage().window().maximize()
    }


    void close() {
        if (driver) {
            getLogger().warn("Closing browser...")
            if (devTools) {
                devTools.close()
            }
            driver.quit()
            getLogger().warn("...browser closed.")
        }
    }

}