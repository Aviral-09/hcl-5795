package com.Aviral.Springdemo.notificationService;

import org.springframework.stereotype.Component;

@Component
//@Primary
public class EmailService implements NotificationService {

    @Override
    public void sendMsg(String msg) {
        System.out.println("Email service, " + msg);
    }
}
