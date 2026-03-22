package com.example.aiagent.service;

import com.example.aiagent.client.AiClient;
import com.example.aiagent.entity.Chat;
import com.example.aiagent.memory.ChatMemory;
import com.example.aiagent.repository.ChatRepository;
import org.springframework.stereotype.Service;

@Service
public class AiService {

    private final AiClient aiClient ;
    private final ChatMemory chatMemory;
    private final ChatRepository chatRepository;




    public AiService(AiClient aiClient , ChatMemory chatMemory , ChatRepository chatRepository) {
        this.aiClient = aiClient;
        this.chatMemory = chatMemory;
        this.chatRepository = chatRepository;

    }

    public String getChat(String message){

        chatMemory.add("User :" + message);

        String context = chatMemory.getContext() + "\nAI:";

        String response = aiClient.generate(context);

        chatMemory.add("AI :" + response);

        Chat chat = new Chat(response, message);
        chatRepository.save(chat);

        return response;


    }


}
