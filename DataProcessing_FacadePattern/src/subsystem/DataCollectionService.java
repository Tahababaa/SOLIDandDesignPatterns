package subsystem;

import model.DataCollectionParams;
import model.DataRecord;

import java.util.ArrayList;
import java.util.List;

public class DataCollectionService {

    public List<DataRecord> collect(DataCollectionParams params){
        System.out.println("Collecting data from: "
            +params.getSource());
        List<DataRecord> data = new ArrayList<>();

        data.add(new DataRecord("Laptop", 50000.0, 5));
        data.add(new DataRecord("Mouse", 5000.0, 20));
        data.add(new DataRecord("Keyboard", 8000.0, 10));
        data.add(new DataRecord("Monitor", null, 4));
        data.add(new DataRecord("Headphones", 12000.0, 8));

        if(data.size() > params.getMaxRecords()){
            return new ArrayList<>(data.subList(0,params.getMaxRecords())
            );
        }
        return data;
    }
}
