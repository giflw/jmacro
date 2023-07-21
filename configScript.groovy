import groovy.transform.CompileStatic
import org.codehaus.groovy.control.SourceUnit

import java.util.logging.Level
import java.util.logging.Logger

def logger = Logger.getLogger("groovy.configScript")
def log = { Object msg -> logger.log(Level.INFO, msg?.toString() ?: '<<NULL>>') }

boolean debug = false

String rootProjectPath = this.class.protectionDomain.codeSource.location.path
rootProjectPath = rootProjectPath.substring(0, rootProjectPath.lastIndexOf('/') + 1)

log rootProjectPath

def basenameValidator = { String basename ->
    // compile static if not tests/specs files
    boolean allowed = !(basename.endsWith('Spec') || basename.endsWith('Test'))
    if (debug && !allowed) {
        log "${basename}: switching to Compile Dynamic"
    }
    return allowed
}

def unitValidator = { SourceUnit sourceUnit ->
    String name = sourceUnit.name.replace('\\', '/')
    name = name.startsWith('/') ? name : "/${name}"
    name = name.replace(rootProjectPath, '')
    // compile static if not tests module or sources
    boolean allowed = !(name.contains('/src/test/') || name.contains("/jmacro-docs/"))
    if (debug && !allowed) {
        log "${name}: switching to Compile Dynamic"
    }
    return allowed
}

withConfig(configuration) {
    log "Extension: groovy"
    log "    Compile Static for non Specs/Tests"

    source(extension: 'groovy', basenameValidator: basenameValidator, unitValidator: unitValidator) {
        ast CompileStatic
    }

    // start 'org.some'
}
