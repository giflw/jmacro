/*
START METADATA
name: PAUSE
infos:
    expectedResult: true
END METADATA
 */

long start = System.currentTimeSeconds()
pause(2.1)
long end = System.currentTimeSeconds()

result((end - start) >= 2)



