package com.itquasar.multiverse.jmacro.commands
/*
START METADATA
name: ATTEMPT
infos:
    expectedResult: Should be catch by attempt && 123
END METADATA
 */

def number = attempt {
    Integer.valueOf("123")
}.value

def attemptResult = attempt (QUIET){
    raise("Should be catch by attempt")
}

__RESULT__("${attemptResult.throwable.message} && ${number}")
