package com.itquasar.multiverse.jmacro.core.script;

import lombok.*;
import lombok.extern.log4j.Log4j2;

import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

@Data
@EqualsAndHashCode(exclude = "running")
@Log4j2
public class Script {

    private final Metadata metadata;
    private final String filename;
    private final String extension;
    private final String location;
    private final String source;
    private final UUID uuid;
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private AtomicBoolean running = new AtomicBoolean(false);

    public Script(Metadata metadata, String filename, String location, String source) {
        this.metadata = metadata;
        this.filename = filename;
        this.extension = this.filename.substring(this.filename.lastIndexOf(".") + 1);
        this.location = location;
        this.source = source;

        byte[] nameSpaceBytes = (this.location != null ? this.location : "memory://").getBytes(StandardCharsets.UTF_8);
        byte[] nameBytes = (this.metadata.getName() + this.metadata.getVersion()).getBytes(StandardCharsets.UTF_8);
        byte[] result = new byte[nameSpaceBytes.length + nameBytes.length];
        System.arraycopy(nameSpaceBytes, 0, result, 0, nameSpaceBytes.length);
        System.arraycopy(nameBytes, 0, result, nameSpaceBytes.length, nameBytes.length);

        this.uuid = UUID.nameUUIDFromBytes(result);
    }

    public UUID getUUID() {
        return this.uuid;
    }

    @SneakyThrows
    public <T> T run(Callable<T> callable) {
        if (this.running.compareAndSet(false, true)) {
            try {
                LOGGER.warn("Starting script " + this.filename);
                T call = callable.call();
                return call;
            } finally {
                this.running.set(false);
                LOGGER.warn("Script " + this.filename + " stopped");
            }
        } else {
            throw new IllegalStateException("Already running");
        }
    }
}
