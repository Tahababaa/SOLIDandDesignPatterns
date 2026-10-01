public class FileProcessor {
    private final FileProcessingStrategy fileProcessingStrategy;

    public FileProcessor(FileProcessingStrategy fileProcessingStrategy){
        this.fileProcessingStrategy=fileProcessingStrategy;
    }

    public ProcessingResult processFile(String data){
        return fileProcessingStrategy.process(data);
    }
}
