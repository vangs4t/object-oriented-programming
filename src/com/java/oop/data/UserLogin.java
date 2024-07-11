package com.java.oop.data;

import com.java.oop.anotation.NotBlank;

public class UserLogin {
    @NotBlank
    private String username;
    @NotBlank
    private String password;

    public UserLogin(){

    }

    public UserLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
