public class FileProcessor {
    private FileProcessingStrategy fileProcessingStrategy;

    public FileProcessor(FileProcessingStrategy fileProcessingStrategy){
        this.fileProcessingStrategy=fileProcessingStrategy;
    }

    public void processFile(String data){
        fileProcessingStrategy.process(data);
    }
}
