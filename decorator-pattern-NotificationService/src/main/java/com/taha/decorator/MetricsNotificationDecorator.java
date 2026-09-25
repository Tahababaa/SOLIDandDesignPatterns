package com.taha.decorator;

public class MetricsNotificationDecorator extends NotificationDecorator{


    protected MetricsNotificationDecorator(NotificationService notificationService) {
        super(notificationService);
    }

    @Override
    public void send(String recipient, String message) {
        long startTime = System.nanoTime();
        notificationService.send(recipient,message);
        long endTime = System.nanoTime();

        long duration = endTime-startTime;

        System.out.println(
                "[METRICS] Notification took "
                +duration
                +" Nanoseconds to be sent!"
        );

    }
}
