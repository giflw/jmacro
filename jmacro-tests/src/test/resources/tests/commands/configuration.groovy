/*
START METADATA
name: CONFIGURATION
infos:
    expectedResult: "[foo:bar, bool:true, interger:5]"
END METADATA
 */

configuration {
    foo = "bar"
    bool = true
    interger = 5
}
__RESULT__(configuration.configs.toString())



