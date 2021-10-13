package com.itquasar.multiverse.jmacro.core.script;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Data
@EqualsAndHashCode(exclude = "running")
public class Script {

    private final Metadata metadata;
    private final String filename;
    private final String location;
    private final String source;

    private AtomicBoolean running = new AtomicBoolean(false);

    private final UUID uuid;

    public Script(Metadata metadata, String filename, String location, String source) {
        this.metadata = metadata;
        this.filename = filename;
        this.location = location;
        this.source = source;

        byte[] nameSpaceBytes = this.location.getBytes(StandardCharsets.UTF_8);
        byte[] nameBytes = (this.metadata.getName() + this.metadata.getVersion()).getBytes(StandardCharsets.UTF_8);
        byte[] result = new byte[nameSpaceBytes.length + nameBytes.length];
        System.arraycopy(nameSpaceBytes, 0, result, 0, nameSpaceBytes.length);
        System.arraycopy(nameBytes, 0, result, nameSpaceBytes.length, nameBytes.length);

        this.uuid = UUID.nameUUIDFromBytes(result);
    }

    public UUID getUUID() {
        return this.uuid;
    }
}
