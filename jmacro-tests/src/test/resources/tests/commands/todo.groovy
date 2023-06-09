/*
START METADATA
name: TODO
infos:
    expectedResult: "TODO: TEST"
END METADATA
 */

__RESULT__(
    attempt($QUIET) { todo("TEST") }.throwable.message
)



