/*
START METADATA
name: CONFIGURATION
infos:
    expectedResult: "[foo:bar, bool:true, other:from map, integer:5] | vendor=FOOBAR"
END METADATA
 */
configuration {
    it.foo = "bar"
    it.browser.vendor = 'FOOBAR'
}

configuration.with {
    bool = true
}

configuration.fill other: 'from map'

configuration { cfg ->
    cfg.integer = 5
}

configuration.each {
    echo "Configuration entry: $it"
}

result.ok(configuration.custom.toString() + " | vendor=" + configuration.browser.vendor)



