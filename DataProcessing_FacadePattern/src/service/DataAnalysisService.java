package service;

import model.AnalysisResult;
import model.DataCollectionParams;
import model.ProcessingOptions;

public interface DataAnalysisService {

    AnalysisResult analyze(DataCollectionParams params, ProcessingOptions options);
}
