package io.github.jetkai.openai.api.data.embedding;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.github.jetkai.openai.util.JacksonJsonDeserializer;

import java.util.List;

/**
 * EmbeddingResponseData
 *
 * @author <a href="https://github.com/jetkai">Kai</a>
 * @version 1.0.0
 * @created 02/03/2023
 * @last-update 03/03/2023
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonSerialize
@SuppressWarnings("unused")
public class EmbeddingResponseData {

    private String object;
    private List<EmbeddingResponseDataBlock> data;

    private String model;
    private EmbeddingResponseUsage usage;

    public EmbeddingResponseData() { }

    public void setModel(String model) {
        this.model = model;
    }

    public void setData(List<EmbeddingResponseDataBlock> data) {
        this.data = data;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public void setUsage(EmbeddingResponseUsage usage) {
        this.usage = usage;
    }

    public String getModel() {
        return model;
    }

    public String getObject() {
        return object;
    }

    public List<EmbeddingResponseDataBlock> getData() {
        return data;
    }

    public EmbeddingResponseUsage getUsage() {
        return usage;
    }

    @JsonIgnore
    public String toJson() {
        return JacksonJsonDeserializer.valuesAsString(this);
    }

}
