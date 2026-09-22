public class ImageLoader {

    public Image loadImage(String imagePath){
        System.out.println("Loading image: "+ imagePath);

        return new Image(imagePath);
    }
}
