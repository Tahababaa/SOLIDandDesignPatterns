package com.taha.decorator;

public class Main {
    public static void main(String[] args) {
        NotificationService service = new BasicNotificationService();
        service.send("Boss","It is done sir!");

        service = new PriorityNotificationDecorator(service);
        service.send("Boss","It is done sir!");

    }
}
