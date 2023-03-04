package io.github.jetkai.openai.api;

import io.github.jetkai.openai.OpenAI;
import io.github.jetkai.openai.net.OpenAIEndpoints;

import java.net.http.HttpResponse;
import java.util.concurrent.atomic.AtomicReference;

/**
 * ApiInterface
 *
 * @author <a href="https://github.com/jetkai">Kai</a>
 * @version 1.0.0
 * @created 02/03/2023
 * @last-update 03/03/2023
 */
public interface ApiInterface {

    AtomicReference<HttpResponse<String>> response = null;

    OpenAI openAI = null;

    Object data = null;

    OpenAIEndpoints endpoint = null;

    @SuppressWarnings("unused")
    private void initialize() { }

    Object reinitialize();

    @SuppressWarnings("unused")
    private void handleHttpResponse() { }

    @SuppressWarnings("unused")
    private void parseData() { }

    @SuppressWarnings("unused")
    private void deserialize() { }

    String asJson();

    OpenAIEndpoints getEndpoint();

    AtomicReference<HttpResponse<String>> getHttpResponse();

    String getRawJsonResponse();

    Object getRequestData();

}
