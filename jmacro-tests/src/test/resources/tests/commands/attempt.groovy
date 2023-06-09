/*
START METADATA
name: ATTEMPT
infos:
    expectedResult: 'For input string: "abc" && 123 && NumberFormatException'
END METADATA
 */

def number = attempt {
    Integer.valueOf("123")
}.value

def tmpEx = ''
def exceptionType = ''

def attemptResult = attempt($QUIET) {
    Integer.valueOf("abc")
} capture { IOException ex ->
    raise('Should not be here')
} capture(NumberFormatException.class) { ex ->
    tmpEx = ex.class.simpleName
} capture { Exception ex ->
    raise('Should not be here')
} lastly {
    exceptionType = tmpEx
}

def attemptResult2 = attempt($QUIET) {
    Integer.valueOf("abc")
} capture { IOException ex ->
    raise('Should not be here')
} capture { NumberFormatException ex ->
    tmpEx = ex.class.simpleName
} capture { Exception ex ->
    raise('Should not be here')
} lastly {
    exceptionType = tmpEx
}

if (attemptResult.throwable.message != attemptResult2.throwable.message) {
    raise 'Houston, we have a problem!'
}

__RESULT__("${attemptResult.throwable.message} && ${number} && ${exceptionType}")
