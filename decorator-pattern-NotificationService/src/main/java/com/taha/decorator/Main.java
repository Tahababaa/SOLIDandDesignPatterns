package com.taha.decorator;

public class Main {
    public static void main(String[] args) {
//        NotificationService service = new BasicNotificationService();
//        service.send("Boss","It is done sir!");
//
//        service = new PriorityNotificationDecorator(service);
//        service.send("Boss","It is done sir!");
//
//        service=new LoggingNotificationService(service);
//        service.send("Logger","Testing Logs boss!");


//        NotificationService service1 = new BasicNotificationService();
//        service1=new PriorityNotificationDecorator(new LoggingNotificationDecorator(service1));
//
//        service1.send("Boss","The Police is here!");
//
//        service1 = new MetricsNotificationDecorator(service1);
//        service1.send("Godfather","We are in trouble!");
//
//
//        NotificationService order = new BasicNotificationService();
//        order = new MetricsNotificationDecorator(new PriorityNotificationDecorator(order));
//
//        order.send("CustomerABC","Delivery partner is waiting outside your Gate!");

        NotificationService service = NotificationServiceFactory.createDefaultService();
        service.send("Boss","It's over!");
    }
}
