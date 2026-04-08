package com.chatbot.whatsapp_chatbot.controller;

import com.chatbot.whatsapp_chatbot.model.MessageRequest;
import com.chatbot.whatsapp_chatbot.model.MessageResponse;
import com.chatbot.whatsapp_chatbot.service.ChatbotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class ChatbotController {

    private static final Logger logger = LoggerFactory.getLogger(ChatbotController.class);

    @Autowired
    private ChatbotService chatbotService;

    @PostMapping("/webhook")
    public MessageResponse receiveMessage(@RequestBody MessageRequest request) {

        String userMessage = request.getMessage();

        // 🔥 Logging
        logger.info("Received message: {}", userMessage);

        String reply = chatbotService.getReply(userMessage);

        return new MessageResponse(reply);
    }
}