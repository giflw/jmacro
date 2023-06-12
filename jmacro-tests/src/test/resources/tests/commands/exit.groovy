import com.itquasar.multiverse.jmacro.core.exception.ExitException

/*
START METADATA
name: EXIT
infos:
    expectedResult: Should raise exception with exit codes 0 and 1
    exitCode: 127
END METADATA
 */

try {
    exit()
} catch (ExitException exception) {
    exitCode1 = exception.getExitCode()
}

try {
    exit(1)
} catch (ExitException exception) {
    exitCode2 = exception.getExitCode()
}

result("Should raise exception with exit codes $exitCode1 and $exitCode2")

exit(127)


