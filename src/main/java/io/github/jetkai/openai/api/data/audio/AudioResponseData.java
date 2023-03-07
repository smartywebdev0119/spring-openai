package io.github.jetkai.openai.api.data.audio;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.github.jetkai.openai.util.JacksonJsonDeserializer;

/**
 * AudioResponseData
 *
 * @author <a href="https://github.com/jetkai">Kai</a>
 * @version 1.1.0
 * {@code - 07/03/2023}
 * @since 1.0.0
 * {@code - 02/03/2023}
 */
@JsonSerialize
@SuppressWarnings("unused")
public class AudioResponseData {

    private String text;

    public AudioResponseData() { }

    public AudioResponseData setText(String text) {
        this.text = text;
        return this;
    }

    public String getText() {
        return text;
    }

    @JsonIgnore
    public String toJson() {
        return JacksonJsonDeserializer.valuesAsString(this);
    }

}
