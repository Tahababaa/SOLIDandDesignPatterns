public class YamlProcessingStrategy implements FileProcessingStrategy{

    @Override
    public ProcessingResult process(String data) {
        return new ProcessingResult(true, "YAML data processed successfully!");
    }
}
