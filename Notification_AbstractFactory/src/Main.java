
public class Main {
    public static void main(String[] args) {
        System.out.println("===== EMAIL NOTIFICATION =====");


        // --------------------------------------------------
        // STEP 1: Select the factory
        // --------------------------------------------------

        NotificationFactory factory = new EmailNotificationFactory();

        System.out.println(
                "Factory selected: "
                        + factory.notificationType()
        );


        // --------------------------------------------------
        // STEP 2: Create the template
        // --------------------------------------------------

        NotificationTemplate template =
                factory.createTemplate(
                        "Your order #12345 has been shipped."
                );

        System.out.println(
                "Template created: "
                        + template.getClass().getSimpleName()
        );


        // --------------------------------------------------
        // STEP 3: Create the notification
        // --------------------------------------------------

        Notification notification =
                factory.createNotification(
                        "taha@example.com",
                        "company@example.com",
                        template
                );

        System.out.println(
                "Notification created: "
                        + notification.getClass().getSimpleName()
        );


        // --------------------------------------------------
        // STEP 4: Create the sender
        // --------------------------------------------------

        NotificationSender sender =
                factory.createSender(notification);

        System.out.println(
                "Sender created: "
                        + sender.getClass().getSimpleName()
        );


        // --------------------------------------------------
        // STEP 5: Verify that everything belongs
        // to the same family
        // --------------------------------------------------

        System.out.println(
                "Factory type: "
                        + factory.notificationType()
        );

        System.out.println(
                "Notification type: "
                        + notification.notificationType()
        );

        System.out.println(
                "Sender type: "
                        + sender.notificationType()
        );


        // --------------------------------------------------
        // STEP 6: Send
        // --------------------------------------------------

        sender.send();
        // ==================================================
        // PUSH FAMILY
        // ==================================================

        System.out.println("\n========== PUSH ==========");

        NotificationFactory pushFactory =
                new PushNotificationFactory();

        System.out.println(
                "Factory: "
                        + pushFactory.notificationType()
        );


        NotificationTemplate pushTemplate =
                pushFactory.createTemplate(
                        "You have a new message."
                );

        System.out.println(
                "Template: "
                        + pushTemplate.getClass().getSimpleName()
        );


        Notification pushNotification =
                pushFactory.createNotification(
                        "device-123",
                        null,
                        pushTemplate
                );

        System.out.println(
                "Notification: "
                        + pushNotification.getClass().getSimpleName()
        );


        NotificationSender pushSender =
                pushFactory.createSender(
                        pushNotification
                );

        System.out.println(
                "Sender: "
                        + pushSender.getClass().getSimpleName()
        );


        System.out.println(
                "Notification type: "
                        + pushNotification.notificationType()
        );

        System.out.println(
                "Sender type: "
                        + pushSender.notificationType()
        );


        pushSender.send();
    }
}