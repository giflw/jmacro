/*
START METADATA
name: INCLUDE
infos:
    expectedResult: "included: foo"
END METADATA
 */

echo "Before library"

include "IncludeAux1", "IncludeAux2" from "library"

echo "After library"

// FIXME throw exception if succeds
attempt($QUIET) {
    println "Trying SCRIPT_CONTEXT"
    println SCRIPT_CONTEXT
}

// FIXME throw exception if succeds
attempt($QUIET) {
    println "Trying included_func(INCLUDED_PROP)"
    included_func(INCLUDED_PROP)
}

IncludeAux2.included_func(IncludeAux2.INCLUDED_PROP)

IncludeAux2.with {
    included_func(INCLUDED_PROP)
}


result(IncludeAux1.included_func(IncludeAux1.INCLUDED_PROP))



