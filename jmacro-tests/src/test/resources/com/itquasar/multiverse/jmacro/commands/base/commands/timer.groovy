/*
START METADATA
name: TIMER
END METADATA
 */


timer.start()
timer.partial()
timer.partial("FOO")
timer.stop()
timer.log()

__RESULT__(timer.start > timer.stop)
