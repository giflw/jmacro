/*
START METADATA
    name: Base Example
    description: Just a metadata test
    author: I Myself
    version: 0.1.2
    infos:
      one: 1
      two: true
      three: tree
END METADATA
*/

timer.start()

logger.info "=" * 80

logger.info "NOW: ${moment.now()}"
logger.info "TODAY : ${moment.today()}"

timer.partial "moment"

logger.info "=" * 80

configuration { ->
    url = "http://example.com"
    count = 10
}

assert configuration.url == "http://example.com"
assert configuration.count == 10

logger.info "Configuration: ${configuration}"

timer.partial "configuration"

logger.info "=" * 80

include test: "test-include"
foo()
logger.info("Include worked")

logger.info "=" * 80

credentials {
    login = "John Doe"
    domain = "example.com"
}

assert credentials.login == "John Doe"
assert credentials.domain == "example.com"

logger.info "Credentials: ${credentials}"

timer.partial "credentials"

logger.info "=" * 80

__RESULT__("RESULT")

timer.partial "stop"
timer.log()
