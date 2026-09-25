package com.taha.decorator;

public class PriorityNotificationDecorator implements NotificationService{

    private final NotificationService notificationService;

    public PriorityNotificationDecorator(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Override
    public void send(String recipient, String message) {
        String priorityMessage = "[High priority] "+message;
        notificationService.send(recipient,priorityMessage);
    }
}

