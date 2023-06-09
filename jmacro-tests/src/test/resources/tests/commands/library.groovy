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

    def context

    def INCLUDED_PROP = "foo2"

    IncludeAux2(def context) {
        this.context = context
    }

    def included_func(def arg) {
        context.echo IncludeAux1.class
        return "included2: " + arg
    }
}


def includeAux1 = new IncludeAux1()
includeAux1.context = this

def includeAux2 = new IncludeAux2(this)

library("IncludeAux1", includeAux1)
library("IncludeAux2", includeAux2)

__RESULT__(includeAux2.included_func(includeAux2.INCLUDED_PROP))
