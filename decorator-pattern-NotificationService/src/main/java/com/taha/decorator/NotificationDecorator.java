package com.taha.decorator;

public abstract class NotificationDecorator implements NotificationService{
    protected final NotificationService notificationService;
    protected NotificationDecorator(
            NotificationService notificationService) {

        this.notificationService = notificationService;
    }
}
