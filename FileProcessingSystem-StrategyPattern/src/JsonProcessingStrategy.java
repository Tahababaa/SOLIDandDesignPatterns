public class JsonProcessingStrategy implements FileProcessingStrategy{

    @Override
    public void process(String data) {
        System.out.println("JSON processed: "+data);
    }
}
