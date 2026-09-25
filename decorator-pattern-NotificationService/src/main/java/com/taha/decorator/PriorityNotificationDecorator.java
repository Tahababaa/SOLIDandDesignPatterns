package com.taha.decorator;

public class PriorityNotificationDecorator extends NotificationDecorator{


    public PriorityNotificationDecorator(NotificationService notificationService) {
        super(notificationService);
    }

    @Override
    public void send(String recipient, String message) {
        String priorityMessage = "[High priority] "+message;
        notificationService.send(recipient,priorityMessage);
    }
}

