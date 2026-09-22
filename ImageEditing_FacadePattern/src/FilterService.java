public class FilterService {

    public void applyFilter(Image image, String filterType){
        System.out.println("Applying filter: "+filterType);
        image.setFilter(filterType);
    }
}
