/*
START METADATA
name: FIXME
infos:
    expectedResult: "FIXME: TEST"
END METADATA
 */

result(
    attempt($QUIET) { fixme("TEST") }.throwable.message
)



