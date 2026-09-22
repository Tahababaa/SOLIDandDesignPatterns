public class ImageEditingFacade {
    private final ImageLoader imageLoader;
    private final ImageWriter imageWriter;
    private final FilterService filterService;
    private final ImageModifier imageModifier;
    private final AnalyticService analyticService;

    public ImageEditingFacade(ImageLoader imageLoader,FilterService filterService,ImageModifier imageModifier, ImageWriter imageWriter, AnalyticService analyticService){
        this.imageLoader=imageLoader;
        this.filterService=filterService;
        this.imageModifier =imageModifier;
        this.imageWriter = imageWriter;
        this.analyticService=analyticService;
    }
    public void editImage(String imagePath, String filter, int brightness){
        Image image = new Image(imagePath);
        filterService.applyFilter(image,filter);
        imageModifier.adjustBrightness(image,brightness);
        imageWriter.saveImage(image);
        analyticService.store(image);

    }
}
