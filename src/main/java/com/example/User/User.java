package com.example.User;


public class User {
    private String email;
    private String name;
    private boolean verified;

    public User(String email, String name) {
        this.email = email;
        this.name = name;
        this.verified = false;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }
}