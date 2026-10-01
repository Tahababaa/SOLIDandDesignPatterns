public class FileProcessingStrategyFactory {

    public FileProcessingStrategy selectStrategy(FileType type){
        switch(type)
        {
            case CSV:
                return new CsvProcessingStrategy();
            case XML:
                return new XmlProcessingStrategy();
            case JSON:
                return new JsonProcessingStrategy();
            default:
                throw new IllegalArgumentException("CHECK TYPE");
        }
    }
}
