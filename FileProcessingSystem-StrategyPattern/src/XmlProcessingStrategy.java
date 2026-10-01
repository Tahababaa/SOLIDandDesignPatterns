public class XmlProcessingStrategy implements FileProcessingStrategy{
    @Override
    public ProcessingResult process(String data) {
        return new ProcessingResult(true, "XML data processed successfully!");
    }
}
