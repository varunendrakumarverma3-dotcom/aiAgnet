package com.example.aiagent.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Chat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "Text")
    private String question;

    @Column(columnDefinition = "Text")
    private String answer;

    private LocalDateTime timestamp;

    public Chat(){}

    public Chat(String question ,
                String answer){
        this.question = question;
        this.answer  =answer;
        this.timestamp = LocalDateTime.now();

    }

    public Long getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
