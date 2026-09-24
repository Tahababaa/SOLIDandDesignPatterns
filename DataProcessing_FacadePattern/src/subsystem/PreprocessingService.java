package subsystem;

import model.DataRecord;
import model.PreprocessedData;
import model.ProcessingOptions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PreprocessingService {
    public PreprocessedData preprocess(List<DataRecord> rawData, ProcessingOptions options){
        System.out.println("Preprocessing Data...");

        List<DataRecord> processedData = new ArrayList<>(rawData);
        if(options.isRemoveMissingValues()){
            processedData.removeIf(
                    record -> record.getSales() == null
            );
        }
        if(options.isSortBySalesDescending()){
            processedData.sort(
                    Comparator.comparing(
                            DataRecord::getSales
                    ).reversed()
            );
        }
        return new PreprocessedData(processedData);

    }
}
