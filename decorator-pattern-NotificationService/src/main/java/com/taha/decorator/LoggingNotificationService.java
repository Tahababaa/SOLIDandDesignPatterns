package com.taha.decorator;

public class LoggingNotificationService extends NotificationDecorator {

    public LoggingNotificationService(NotificationService notificationService){
        super(notificationService);
    }
    @Override
    public void send(String recipient, String message) {
        System.out.println("[LOG] Sending notification to: "+recipient);
        notificationService.send(recipient,message);
        System.out.println("[LOG] Notification processing completed!");
    }
}
