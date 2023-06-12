/*
START METADATA
name: PARALLEL
infos:
    expectedResult: true
END METADATA
 */

def p = parallel("test", 1, 4)

(1..10).each { n ->
    echo "SUBMIT $n"
    p.submit({
        echo "1. ${n}"
        pause 1
        echo "2. ${n}"
    })
    echo "$n SUBMITED"
}
echo "SHUTDOWN HERE"
p.shutdown()

result(true)


