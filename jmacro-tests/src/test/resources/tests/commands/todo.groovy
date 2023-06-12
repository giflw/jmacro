/*
START METADATA
name: TODO
infos:
    expectedResult: "TODO: TEST"
END METADATA
 */

result(
    attempt($QUIET) { todo("TEST") }.throwable.message
)



