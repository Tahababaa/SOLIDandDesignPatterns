package subsystem;

import model.AnalysisResult;
import model.DataRecord;
import model.PreprocessedData;

import java.util.List;

public class AnalysisService {

    public AnalysisResult analyze(
            PreprocessedData preprocessedData) {

        System.out.println("Analyzing data...");

        List<DataRecord> records =
                preprocessedData.getRecords();

        double totalSales = 0;

        String highestSellingProduct = null;
        double highestSales = Double.MIN_VALUE;

        for (DataRecord record : records) {

            double sales = record.getSales();

            totalSales += sales;

            if (sales > highestSales) {
                highestSales = sales;
                highestSellingProduct =
                        record.getProduct();
            }
        }

        double averageSales =
                records.isEmpty()
                        ? 0
                        : totalSales / records.size();

        return new AnalysisResult(
                totalSales,
                averageSales,
                highestSellingProduct
        );
    }
}