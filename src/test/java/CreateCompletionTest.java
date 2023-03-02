import io.github.jetkai.chatgpt.ChatGPT;
import io.github.jetkai.chatgpt.api.data.completion.CompletionData;
import io.github.jetkai.chatgpt.api.data.completion.response.CompletionResponseData;
import io.github.jetkai.chatgpt.util.ApiKeyFileData;
import org.junit.jupiter.api.Test;

import static io.github.jetkai.chatgpt.util.ReadApiKeyFromFile.getApiKeyFromFile;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CreateCompletionTest {


    @Test
    void createCompletionTest() {
        ApiKeyFileData keyData = getApiKeyFromFile();

        assertNotNull(keyData);

        ChatGPT gpt = new ChatGPT(keyData.getApiKey(), keyData.getOrganization());

        CompletionData completion = new CompletionData();
        completion.setModel("text-davinci-003");
        completion.setPrompt("Say this is a test");
        completion.setMaxTokens(7);
        completion.setTemperature(0);
        completion.setTopP(1);
        completion.setN(1);
        completion.setStream(false);
        completion.setLogprobs(null);
        completion.setStop("\n");

        CompletionResponseData data = gpt.createCompletion(completion);  //You can call "data" to see the response

        assertNotNull(data.getModel());

    }

}
