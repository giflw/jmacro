//import org.codehaus.groovy.control.customizers.ImportCustomizer
import java.util.logging.Level;
import java.util.logging.Logger

def logger = Logger.getLogger("groovy.configScript")
def log = { String msg -> logger.log(Level.INFO, msg) }

log "Configuring groovy compiler"

withConfig(configuration) {
    // new ImportCustomizer().addImports('org.some.*')
    // log "AST:"
    // log "    CompileStatic"
    // ast groovy.transform.CompileStatic

    source(extension: 'groovy') {
        log "Extension: groovy"
        log "    Compile Static by default"
        ast groovy.transform.CompileStatic
    }

    // start 'org.some'
}
