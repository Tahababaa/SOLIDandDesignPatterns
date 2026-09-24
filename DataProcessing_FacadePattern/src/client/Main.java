package client;

import facade.DataAnalysisFacade;
import model.AnalysisResult;
import model.DataCollectionParams;
import model.ProcessingOptions;
import service.DataAnalysisService;
import service.DataAnalysisServiceImpl;
import subsystem.AnalysisService;
import subsystem.DataCollectionService;
import subsystem.PreprocessingService;
import subsystem.VisualizationService;

public class Main {
    public static void main(String[] args) {
        // Create subsystem services
        DataCollectionService dataCollectionService =
                new DataCollectionService();

        PreprocessingService preprocessingService =
                new PreprocessingService();

        AnalysisService analysisService =
                new AnalysisService();

        VisualizationService visualizationService =
                new VisualizationService();
//Creating FAcade
        DataAnalysisFacade facade =
                new DataAnalysisFacade(
                        dataCollectionService,
                        preprocessingService,
                        analysisService,
                        visualizationService
                );

//Creating Application Service
        DataAnalysisService dataAnalysisService = new DataAnalysisServiceImpl(facade);

// Collection Parameters
        DataCollectionParams params = new DataCollectionParams("Database",10);

// Processing options
        ProcessingOptions options =
                new ProcessingOptions(
                        true,
                        true,
                        true
                );

        // Client talks ONLY to DataAnalysisService
        AnalysisResult result =
                dataAnalysisService.analyze(
                        params,
                        options
                );
        System.out.println(result);

    }
}