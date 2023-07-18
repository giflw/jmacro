/*
START METADATA
name: ARGS
infos:
    expectedResult: 'bar && true && false'
END METADATA
 */

def foo_eq_bar = args("foo")
def minus_foo = args('--foo')
def bar = args("bar")

assert foo_eq_bar == 'bar'
assert minus_foo == true
assert bar == false

result("${foo_eq_bar} && ${minus_foo} && ${bar}")
