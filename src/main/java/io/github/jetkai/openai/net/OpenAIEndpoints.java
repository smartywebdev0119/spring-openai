package io.github.jetkai.openai.net;

import java.net.URI;

public enum OpenAIEndpoints {

    GET_MODEL(URI.create("https://api.openai.com/v1/models")),
    GET_MODELS(URI.create("https://api.openai.com/v1/models")),
    CREATE_COMPLETION(URI.create("https://api.openai.com/v1/completions")),
    CREATE_CHAT_COMPLETION(URI.create("https://api.openai.com/v1/chat/completions")),
    CREATE_EDIT(URI.create("https://api.openai.com/v1/edits")),
    CREATE_IMAGE(URI.create("https://api.openai.com/v1/images/generations")),
    CREATE_IMAGE_EDIT(URI.create("https://api.openai.com/v1/images/edits")),
    CREATE_IMAGE_VARIATION(URI.create("https://api.openai.com/v1/images/variations")),
    CREATE_EMBEDDING(URI.create("https://api.openai.com/v1/embeddings")),
    CREATE_TRANSCRIPTION(URI.create("https://api.openai.com/v1/audio/transcriptions")),
    CREATE_TRANSLATION(URI.create("https://api.openai.com/v1/audio/transcriptions"));

    private final URI uri;

    OpenAIEndpoints(URI uri) {
        this.uri = uri;
    }

    public URI uri() {
        return uri;
    }

}