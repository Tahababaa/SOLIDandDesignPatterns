public class FileProcessingStrategyFactory {

    public FileProcessingStrategy createStrategy(FileType type){
        switch(type)
        {
            case CSV:
                return new CsvProcessingStrategy();
            case XML:
                return new XmlProcessingStrategy();
            case JSON:
                return new JsonProcessingStrategy();
            case YAML:
                return new YamlProcessingStrategy();
            default:
                throw new IllegalArgumentException("CHECK TYPE");
        }
    }
}
