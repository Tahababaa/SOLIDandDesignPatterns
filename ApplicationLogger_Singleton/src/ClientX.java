import java.util.List;

public class ClientX {
    public static void main(String[] args) {
        // Get the Singleton instance twice
        EnumLogger logger1 = EnumLogger.INSTANCE;
        EnumLogger logger2 = EnumLogger.INSTANCE;

        // 1. Check whether both references point to the same object
        System.out.println("Same instance: " + (logger1 == logger2));

        // 2. Log messages using both references
        logger1.log("Application started");
        logger2.log("User logged in");
        logger1.log("Processing request");

        // 3. Check stored logs
        System.out.println("\nLogs:");
        for (String log : logger1.getLogs()) {
            System.out.println(log);
        }

        // 4. Verify that the returned list is a defensive copy
        List<String> logs = logger1.getLogs();
        logs.clear();

        System.out.println("\nLogs after clearing returned list:");
        for (String log : logger1.getLogs()) {
            System.out.println(log);

        }

        //--------- APPLICATION LOGGER ////////////
        ApplicationLogger logger3 = ApplicationLogger.getInstance();

        // Log messages
        logger3.log("-DCL Application started");
        logger3.log("-DCL User logged in");

        // Get the same Singleton instance again
        ApplicationLogger logger4 = ApplicationLogger.getInstance();

        logger3.log("-DCL Processing request");

        // Check whether both references point to the same object
        System.out.println("\nSame instance: " + (logger3 == logger4));

        // Display logs
        System.out.println("\nLogs:-DCL");

        List<String> logs2 = logger3.getLogs();

        for (String log : logs) {
            System.out.println(log);
        }

        // Test defensive copy
        System.out.println("\nTesting defensive copy...-DCL");

        logs.clear();

        System.out.println("Size of returned list after clear: " + logs.size());
        System.out.println("Size of logger's actual logs: "
                + logger3.getLogs().size());
    }

}
