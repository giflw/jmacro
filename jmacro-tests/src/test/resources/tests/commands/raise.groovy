/*
START METADATA
name: RAISE
infos:
    expectedResult: Should raise exception
END METADATA
 */
result(
    // can be used anywhere to raise an exception
    attempt($QUIET) {
        raise("Should raise exception")
    }.throwable.message
)



