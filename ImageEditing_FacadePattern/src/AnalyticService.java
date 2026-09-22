public class AnalyticService {
    public void store(Image image) {

        System.out.println(
                "Storing analytics for image: "
                        + image.getPath()
        );

        System.out.println(
                "Applied filter: "
                        + image.getFilter()
        );

        System.out.println(
                "Brightness: "
                        + image.getBrightness()
        );
    }
}
