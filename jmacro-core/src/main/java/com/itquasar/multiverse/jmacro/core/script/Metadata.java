package com.itquasar.multiverse.jmacro.core.script;

import com.itquasar.multiverse.jmacro.core.exception.FieldAlreadySet;
import com.itquasar.multiverse.jmacro.core.util.RepresenterNonNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.util.Collections;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@Data
@ToString(exclude = "source")
@NoArgsConstructor
public class Metadata {

    public static final Metadata EMPTY = new Metadata();

    private String name;
    private String version;
    private String author;
    private String description;

    private Map<String, ?> infos;

    private Metadata(String name, String version, String author, String description, Map<String, ?> infos) {
        this.name = name;
        this.version = version;
        this.author = author;
        this.description = description;
        this.infos = infos;
    }

    public static Metadata extractMetadata(String script) {
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

    private Metadata copy() {
        return new Metadata(
            this.name, this.version, this.author, this.description, this.infos
        );
    }

    public String dump() {
        return new Yaml(new RepresenterNonNull()).dumpAsMap(this.copy());
    }

    public void setName(String name) {
        if (this.name == null) {
            this.name = name;
        } else {
            throw new FieldAlreadySet("Field 'name' already setted");
        }
    }

    public void setVersion(String version) {
        if (this.version == null) {
            this.version = version;
        } else {
            throw new FieldAlreadySet("Field 'version' already setted");
        }
    }

    public void setAuthor(String author) {
        if (this.author == null) {
            this.author = author;
        } else {
            throw new FieldAlreadySet("Field 'author' already setted");
        }
    }

    public void setDescription(String description) {
        if (this.description == null) {
            this.description = description;
        } else {
            throw new FieldAlreadySet("Field 'description' already setted");
        }
    }

    public Map<String, ?> getInfos() {
        return this.infos != null ? this.infos : Collections.EMPTY_MAP;
    }

    public void setInfos(Map<String, ?> infos) {
        if (this.infos == null) {
            this.infos = Collections.unmodifiableMap(infos);
        } else {
            throw new FieldAlreadySet("Field 'infos' already setted");
        }
    }

    public String getBanner() {
        String infoString = this.getInfos().entrySet().stream()
            .map(entry -> "\n        " + entry.getKey() + ":\n            " + entry.getValue())
            .collect(Collectors.joining());
        return """
            Metadata:
                Name        = %s
                Version     = %s
                Author      = %s
                Description = %s
                Infos: %s
            """
            .formatted(
                this.name,
                this.version,
                this.author,
                this.description,
                infoString
            );
    }

}

