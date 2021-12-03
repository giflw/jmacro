package com.itquasar.multiverse.jmacro.core.script;

import lombok.*;
import lombok.extern.log4j.Log4j2;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

@Data
@ToString(exclude = "source")
@EqualsAndHashCode(exclude = "running")
@Log4j2
public class Script {

    private final Metadata metadata;
    private final String path;
    private final String extension;
    private final URI location;
    private final String source;
    private final UUID uuid;
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private AtomicBoolean running = new AtomicBoolean(false);

    public Script(Metadata metadata, String path, String location, String source) {
        this(metadata, path, URI.create(location != null ? location : "memory://"), source);
    }

    public Script(Metadata metadata, String path, URI location, String source) {
        this.metadata = metadata;
        this.path = path;
        this.extension = this.path.substring(this.path.lastIndexOf(".") + 1);
        this.location = location;
        this.source = source;

        byte[] nameSpaceBytes = this.location.toString().getBytes(StandardCharsets.UTF_8);
        byte[] nameBytes = (this.metadata.getName() + this.metadata.getVersion()).getBytes(StandardCharsets.UTF_8);
        byte[] result = new byte[nameSpaceBytes.length + nameBytes.length];
        System.arraycopy(nameSpaceBytes, 0, result, 0, nameSpaceBytes.length);
        System.arraycopy(nameBytes, 0, result, nameSpaceBytes.length, nameBytes.length);

        this.uuid = UUID.nameUUIDFromBytes(result);
    }

    public UUID getUUID() {
        return this.uuid;
    }


    public <T> T run(Callable<T> callable) {
        if (this.running.compareAndSet(false, true)) {
            try {
                LOGGER.warn("Starting " + this.path);
                T call = callable.call();
                return call;
            } catch (Exception exception) {
                LOGGER.error("Error while running script " + getLocation(), exception);
            } finally {
                this.running.set(false);
                LOGGER.warn(this.path + " finished");
            }
        }
        throw new IllegalStateException("Already running");
    }
}
