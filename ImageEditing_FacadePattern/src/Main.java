
public class Main {
    public static void main(String[] args) {

        // --------------------------------------------------
        // 1. Create the subsystem services
        // --------------------------------------------------

        ImageLoader imageLoader =
                new ImageLoader();

        FilterService filterService =
                new FilterService();

        ImageModifier imageModifier =
                new ImageModifier();

        ImageWriter imageWriter =
                new ImageWriter();

        AnalyticService analyticsService =
                new AnalyticService();


        // --------------------------------------------------
        // 2. Create the ImageEditingManager
        // --------------------------------------------------

        ImageEditingManager manager =
                new ImageEditingManager(
                        imageLoader,
                        filterService,
                        imageModifier,
                        imageWriter,
                        analyticsService
                );


        // --------------------------------------------------
        // 3. Ask the manager to edit an image
        // --------------------------------------------------

        manager.editImage(
                "vacation.jpg",
                "GRAYSCALE",
                25
        );

    }
}