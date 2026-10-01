public class XmlProcessingStrategy implements FileProcessingStrategy{
    @Override
    public void process(String data) {
        System.out.println("XML processed! "+data);
    }
}
