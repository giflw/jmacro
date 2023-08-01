/*
START METADATA
name: EXPORT
infos:
    expectedResult: "included2: foo2 | [Result] Exit code: 0 | Value: null | Excption: null"
END METADATA
 */

include "IncludeAux1", "IncludeAux2" from "library"

result(IncludeAux2.included_func(IncludeAux2.INCLUDED_PROP) + " | " + IncludeAux1.result)
