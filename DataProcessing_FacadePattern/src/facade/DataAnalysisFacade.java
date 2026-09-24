package facade;

import model.*;
import subsystem.AnalysisService;
import subsystem.DataCollectionService;
import subsystem.PreprocessingService;
import subsystem.VisualizationService;

import java.util.List;

public class DataAnalysisFacade {

    private final DataCollectionService dataCollectionService;
    private final PreprocessingService preprocessingService;
    private final AnalysisService analysisService;
    private final VisualizationService visualizationService;

    public DataAnalysisFacade(
            DataCollectionService dataCollectionService,
            PreprocessingService preprocessingService,
            AnalysisService analysisService,
            VisualizationService visualizationService) {

        this.dataCollectionService = dataCollectionService;
        this.preprocessingService = preprocessingService;
        this.analysisService = analysisService;
        this.visualizationService = visualizationService;
    }
    public AnalysisResult performAnalysis(
            DataCollectionParams params,
            ProcessingOptions options){
        //Collection of Data:
        List<DataRecord> rawData =dataCollectionService.collect(params);

        //Preprocessing Data
        PreprocessedData preprocessedData =
                preprocessingService.preprocess(rawData,options);

        //Analyzing Data
        AnalysisResult result = analysisService.analyze(preprocessedData);

        //Visualization
        if(options.isShowVisualization()){
            visualizationService.visualize(preprocessedData,result);
        }

        return result;
    }

}
