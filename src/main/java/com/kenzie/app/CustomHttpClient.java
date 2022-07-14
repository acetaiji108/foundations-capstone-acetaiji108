package com.kenzie.app;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.IllegalFormatConversionException;


public class CustomHttpClient {

    //TODO: Write sendGET method that takes URL and returns response
    public static String sendGET(String URLString) throws IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();
        String URL = "https://jservice.kenzie.academy/api/clues";
        URI uri = URI.create(URLString);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(URLString))
                .GET()
                .build();

        try {

            HttpResponse<String> httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());
            int statusCode = httpResponse.statusCode();
            if (statusCode == 200) {
                return httpResponse.body();
            } else {
                return String.format("Get request failed with status code %d", statusCode);
            }
        } catch (IOException | InterruptedException e) {
            return String.format("Get request failed with exception %s", e.getMessage());
        } catch (IllegalFormatConversionException e) {
            return String.format("Get request failed with exception %s", e.getMessage());
        }
    }

}