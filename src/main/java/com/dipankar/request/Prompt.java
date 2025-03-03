package com.dipankar.request;

import lombok.Data;


public class Prompt {
    private String prompt;

    public Prompt() {
    }

    public Prompt(String prompt) {
        this.prompt = prompt;
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }
}
