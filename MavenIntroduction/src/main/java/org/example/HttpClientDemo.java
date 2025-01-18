package org.example;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;

public class HttpClientDemo {
    public static void main(String[] args) throws IOException {
        try(CloseableHttpClient client = HttpClients.createDefault()){
            HttpGet request = new HttpGet("https://example.com/");

            try(CloseableHttpResponse response = client.execute(request)){
                System.out.println(response);
            }
        }
    }
}
