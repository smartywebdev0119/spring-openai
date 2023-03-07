package io.github.jetkai.openai.net.handlers;

import io.github.jetkai.openai.api.data.audio.AudioData;

import java.util.Map;

public class AudioDataHandler implements RequestDataHandler {
    public void populateMap(Object data, Map<Object, Object> map) {
        //Required
        ((AudioData) data).filePath().ifPresent(path -> map.put("file", path));
        //Required
        ((AudioData) data).model().ifPresent(s -> map.put("model", s));
        //Optional
        ((AudioData) data).prompt().ifPresent(strings -> map.put("prompt", strings));
        //Optional
        ((AudioData) data).temperature().ifPresent(aDouble -> map.put("temperature", aDouble));
        //Optional
        ((AudioData) data).language().ifPresent(s -> map.put("language", s));
        //Optional
        ((AudioData) data).responseFormat().ifPresent(s -> map.put("response_format", s));
    }
}
