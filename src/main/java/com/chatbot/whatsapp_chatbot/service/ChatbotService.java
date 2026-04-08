package com.chatbot.whatsapp_chatbot.service;

import org.springframework.stereotype.Service;

@Service
public class ChatbotService {

    public String getReply(String message) {

        if (message == null) {
            return "Invalid message";
        }

        message = message.trim().toLowerCase();

        if (message.equals("hi")) {
            return "Hello";
        } else if (message.equals("bye")) {
            return "Goodbye";
        } else {
            return "I don't understand";
        }
    }
}
