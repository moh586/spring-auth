package com.joneidi.auth_api.dtos;

public class RegisterUserDto {
    private String email;
    
    private String password;
    
    private String fullName;


    
    // getters and setters here...

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
