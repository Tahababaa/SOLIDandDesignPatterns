public class ImageWriter {

    public void saveImage(Image image){
        System.out.println("Saving Image: "+image.getPath());
        System.out.println("Filter: "+image.getFilter());
        System.out.println("Brightness: "+image.getBrightness());
    }
}
