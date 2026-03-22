package com.example.aiagent.client;

import org.springframework.http.*;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Component
public class AiClient {

//    private final RestTemplate restTemplate = new RestTemplate();
private final RestTemplate restTemplate;

    public AiClient() {
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
        factory.setConnectTimeout(60000);
        factory.setReadTimeout(60000);
        this.restTemplate = new RestTemplate(factory);
    }
    public String generate(String message) {

        String url = "http://localhost:11434/api/chat";

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("model", "phi3");

        List<Map<String, String>> messages = new ArrayList<>();

        Map<String, String> userMessage = new HashMap<>();
        userMessage.put("role", "user");
        userMessage.put("content", message);

        messages.add(userMessage);

        requestBody.put("messages", messages);
        requestBody.put("stream", false);

        HttpEntity<Map<String, Object>> entity =
                new HttpEntity<>(requestBody, headers);

        try {

            ResponseEntity<Map> response =
                    restTemplate.postForEntity(url, entity, Map.class);

            Map<String, Object> body = response.getBody();

            if (body == null) {
                return "AI returned empty response";
            }

            System.out.println("Ollama response: " + body);

            Map<String, Object> messageObj = (Map<String, Object>) body.get("message");

            if (messageObj == null) {
                return "AI message missing";
            }

            Object content = messageObj.get("content");

            if (content == null) {
                return "AI returned no content";
            }

            return content.toString();
        } catch (Exception e) {

            e.printStackTrace();
            return "AI service error: " + e.getMessage();
        }
    }
}