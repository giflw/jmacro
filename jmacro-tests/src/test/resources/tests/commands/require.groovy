/*
START METADATA
name: REQUIRE
infos:
    expectedResult: 'Required API version 999999.0.0 not supported.'
END METADATA
 */

def message = null
attempt($QUIET) {
    require api: 999999
} capture { ex ->
    message = ex.message
}
result(message.split(' Actual').first())



