package com.myke.spring.springstudy.bean_definition.component_annotation;

import org.springframework.stereotype.Component;

@Component
public class EmailNotificator implements Notificator {

    public EmailNotificator() {
        System.out.println("Constructor called.");
    }

    @Override
    public void notifyUser(User user, String message) {
        System.out.printf("Notifying %s by the email %s: %s", user.getName(), user.getEmail(), message);
    }
}
