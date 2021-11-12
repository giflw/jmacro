/*
START METADATA
name: CREDENTIALS
infos:
    expectedResult: DOMAIN NAME | ANY_TOKEN | ANY LOGIN
END METADATA
 */

credentials {
    login = "ANY LOGIN"
    token = "ANY_TOKEN"
    domain = "DOMAIN NAME"
}
echo credentials
__RESULT__("${credentials.domain} | ${credentials.token} | ${credentials.login}")



