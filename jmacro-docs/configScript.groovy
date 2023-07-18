import groovy.transform.CompileDynamic

import java.util.logging.Level
import java.util.logging.Logger

def logger = Logger.getLogger("groovy.configScript")
def log = { Object msg -> logger.log(Level.INFO, msg?.toString() ?: '<<NULL>>') }

withConfig(configuration) {
    log "Extension: groovy"
    log "    Compile Dynamic for all"

    source(extension: 'groovy') {
        ast CompileDynamic
    }
}
