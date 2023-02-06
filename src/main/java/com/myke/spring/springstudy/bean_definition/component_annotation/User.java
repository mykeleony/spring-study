package com.myke.spring.springstudy.bean_definition.component_annotation;

public class User {

    private String name;
    private String email;
    private boolean isActive = false;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return isActive;
    }

    public void activate() {
        isActive = true;
    }
}
