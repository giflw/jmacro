def foo() {
    attempt {
        todo("Just testing...")
    }
    pause 1, "Just chill =P"
    logger.warn "!BAR!" * 10
}
