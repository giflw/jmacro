/*
START METADATA
name: CREDENTIALS
infos:
    expectedResult: DOMAIN NAME | ANY_TOKEN | ANY LOGIN
END METADATA
 */

credentials.with {
    login = "ANY LOGIN"
    token = "ANY_TOKEN"
    domain = "DOMAIN NAME"
}
echo credentials
result("${credentials.domain} | ${credentials.token} | ${credentials.login}")



