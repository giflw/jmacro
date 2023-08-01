/*
START METADATA
name: CONFIGURATION
infos:
    expectedResult: "[foo:bar, bool:true, interger:5]"
END METADATA
 */

configuration {
    it.foo = "bar"
}

configuration.with {
    bool = true
}

configuration interger: 5
result.ok(configuration.toString())



