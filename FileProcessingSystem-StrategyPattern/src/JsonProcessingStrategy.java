public class JsonProcessingStrategy implements FileProcessingStrategy{

    @Override
    public ProcessingResult process(String data) {

        return new ProcessingResult(true,"JSON processing successful!");
    }
}
