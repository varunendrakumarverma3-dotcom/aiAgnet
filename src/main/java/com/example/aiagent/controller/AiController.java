package com.example.aiagent.controller;

import com.example.aiagent.dto.ChatResponse;
import com.example.aiagent.entity.Chat;
import com.example.aiagent.memory.ChatMemory;
import com.example.aiagent.repository.ChatRepository;
import com.example.aiagent.service.AiService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins="http://localhost:3000")
public class AiController {

    private final AiService aiService;
    private final ChatMemory chatMemory;
    private final ChatRepository chatRepository;


    public AiController(AiService aiService , ChatMemory chatMemory , ChatRepository chatRepository) {
        this.aiService = aiService;
        this.chatMemory = chatMemory;
        this.chatRepository = chatRepository;
    }

    @GetMapping("/chat")
    public ChatResponse chat(@RequestParam String message) {
        String answer = aiService.getChat(message);
        return new ChatResponse(message, answer);
    }


    @PostMapping("/reset")
    public String reset(){
            chatMemory.clear();

            return("Conversation cleared.");


    }

    @GetMapping("/history")
    public List<Chat> getHistory(){
        return chatRepository.findAll();
    }
}
