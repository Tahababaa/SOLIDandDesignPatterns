public class Image {

    private String path;
    private String filter;
    private int brightness;

    public Image(String path){
        this.path=path;
        this.filter="none";
        this.brightness = 0;
    }

    public String getPath(){
        return  this.path;
    }
    public String getFilter(){
        return this.filter;
    }
    public int getBrightness(){
        return this.brightness;
    }
    public void setFilter(String filter){
        this.filter=filter;

    }
    public void setBrightness(int brightness){
        this.brightness=brightness;
    }
}
