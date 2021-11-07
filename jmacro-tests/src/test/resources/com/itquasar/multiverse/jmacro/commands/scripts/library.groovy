/*
START METADATA
name: LIBRARY
infos:
    expectedResult: "included2: foo2"
END METADATA
 */

echo "library script with IncludeAux1 and IncludeAux2 libs"

class IncludeAux1 {

    def context

    def INCLUDED_PROP = "foo"

    def included_func(def arg) {
        context.echo IncludeAux1.class
        return "included: " + arg
    }
}

class IncludeAux2 {

    static def context

    static def INCLUDED_PROP = "foo2"

    static def included_func(def arg) {
        context.echo IncludeAux1.class
        return "included2: " + arg
    }
}


def includeAux1 = new IncludeAux1()
includeAux1.context = this

IncludeAux2.context = this

library("IncludeAux1", includeAux1)
library("IncludeAux2", IncludeAux2)

__RESULT__(IncludeAux2.included_func(IncludeAux2.INCLUDED_PROP))
