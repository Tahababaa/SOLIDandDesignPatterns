public class CsvProcessingStrategy implements FileProcessingStrategy{
    @Override
    public void process(String data) {
        System.out.println("Processing CSV data: "+data);
    }
}
