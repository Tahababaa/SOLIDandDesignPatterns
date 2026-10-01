public class Main {
    public static void main(String[] args) {
        FileProcessingStrategy cs = new CsvProcessingStrategy();
        FileProcessor f = new FileProcessor(cs);
        f.processFile("Alice,25,Developer\n" +
                "Bob,30,Designer");

        FileProcessingStrategy js = new JsonProcessingStrategy();
        FileProcessor jfp = new FileProcessor(js);
        jfp.processFile("Boss man, what to do next");
    }
}
