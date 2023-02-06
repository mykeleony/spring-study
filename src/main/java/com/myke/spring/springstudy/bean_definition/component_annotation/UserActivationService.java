package com.myke.spring.springstudy.bean_definition.component_annotation;

import org.springframework.stereotype.Component;

@Component
public class UserActivationService {

    private final Notificator notificator;

    public UserActivationService(Notificator notificator) {
        this.notificator = notificator;

        System.out.println("UserActivationService: " + notificator);
    }

    public void activate(User user) {
        user.activate();

        notificator.notifyUser(user, "Your subscription has been successfully created!");
    }

}
