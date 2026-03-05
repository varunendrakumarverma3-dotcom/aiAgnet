package com.example.aiagent.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobleExceptionHandler {

    public ResponseEntity<?> handleException(Exception ex){
        Map<String , Object> error = new HashMap<>();
        error.put("error", "Something went wrong");
        error.put("message" , ex.getMessage());
        error.put("timestamp", System.currentTimeMillis());

        return ResponseEntity.internalServerError().body(error);
    }

}
