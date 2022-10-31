package com.example.lastdemo.member;

public class MessageDTO {

    private String message;
    private boolean check;

    public MessageDTO(String message, boolean check){
        this.message = message;
        this.check=check;
    }

    public String getMessage() {
        return message;
    }

    public boolean isCheck() {
        return check;
    }

}
