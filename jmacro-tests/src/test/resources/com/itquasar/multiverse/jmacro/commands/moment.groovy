import java.time.LocalDate

/*
START METADATA
name: MOMENT
infos:
    expectedResult: true && true
END METADATA
 */
__RESULT__(
    "${moment.today.date().toString() == LocalDate.now().toString()} && ${moment.today.date() == moment.today.date}"
)



