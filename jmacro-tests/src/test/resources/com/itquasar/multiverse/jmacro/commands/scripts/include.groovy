/*
START METADATA
name: INCLUDE
infos:
    expectedResult: "included: foo"
END METADATA
 */

echo "Before include-aux"

include "include-aux"

echo "After include-aux"

__RESULT__(included_func(INCLUDED_PROP))



