package com.taha.decorator;

public class NotificationServiceFactory {

    public static NotificationService createDefaultService() {

        NotificationService service =
                new BasicNotificationService();

        service =
                new PriorityNotificationDecorator(service);

        service =
                new LoggingNotificationDecorator(service);

        service =
                new MetricsNotificationDecorator(service);

        return service;
    }
}