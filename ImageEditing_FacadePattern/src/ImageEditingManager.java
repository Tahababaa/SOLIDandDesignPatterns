public class ImageEditingManager {
    private final ImageEditingFacade facade;

    public ImageEditingManager(ImageLoader imageLoader,
                               FilterService filterService,
                               ImageModifier imageModifier,
                               ImageWriter imageWriter,
                               AnalyticService analyticService){
        this.facade = new ImageEditingFacade(imageLoader,filterService,imageModifier,imageWriter,analyticService);
    }
    public void editImage(String imagePath,String filter, int brightness){
        facade.editImage(imagePath,filter,brightness);
    }
}
