import com.itquasar.multiverse.tn3270j.WaitMode

/*
START METADATA
name: TN3270
infos:
    expectedResult: "TSO User  HERC01"
END METADATA
 */


tn3270 {
    open '127.0.0.1:3270'
    logger.warn screenshot()
    attempt(QUIET) {
        wait 30, WaitMode.InputField
    }
    logger.warn screenshot()
    write 23, 12, "HERC01"
    send "enter"
    wait WaitMode.InputField
    logger.warn screenshot()
    write 2, 2, "CUL8TR"
    send "enter"
    wait 5
    logger.warn screenshot()
    send "enter"
    wait 5
    logger.warn screenshot()
    send "enter"
    wait 5
    logger.warn screenshot()

    /*write 5, 14, "x"
    // FIXME moveCuror -> move or point or select ????
    send "enter"
    wait WaitMode.InputField
    logger.warn screenshot()
    write 6, 1, "shutdown"
    send "enter"
    wait WaitMode.InputField
    logger.warn screenshot()
    write 9, 1, "logoff"
    send "enter"
    wait WaitMode.InputField
    logger.warn screenshot()*/

    __RESULT__(read(3, 1, 20))

    attempt(QUIET) {
        close()
    }
}
