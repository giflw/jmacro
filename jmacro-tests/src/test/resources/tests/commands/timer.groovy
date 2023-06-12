/*
START METADATA
name: TIMER
infos:
    expectedResult: true
END METADATA
 */


timer.start()
timer.partial()
timer.partial("FOO")
timer.stop()
timer.log()

result(timer.start > timer.stop)
