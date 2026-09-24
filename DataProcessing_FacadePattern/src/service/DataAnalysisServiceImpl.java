package service;

import facade.DataAnalysisFacade;
import model.AnalysisResult;
import model.DataCollectionParams;
import model.ProcessingOptions;

public class DataAnalysisServiceImpl implements DataAnalysisService {
    private final DataAnalysisFacade dataAnalysisFacade;

    public DataAnalysisServiceImpl(DataAnalysisFacade dataAnalysisFacade){
        this.dataAnalysisFacade=dataAnalysisFacade;
    }

    @Override
    public AnalysisResult analyze(
            DataCollectionParams params,
            ProcessingOptions options
    ){
        System.out.println("Starting data Analysis...");

        return dataAnalysisFacade.performAnalysis(params,options);
    }
}
