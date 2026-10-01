public class CsvProcessingStrategy implements FileProcessingStrategy{
    @Override
    public ProcessingResult process(String data) {
        return new ProcessingResult(true, "JSON data processed successfully!");
    }}
