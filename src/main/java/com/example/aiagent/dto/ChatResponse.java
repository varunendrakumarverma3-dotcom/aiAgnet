package com.example.aiagent.dto;

public class ChatResponse {


    private String question;
    private String answer;
    private long timestamp;

    public ChatResponse(String question, String answer) {
        this.question = question;
        this.answer = answer;
        this.timestamp = System.currentTimeMillis();

    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public long getTimestamp() {
        return timestamp;
    }
}
