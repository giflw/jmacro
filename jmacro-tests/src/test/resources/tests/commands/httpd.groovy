/*
START METADATA
name: HTTPD
infos:
    expectedResult: "HttpdConfig(port=6789, host=127.0.0.1, context=/, defaultContentType=text/plain, address=127.0.0.1:6789, url=http://127.0.0.1:6789/, uri=http://127.0.0.1:6789/)"
END METADATA
 */
def server = httpd {
    it.get('/foo', ctx -> ctx.result(it.config.toString()))
}

pause 1

def req = request {
    it.GET "${server.url}foo"
}

server.stop()

result(req.response.data)

