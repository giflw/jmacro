/*
START METADATA
name: REQUEST
infos:
    expectedResult: "header value#usr1:senha11"
END METADATA
 */

def server = httpd {
    it.post('/foo', ctx -> ctx.result(ctx.header("Some-Header") + "#" + ctx.formParam("user") + ":" + ctx.formParam("senha")))
}

server.waitBeReady()

def req = request {
    it.with {
        POST "http://localhost:6789/foo"
        // Some-Header
        Some_Header = "header value"
        form user: "usr1", senha: "senha11"
    }
}

server.stop()

result(req.response.data)
