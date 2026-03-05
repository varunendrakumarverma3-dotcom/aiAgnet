package com.example.aiagent.memory;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ChatMemory {

    private final List<String> history = new ArrayList<>();

    public void add(String message){
        history.add(message);
    }
    public String getContext(){
        return String.join("\n" , history);


    }

    public void clear(){
        history.clear();
    }


}
