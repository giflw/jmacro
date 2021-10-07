package com.itquasar.multiverse.jmacro.core;

import com.itquasar.multiverse.jmacro.core.exceptions.FieldAlreadySetted;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;
import org.yaml.snakeyaml.introspector.Property;
import org.yaml.snakeyaml.nodes.NodeTuple;
import org.yaml.snakeyaml.nodes.Tag;
import org.yaml.snakeyaml.representer.Representer;

import java.util.Collections;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Data
@ToString(exclude = "source")
@NoArgsConstructor
public class Metadata {

    public static final Metadata EMPTY = new Metadata();

    private String name;
    private String version;
    private String author;
    private String description;

    private String filename;
    private String location;

    private String source;
    private Object result;

    private Map<String, ?> infos;

    private Metadata(String name, String version, String author, String description, Map<String, ?> infos) {
        this.name = name;
        this.version = version;
        this.author = author;
        this.description = description;
        this.infos = infos;
    }

    private Metadata copy() {
        return new Metadata(
            this.name, this.version, this.author, this.description, this.infos
        );
    }

    public String dump() {
        Representer representer = new Representer() {
            @Override
            protected NodeTuple representJavaBeanProperty(Object javaBean, Property property, Object propertyValue, Tag customTag) {
                // if value of property is null, ignore it.
                if (propertyValue == null) {
                    return null;
                } else {
                    return super.representJavaBeanProperty(javaBean, property, propertyValue, customTag);
                }
            }
        };
        return new Yaml(representer).dumpAsMap(this.copy());
    }

    public static Metadata parseMetadata(String script) {
        String metaRegex = "START METADATA([ \t]*[\r\n]+)(?<meta>.+)([\r\n]+)([ \t]*)END METADATA";
        Pattern pattern = Pattern.compile(metaRegex, Pattern.DOTALL);
        Matcher matcher = pattern.matcher(script);
        if (matcher.find()) {
            String metadata = matcher.group("meta").stripIndent();
            return Metadata.load(metadata);
        }
        return Metadata.EMPTY;
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

    public void setResult(Object result) {
        if (this.result == null) {
            this.result = result;
        } else {
            throw new FieldAlreadySetted("Field 'result' already setted");
        }
    }

}

