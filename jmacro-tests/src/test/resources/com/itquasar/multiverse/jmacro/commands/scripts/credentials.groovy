/*
START METADATA
name: CREDENTIALS
infos:
    expectedResult: DOMAIN NAME\username | ANY_TOKEN
END METADATA
 */

credentials {
    login = "username"
    token = "ANY_TOKEN"
    domain = "DOMAIN NAME"
}
__RESULT__("${credentials.fullUser} | ${credentials.token}")



