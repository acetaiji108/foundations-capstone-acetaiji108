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
        //** Start of GET request algorithm
        /*
        Make a GET request for https://jservice.kenzie.academy/api/clues to return a list of questions
        */

        // Create a new HttpClient object
        HttpClient client = HttpClient.newHttpClient();
        String URL = "https://jservice.kenzie.academy/api/clues";
        URI uri = URI.create(URLString);

        // Create a new HttpRequest object
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(URLString)) // Set the URI of the request to the URLString
                .GET() // Set the method of the request to GET
                .build(); // Build the request


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
//** End of GET request algorithm



