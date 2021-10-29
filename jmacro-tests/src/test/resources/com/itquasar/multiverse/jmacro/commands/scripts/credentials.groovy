/*
START METADATA
name: CREDENTIALS
infos:
    expectedResult: DOMAIN NAME | ANY_TOKEN
END METADATA
 */

credentials {
    token = "ANY_TOKEN"
    domain = "DOMAIN NAME"
}
echo credentials
__RESULT__("${credentials.domain} | ${credentials.token}")



