package org.gpt.api.data.image.variation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.nio.file.Path;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonSerialize
@SuppressWarnings("unused")
public class ImageVariationData {

    /*
     * image
     * string
     * Required
     *
     * The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
     */
    private Path image;

    /*
     * n
     * integer
     * Optional
     * Defaults to 1
     *
     * The number of images to generate. Must be between 1 and 10.
     */
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private int n;

    /*
     * size
     * string
     * Optional
     * Defaults to 1024x1024
     *
     * The size of the generated images. Must be one of 256x256, 512x512, or 1024x1024.
     */
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String size;

    /*
     * response_format
     * string
     * Optional
     * Defaults to url
     *
     * The format in which the generated images are returned. Must be one of url or b64_json.
     */
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    @JsonProperty("response_format")
    private String responseFormat;

    /*
     * user
     * string
     * Optional
     * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse.
     * Learn more. (https://platform.openai.com/docs/guides/safety-best-practices/end-user-ids)
     */
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private String user;

    public ImageVariationData() { }

    public void setResponseFormat(String responseFormat) {
        this.responseFormat = responseFormat;
    }

    public void setImage(Path image) {
        this.image = image;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getResponseFormat() {
        return responseFormat;
    }

    public String getUser() {
        return user;
    }

    public Path getImage() {
        return image;
    }

    public int getN() {
        return n;
    }

    public String getSize() {
        return size;
    }
}
