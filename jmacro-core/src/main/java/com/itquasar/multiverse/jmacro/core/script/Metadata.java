package com.itquasar.multiverse.jmacro.core.script;

import com.itquasar.multiverse.jmacro.core.util.RepresenterNonNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.yaml.snakeyaml.LoaderOptions;
import org.yaml.snakeyaml.TypeDescription;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.SafeConstructor;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@Data
@ToString()
@NoArgsConstructor
public class Metadata {

    public static final Metadata EMPTY = new Metadata();

    private String name = "";
    private String version = "";
    private String author = "";
    private String description = "";

    private Map<String, ?> infos = new HashMap<>();

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
        SafeConstructor constructor = new SafeConstructor(new LoaderOptions());
        constructor.addTypeDescription(new TypeDescription(Metadata.class));
        return new Yaml(constructor).load(string);
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
        this.name = name;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, ?> getInfos() {
        return this.infos != null ? this.infos : Collections.EMPTY_MAP;
    }

    public void setInfos(Map<String, ?> infos) {
        this.infos = Collections.unmodifiableMap(infos);
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
                this.name != null ? this.name : "",
                this.version != null ? this.version : "",
                this.author != null ? this.author : "",
                this.description != null ? this.description : "",
                infoString
            );
    }

}
