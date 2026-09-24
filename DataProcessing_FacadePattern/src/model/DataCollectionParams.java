package model;

public class DataCollectionParams {

    private String source;
    private int maxRecords;

    public DataCollectionParams(String source, int maxRecords) {
        this.source = source;
        this.maxRecords = maxRecords;
    }

    public String getSource() {
        return source;
    }

    public int getMaxRecords() {
        return maxRecords;
    }
}
