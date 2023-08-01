/*
START METADATA
name: BASE64
infos:
    expectedResult: 'bar && true && false'
END METADATA
 */

result(base64.decode(base64.encode('bar && true && false')))
