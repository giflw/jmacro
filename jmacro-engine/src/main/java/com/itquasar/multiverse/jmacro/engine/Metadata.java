package com.itquasar.multiverse.jmacro.engine;

import lombok.Data;
import lombok.ToString;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

@Data
@ToString(exclude = "source")
public class Metadata {

    public static final Metadata EMPTY = new Metadata();

    private String name;
    private String version;
    private String author;
    private String description;

    private String filename;
    private String location;
    private String source;

    private Map<String, ?> infos;

    public String dump() {
        return new Yaml().dumpAsMap(this);
    }

    public static Metadata load(String string) {
        return new Yaml(new Constructor(Metadata.class)).load(string);
    }

    public void setName(String name) {
        if (this.name == null) {
            this.name = name;
        } else {
            throw new FieldAlreadySetted("Field 'name' already setted");
        }
    }

    public void setVersion(String version) {
        if (this.version == null) {
            this.version = version;
        } else {
            throw new FieldAlreadySetted("Field 'version' already setted");
        }
    }

    public void setAuthor(String author) {
        if (this.author == null) {
            this.author = author;
        } else {
            throw new FieldAlreadySetted("Field 'author' already setted");
        }
    }

    public void setDescription(String description) {
        if (this.description == null) {
            this.description = description;
        } else {
            throw new FieldAlreadySetted("Field 'description' already setted");
        }
    }

    public void setFilename(String filename) {
        if (this.filename == null) {
            this.filename = filename;
        } else {
            throw new FieldAlreadySetted("Field 'filename' already setted");
        }
    }

    public void setLocation(String location) {
        if (this.location == null) {
            this.location = location;
        } else {
            throw new FieldAlreadySetted("Field 'location' already setted");
        }
    }

    public void setSource(String source) {
        if (this.source == null) {
            this.source = source;
        } else {
            throw new FieldAlreadySetted("Field 'source' already setted");
        }
    }

    public void setInfos(Map<String, ?> infos) {
        if (this.infos == null) {
            this.infos = Collections.unmodifiableMap(infos);
        } else {
            throw new FieldAlreadySetted("Field 'infos' already setted");
        }
    }
}
