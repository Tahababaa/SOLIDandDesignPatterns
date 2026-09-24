package subsystem;

import model.DataRecord;
import model.PreprocessedData;
import model.ProcessingOptions;

import java.util.ArrayList;
import java.util.List;

public class PrecprocessingService {
    public PreprocessedData preprocess(List<DataRecord> rawData, ProcessingOptions options){
        System.out.println("Preprocessing Data...");

        List<DataRecord> processedData = new ArrayList<>(rawData);
        if(options.isRemoveMissingValues()){
            processedData.removeIf(
                    record -> record.getSales() == null
            );
        }
        if(options.isSortBySalesDescending()){
            
        }
    }
}
