import java.util.concurrent.atomic.AtomicInteger

/*
START METADATA
name: PARALLEL
infos:
    expectedResult: 10
END METADATA
 */

def p = parallel("test", 1, 4)

AtomicInteger count = new AtomicInteger(0)

(1..10).each { n ->
    echo "SUBMIT $n"
    p.submit({
        echo "1. ${n}"
        pause 1
        echo "2. ${n}"
        count.incrementAndGet()
    })
    echo "$n SUBMITED"
}
echo "SHUTDOWN HERE"
p.shutdown()

result(count.get())


