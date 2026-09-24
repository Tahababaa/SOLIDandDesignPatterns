package model;

public class AnalysisResult {

    private double totalSales;
    private double averageSales;
    private String highestSellingProduct;

    public AnalysisResult(
            double totalSales,
            double averageSales,
            String highestSellingProduct) {

        this.totalSales = totalSales;
        this.averageSales = averageSales;
        this.highestSellingProduct = highestSellingProduct;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public double getAverageSales() {
        return averageSales;
    }

    public String getHighestSellingProduct() {
        return highestSellingProduct;
    }

    @Override
    public String toString() {
        return "\nAnalysisResult{" +
                "\n  totalSales=" + totalSales +
                "\n  averageSales=" + averageSales +
                "\n  highestSellingProduct='" +
                highestSellingProduct + '\'' +
                "\n}";
    }
}