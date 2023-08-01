package tests.commands

echo "library script with IncludeAux1 and IncludeAux2 libs"

class IncludeAux1 {

    def INCLUDED_PROP = "foo"

    def included_func(def arg) {
        echo IncludeAux1.class
        return "included: " + arg
    }
}

class IncludeAux2 {

    def INCLUDED_PROP = "foo2"

    def included_func(def arg) {
        echo IncludeAux1.class
        return "included2: " + arg
    }
}


def includeAux1 = new IncludeAux1()
def includeAux2 = new IncludeAux2()

export("IncludeAux1", includeAux1)
export("IncludeAux2", includeAux2)
