package com.taha.decorator;

public class LoggingNotificationService implements NotificationService {

    private final NotificationService notificationService;
    public LoggingNotificationService(NotificationService notificationService){
        this.notificationService=notificationService;
    }
    @Override
    public void send(String recipient, String message) {
        System.out.println("[LOG] Sending notification to: "+recipient);
        notificationService.send(recipient,message);
        System.out.println("[LOG] Notification processing completed!");
    }
}
