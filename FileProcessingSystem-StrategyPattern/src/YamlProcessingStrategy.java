public class YamlProcessingStrategy implements FileProcessingStrategy{

    @Override
    public void process(String data) {
        System.out.println("Processing YAML data: "+data);
    }
}
