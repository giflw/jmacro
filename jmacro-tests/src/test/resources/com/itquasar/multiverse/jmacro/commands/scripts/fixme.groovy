/*
START METADATA
name: FIXME
infos:
    expectedResult: "FIXME: TEST"
END METADATA
 */

__RESULT__(
    attempt(QUIET) { fixme("TEST") }.throwable.message
)



