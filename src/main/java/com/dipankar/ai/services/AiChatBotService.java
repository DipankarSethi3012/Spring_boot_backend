package com.dipankar.ai.services;

import com.dipankar.exception.ProductException;
import com.dipankar.response.ApiResponse;

public interface AiChatBotService {

    ApiResponse aiChatBot(String prompt,Long productId,Long userId) throws ProductException;
}
