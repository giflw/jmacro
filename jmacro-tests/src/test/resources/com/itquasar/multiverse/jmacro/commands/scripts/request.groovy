/*
START METADATA
name: REQUEST
infos:
    expectedResult: Example Domain
END METADATA
 */

def req = request {
    GET "https://example.com/"
}

__RESULT__(req.response.data.title())
