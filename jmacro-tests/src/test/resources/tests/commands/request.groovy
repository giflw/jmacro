/*
START METADATA
name: REQUEST
infos:
    expectedResult: Example Domain
END METADATA
 */

def req = request {
    it.with {
        POST "https://example.com/"
        // Some-Header
        Some_Header = "header value"
        form user: "usr1", senha: "senha11"
    }
}

result(req.response.data.title())
