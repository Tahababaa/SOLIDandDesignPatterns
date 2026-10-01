public class Main {
    public static void main(String[] args) {
        FileProcessingStrategy csvStrategy
                = new CsvProcessingStrategy();
//        FileProcessor csvProcessor = new FileProcessor(csvStrategy
//        );
//        csvProcessor.processFile("Alice,25,Developer\n" +
//                "Bob,30,Designer");
//
//        FileProcessingStrategy jsonStrategy = new JsonProcessingStrategy();
//        FileProcessor jsonProcessor = new FileProcessor(jsonStrategy);
//        jsonProcessor.processFile("Boss man, what to do next");
//
//        FileProcessingStrategy xmlStrategy = new XmlProcessingStrategy();
//        FileProcessor xmlFp = new FileProcessor(xmlStrategy);
//        xmlFp.processFile("/Docker/");

        FileProcessingStrategyFactory factory = new FileProcessingStrategyFactory();
        FileProcessor fileProcessor= new FileProcessor(factory.createStrategy(FileType.CSV));
        fileProcessor.processFile("H,C,V,T");
        FileProcessor fileProcessorXml= new FileProcessor(factory.createStrategy(FileType.XML));
        fileProcessorXml.processFile("/FLEX/");
        FileProcessor fileProcessorJson= new FileProcessor(factory.createStrategy(FileType.JSON));
        fileProcessorJson.processFile("Name:Boss \n Task: Conquer");
        FileProcessor fileProcessorYaml= new FileProcessor(factory.createStrategy(FileType.YAML));
        fileProcessorYaml.processFile("Name:Duck \n Task: Swim");











    }
}
