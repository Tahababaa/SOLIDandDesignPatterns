package subsystem;

import model.AnalysisResult;
import model.DataRecord;
import model.PreprocessedData;

public class VisualizationService {

    public void visualize(
            PreprocessedData data,
            AnalysisResult result) {

        System.out.println("\n===== SALES VISUALIZATION =====");

        for (DataRecord record : data.getRecords()) {

            int bars = (int) (record.getSales() / 2000);

            System.out.print(
                    record.getProduct() + " | "
            );

            for (int i = 0; i < bars; i++) {
                System.out.print("#");
            }

            System.out.println(
                    " " + record.getSales()
            );
        }

        System.out.println("==============================");
        System.out.println(
                "Average Sales: "
                        + result.getAverageSales()
        );
    }
}