package com.example.demo;

public class AuthBody {

    private String authCode;

    public AuthBody() {
    }

    public AuthBody(String authCode) {
        this.authCode = authCode;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    @Override
    public String toString() {
        return "AuthBody{" +
                "authCode='" + authCode + '\'' +
                '}';
    }
}
