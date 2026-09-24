package model;

import java.util.List;

public class PreprocessedData {

    private List<DataRecord> records;

    public PreprocessedData(List<DataRecord> records){
        this.records = records;
    }
    public List<DataRecord> getRecords(){
        return records;
    }
}
