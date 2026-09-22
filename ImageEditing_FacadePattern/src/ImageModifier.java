public class ImageModifier {

    public void adjustBrightness(Image image,int brightness){
        System.out.println("Adjusting Brightness to :"+brightness);
        image.setBrightness(brightness);
    }
}
