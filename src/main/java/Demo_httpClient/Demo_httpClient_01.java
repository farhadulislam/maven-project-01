package Demo_httpClient;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class Demo_httpClient_01 {

    private static final String API_ENDPOINT = "https://jsonplaceholder.typicode.com/posts";


    public static void main(String[] args) throws JsonProcessingException {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .header("accept", "application/json")
                .uri(URI.create(API_ENDPOINT))
                .build();
        HttpResponse<String> response;

        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //parse JSON into object

        ObjectMapper objectMapper = new ObjectMapper();

        List<Data> data = objectMapper.readValue(response.body(), new TypeReference < List < Data >>() {});
        data.forEach(System.out::println);

    }
}
