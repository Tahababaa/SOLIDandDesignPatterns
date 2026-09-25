package com.taha.decorator;

public class BasicNotificationService
        implements NotificationService {

    @Override
    public void send(String recipient, String message) {

        System.out.println(
                "Sending notification to "
                        + recipient
                        + ": "
                        + message
        );
    }
}