def foo() {
    attempt(QUIET) {
        todo("Just testing...")
    }
    pause 1, "Just chill =P"
    logger.warn "!BAR!" * 10
}
